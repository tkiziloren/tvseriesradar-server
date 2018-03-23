package com.tvseriesradar.job;

import com.tvseriesradar.dto.main.TvSeries;
import com.tvseriesradar.dto.main.TvSeriesSummary;
import com.tvseriesradar.finder.TvSeriesFinder;
import com.tvseriesradar.repository.TvSeriesRepository;
import com.tvseriesradar.repository.TvSeriesSummaryRepository;
import com.tvseriesradar.util.Constants;
import com.tvseriesradar.util.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by tkiziloren on 04/07/2017.
 */

@Component
public class TvSeriesCrawler {

    static final Logger logger = LoggerFactory.getLogger(TvSeriesCrawler.class);

    @Autowired
    private Environment environment;

    @Autowired
    TvSeriesSummaryRepository tvSeriesSummaryRepository;

    @Autowired
    private TvSeriesRepository tvSeriesRepository;

    @Autowired
    TvSeriesFinder tvSeriesFinder;


    @Scheduled(cron = "0 * * * * *")
    public void crawl() {

        String crawlEnabled = environment.getProperty("com.tvseriesradar.crawl.enabled");

        if(!"true".equals(crawlEnabled)){
            logger.debug("Crawling is disabled.");
            return;
        }

        logger.info("Starting for crawling tv series.");

        insertInitialData();

        logger.debug("Reading 30 not crawled tv series from db...");
        List<TvSeriesSummary> tvSeriesSummaryList = tvSeriesSummaryRepository.findTop30ByLastUpdateDateIsNull();

        if(tvSeriesSummaryList != null){
            logger.info(tvSeriesSummaryList.size() + " uncrawled tv series are beginning to crawl..");
            logger.info(tvSeriesSummaryList.toString());
        }


        tvSeriesSummaryList.stream().forEach((item) -> {
            try {
                if(item.getLastUpdateDate() == null){
                    TvSeries tvSeries = tvSeriesFinder.find(item.getId());
                    logger.info("Inserting tv series: " + item.toString());
                    tvSeriesRepository.save(tvSeries);
                    item.setLastUpdateDate(new Date());
                    item.setOnAirStatus(!"Ended".equals(tvSeries.getStatus()));
                    logger.info("Inserting tv series: " + item.toString());
                    tvSeriesSummaryRepository.save(item);

                    // TODO: Add functionality for updating existing active tv series last update date older than one month
                }
                else{
                    logger.info("Tv Series is already existed in the database.");
                }

            } catch (Exception e) {
                logger.error("Exception finding tvSeries: " + item.toString(), e);
            }
        });

    }

    public void insertInitialData(){

        try {
            Map<String, String> tvSeries = Utility.readValidSeries(Constants.VALID_SERIES_TEXT_FILE_NAME);

            if(tvSeries == null || tvSeries.isEmpty()){
                logger.warn("There is no tv series in " + Constants.VALID_SERIES_TEXT_FILE_NAME + ". No data will be inserted.");
                return;
            }

            logger.info(tvSeries.keySet().size() + " tv series found. Inserting to db...");
            tvSeries.entrySet().stream().forEach((entry) -> {

                TvSeriesSummary summary = new TvSeriesSummary(Integer.valueOf(entry.getKey()), entry.getValue());
                if(!tvSeriesSummaryRepository.exists(Integer.valueOf(entry.getKey())))
                    tvSeriesSummaryRepository.save(summary);
                else
                    logger.warn("Tv series " + summary.toString() + " is already existed.");
            });
            logger.info("Insertion is completed.");
        } catch (Exception ex){
            logger.error("Error extracting valid series file",ex);
        }
    }

}
