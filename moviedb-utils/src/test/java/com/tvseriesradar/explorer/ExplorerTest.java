package com.tvseriesradar.explorer;

import com.omertron.themoviedbapi.model.tv.TVInfo;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.tvseriesradar.util.Constants;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Created by tkiziloren on 22/04/2017.
 */

public class ExplorerTest {

    static final Logger logger = LoggerFactory.getLogger(ExplorerTest.class);

    private SeriesExplorer seriesExplorer;

    @Before
    public void setUp() throws Exception {
        seriesExplorer = new SeriesExplorerImpl();
    }

    @Test
    @Ignore
    public void getTopRated() throws Exception {
        List<TVInfo> topRated = seriesExplorer.getTopRated();
        assertThat(topRated, notNullValue());
    }

    @Test
    public void findById() throws Exception {
        TVInfo result = seriesExplorer.findById(Constants.BREAKING_BAD_SERIES_ID);
        assertThat(result.getName(), is("Breaking Bad"));
    }

}
