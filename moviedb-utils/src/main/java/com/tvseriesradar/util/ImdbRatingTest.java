package com.tvseriesradar.util;

import com.tvseriesradar.util.imdb.ImdbInfo;
import com.tvseriesradar.util.imdb.ImdbRatingScraper;
import com.tvseriesradar.util.imdb.ImdbRatingScraperImpl;

/**
 * Created by tkiziloren on 23.03.2018.
 */
public class ImdbRatingTest {

    public static void main(String[] args) {
        ImdbRatingScraper scraper = new ImdbRatingScraperImpl();

        try {
            ImdbInfo imdbInfo = scraper.getImdbInfo("1632701");
            System.out.println(imdbInfo.getRating());
            System.out.println(imdbInfo.getVoteCount());
        } catch (Exception e) {

        }
    }

}
