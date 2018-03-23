package com.tvseriesradar.explorer;

import com.omertron.themoviedbapi.MovieDbException;
import com.omertron.themoviedbapi.model.tv.TVBasic;
import com.omertron.themoviedbapi.model.tv.TVEpisodeInfo;
import com.omertron.themoviedbapi.model.tv.TVInfo;
import com.omertron.themoviedbapi.model.tv.TVSeasonInfo;

import java.util.List;



/**
 * Created by tkiziloren on 22/04/2017.
 */
public interface SeriesExplorer {

    public List<TVInfo> getTopRated() throws MovieDbException;

    public TVInfo findById(int id) throws MovieDbException;

    public List<TVBasic> search(String name) throws MovieDbException;

    public TVSeasonInfo getSeasons(int seriesId, int seasonNum) throws MovieDbException;

    public TVEpisodeInfo getEpisodes(int seriesId, int seasonNum, int episodeNum) throws MovieDbException;

}
