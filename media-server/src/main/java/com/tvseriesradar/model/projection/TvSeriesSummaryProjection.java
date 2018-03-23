package com.tvseriesradar.model.projection;

import com.tvseriesradar.dto.main.TvSeriesSummary;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

/**
 * Created by tkiziloren on 09/07/2017.
 */

@Projection(name="summary", types = TvSeriesSummary.class)
public interface TvSeriesSummaryProjection {
    Date getLastUpdateDate();
}
