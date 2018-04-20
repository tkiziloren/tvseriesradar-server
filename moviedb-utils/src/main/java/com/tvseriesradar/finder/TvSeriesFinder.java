package com.tvseriesradar.finder;

import com.tvseriesradar.dto.main.TvSeries;

/**
 * Created by tkiziloren on 01/05/2017.
 */
public interface TvSeriesFinder {
    public TvSeries find(int id) throws Exception;
}
