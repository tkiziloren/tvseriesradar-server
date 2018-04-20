package com.tvseriesradar.finder;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.tvseriesradar.dto.main.TvSeries;
import com.tvseriesradar.util.Constants;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Created by tkiziloren on 01/05/2017.
 */
public class FinderTest {

    static final Logger logger = LoggerFactory.getLogger(FinderTest.class);

    private TvSeriesFinder tvSeriesFinder;



    @Before
    public void setUp() throws Exception {
        tvSeriesFinder = new TvSeriesFinderImpl();
    }

    @Test
    public void testConvert() throws Exception {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        logger.debug("Started Converting: " + stopWatch);
        TvSeries convertedResult = tvSeriesFinder.find(Constants.BREAKING_BAD_SERIES_ID);
        assertThat(convertedResult, notNullValue(TvSeries.class));
        logger.debug("Finished Converting: " + stopWatch);
        stopWatch.stop();
    }
}
