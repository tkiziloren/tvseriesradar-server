package com.tvseriesradar.util.imdb;

import org.tinymediamanager.scraper.MediaMetadata;

/**
 * Created by tkiziloren on 01/05/2017.
 */
public interface ImdbRatingScraper {

    public ImdbInfo getImdbInfo(String id) throws Exception;


}
