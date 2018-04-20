package com.tvseriesradar.util;

import com.omertron.themoviedbapi.enumeration.TVEpisodeMethod;
import com.omertron.themoviedbapi.enumeration.TVMethod;
import com.omertron.themoviedbapi.enumeration.TVSeasonMethod;

/**
 * Created by tkiziloren on 23/04/2017.
 */
public class ResponseBuilderFactory {

    public static String getTvSeriesResponseBuilder(){
        return Utility.appendToResponseBuilder(TVMethod.class);
    }

    public static String getTvSeasonResponseBuilder(){
        return Utility.appendToResponseBuilder(TVSeasonMethod.class);
    }

    public static String getTvEpisodeResponseBuilder(){
        return Utility.appendToResponseBuilder(TVEpisodeMethod.class);
    }

}
