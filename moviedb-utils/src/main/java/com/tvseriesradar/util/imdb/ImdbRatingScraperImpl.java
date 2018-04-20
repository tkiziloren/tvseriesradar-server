package com.tvseriesradar.util.imdb;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tinymediamanager.scraper.MediaMetadata;
import org.tinymediamanager.scraper.MediaSearchOptions;
import org.tinymediamanager.scraper.MediaSearchResult;
import org.tinymediamanager.scraper.entities.MediaType;
import org.tinymediamanager.scraper.imdb.ImdbMetadataProvider;
import sun.misc.FloatingDecimal;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

/**
 * Created by tkiziloren on 01/05/2017.
 */
public class ImdbRatingScraperImpl implements ImdbRatingScraper {

    static final Logger logger = LoggerFactory.getLogger(ImdbRatingScraperImpl.class);


    @Override
    public ImdbInfo getImdbInfo(String id) {

        String url = getImdbUrl(id);

        try {

            Document doc= Jsoup.connect(url).get();
            String ratingText = doc.select("span[itemProp=ratingValue]").text();
            String voteCountText = doc.select("span[itemProp=ratingCount]").text();

            float rating = Float.parseFloat(ratingText);
            long voteCount = Long.parseLong(voteCountText.replaceAll(",",""));
            return new ImdbInfo(rating, voteCount);

        }catch (NumberFormatException ex){
            logger.error("Invalid value for ratingValue of ratingCount", ex);
        } catch (IOException e) {
            logger.error("Imdb connection error", e);
        }

        return null;
    }



    private String getImdbUrl(String imdbId){
        return "http://www.imdb.com/title/" + imdbId;
    }

}
