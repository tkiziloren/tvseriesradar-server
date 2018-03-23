package com.tvseriesradar.finder;

import com.omertron.themoviedbapi.model.tv.TVEpisodeInfo;
import com.omertron.themoviedbapi.model.tv.TVInfo;
import com.omertron.themoviedbapi.model.tv.TVSeasonInfo;
import com.tvseriesradar.dto.main.TvEpisode;
import com.tvseriesradar.dto.main.TvSeason;
import com.tvseriesradar.dto.main.TvSeries;
import com.tvseriesradar.explorer.SeriesExplorer;
import com.tvseriesradar.explorer.SeriesExplorerImpl;
import com.tvseriesradar.util.imdb.ImdbInfo;
import com.tvseriesradar.util.imdb.ImdbRatingScraper;
import com.tvseriesradar.util.imdb.ImdbRatingScraperImpl;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tkiziloren on 01/05/2017.
 */

@Component
public class TvSeriesFinderImpl implements TvSeriesFinder {

    static final Logger logger = LoggerFactory.getLogger(TvSeriesFinderImpl.class);

    private final SeriesExplorer seriesExplorer = new SeriesExplorerImpl();
    private final ImdbRatingScraper imdbRatingScraper = new ImdbRatingScraperImpl();
    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public TvSeries find(int id) throws Exception {
        TVInfo tvSeries = seriesExplorer.findById(id);
        TvSeries mappedTvSeries = modelMapper.map(tvSeries, TvSeries.class);


        ImdbInfo imdbData = imdbRatingScraper.getImdbInfo(mappedTvSeries.getExternalIDs().getImdbId());
        if(imdbData != null){
            mappedTvSeries.setImdbRating(imdbData.getRating());
            mappedTvSeries.setImdbVoteCount((int)imdbData.getVoteCount());
            logger.debug(mappedTvSeries.getName() + " Rating: " + imdbData.getRating());
        }

        List<TvSeason> seasons = new ArrayList<>();
        for(int i = 1; i <= tvSeries.getNumberOfSeasons(); i++){
            TVSeasonInfo season = seriesExplorer.getSeasons(tvSeries.getId(), i);
            TvSeason mappedSeason = modelMapper.map(season, TvSeason.class);
            seasons.add(mappedSeason);

            List<TvEpisode> episodes = new ArrayList<>();
            for(int j = 1; j <= season.getEpisodes().size(); j++){
                TVEpisodeInfo episode = seriesExplorer.getEpisodes(tvSeries.getId(), season.getSeasonNumber(), j);
                TvEpisode mappedEpisode = modelMapper.map(episode, TvEpisode.class);
                episodes.add(mappedEpisode);
            }
            mappedSeason.setEpisodes(episodes);
        }
        mappedTvSeries.setSeasons(seasons);
        return mappedTvSeries;
    }
}
