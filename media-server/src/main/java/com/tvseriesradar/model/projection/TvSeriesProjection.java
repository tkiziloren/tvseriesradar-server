package com.tvseriesradar.model.projection;

import com.tvseriesradar.dto.main.TvSeries;
import org.springframework.data.rest.core.config.Projection;

/**
 * Created by tkiziloren on 09/07/2017.
 */

@Projection(name="summary", types = TvSeries.class)
public interface TvSeriesProjection {
    String getName();
    String getBackdropPath();
    String getPosterPath();
    float getImdbRating();
}
