package com.tvseriesradar.dto.main;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tvseriesradar.dto.base.BaseIdentity;
import com.tvseriesradar.dto.helper.Artwork;
import com.tvseriesradar.dto.helper.ExternalID;
import com.tvseriesradar.dto.helper.MediaCreditList;
import com.tvseriesradar.dto.helper.Video;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * Created by tkiziloren on 01/05/2017.
 */
public class TvSeason extends BaseIdentity implements Serializable{

    private static final long serialVersionUID = 100L;

    public TvSeason() {
    }

    @JsonProperty("id")
    private int id = -1;
    @JsonProperty("air_date")
    private String airDate;
    @JsonProperty("poster_path")
    private String posterPath;
    @JsonProperty("season_number")
    private int seasonNumber;
    @JsonProperty("episode_count")
    private int episodeCount = -1;
    @JsonProperty("overview")
    private String overview;
    @JsonProperty("episodes")

    private List<TvEpisode> episodes;
    private ExternalID externalIDs = new ExternalID();
    private List<Artwork> images = Collections.emptyList();
    private MediaCreditList credits = new MediaCreditList();
    private List<Video> videos = Collections.emptyList();

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getAirDate() {
        return airDate;
    }

    public void setAirDate(String airDate) {
        this.airDate = airDate;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(int episodeCount) {
        this.episodeCount = episodeCount;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public List<TvEpisode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<TvEpisode> episodes) {
        this.episodes = episodes;
    }

    public ExternalID getExternalIDs() {
        return externalIDs;
    }

    public void setExternalIDs(ExternalID externalIDs) {
        this.externalIDs = externalIDs;
    }

    public List<Artwork> getImages() {
        return images;
    }

    public void setImages(List<Artwork> images) {
        this.images = images;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public MediaCreditList getCredits() {
        return credits;
    }

    public void setCredits(MediaCreditList credits) {
        this.credits = credits;
    }
}
