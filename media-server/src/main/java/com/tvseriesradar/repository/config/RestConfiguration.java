package com.tvseriesradar.repository.config;

import com.tvseriesradar.dto.main.TvSeries;
import com.tvseriesradar.dto.main.TvSeriesSummary;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

/**
 * Created by tkiziloren on 06/07/2017.
 */

@Configuration
public class RestConfiguration extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(TvSeriesSummary.class);
        config.exposeIdsFor(TvSeries.class);
    }
}