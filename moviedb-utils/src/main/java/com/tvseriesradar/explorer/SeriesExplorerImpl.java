package com.tvseriesradar.explorer;

import com.omertron.themoviedbapi.MovieDbException;
import com.omertron.themoviedbapi.enumeration.SearchType;
import com.omertron.themoviedbapi.model.tv.TVBasic;
import com.omertron.themoviedbapi.model.tv.TVEpisodeInfo;
import com.omertron.themoviedbapi.model.tv.TVInfo;
import com.omertron.themoviedbapi.model.tv.TVSeasonInfo;
import com.omertron.themoviedbapi.results.ResultList;
import com.tvseriesradar.api.OmetronApiProvider;
import com.tvseriesradar.util.Constants;
import com.tvseriesradar.util.ResponseBuilderFactory;
import com.tvseriesradar.util.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tkiziloren on 22/04/2017.
 */
public class SeriesExplorerImpl implements SeriesExplorer {

    static final Logger logger = LoggerFactory.getLogger(Utility.class);


    public List<TVInfo> getTopRated() throws MovieDbException {

        ResultList<TVInfo> singlePageResult = OmetronApiProvider.INSTANCE.getApi().getTVTopRated(null, Constants.LANGUAGE_ENGLISH);
        List<TVInfo> result = new ArrayList<>();
        result.addAll(singlePageResult.getResults());
        int i = singlePageResult.getPage();
        while(i < singlePageResult.getTotalPages()){
            i++;
            ResultList<TVInfo> pageResult = OmetronApiProvider.INSTANCE.getApi().getTVTopRated(i, Constants.LANGUAGE_ENGLISH);
            result.addAll(pageResult.getResults());

        }
        return result;
    }
    public TVInfo findById(int id) throws MovieDbException {
        return OmetronApiProvider.INSTANCE.getApi().getTVInfo(id, Constants.LANGUAGE_ENGLISH, ResponseBuilderFactory.getTvSeriesResponseBuilder());
    }

    public List<TVBasic> search(String name) throws MovieDbException {
        return OmetronApiProvider.INSTANCE.getApi().searchTV(name, null, Constants.LANGUAGE_ENGLISH, null, SearchType.PHRASE).getResults();
    }

    public TVSeasonInfo getSeasons(int seriesId, int seasonNum) throws MovieDbException {
        return OmetronApiProvider.INSTANCE.getApi().getSeasonInfo(seriesId,seasonNum, Constants.LANGUAGE_ENGLISH, ResponseBuilderFactory.getTvSeasonResponseBuilder());
    }

    public TVEpisodeInfo getEpisodes(int seriesId, int seasonNum, int episodeNum) throws MovieDbException {
        return OmetronApiProvider.INSTANCE.getApi().getEpisodeInfo(seriesId, seasonNum, episodeNum, Constants.LANGUAGE_ENGLISH, ResponseBuilderFactory.getTvEpisodeResponseBuilder());
    }
}
