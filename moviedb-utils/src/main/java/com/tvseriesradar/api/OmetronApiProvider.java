package com.tvseriesradar.api;

import com.omertron.themoviedbapi.MovieDbException;
import com.omertron.themoviedbapi.TheMovieDbApi;
import com.tvseriesradar.util.Constants;

/**
 * Created by tkiziloren on 23/04/2017.
 */
public enum OmetronApiProvider {

    INSTANCE;
    private final TheMovieDbApi api = initApi();

    TheMovieDbApi initApi(){
        try {
            return new TheMovieDbApi(Constants.API_KEY);
        } catch (MovieDbException e) {
            e.printStackTrace();
        }
        return null;
    }

    public TheMovieDbApi getApi(){
        return this.api;
    }
}
