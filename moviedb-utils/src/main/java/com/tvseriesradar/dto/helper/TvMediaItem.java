package com.tvseriesradar.dto.helper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tvseriesradar.dto.base.BaseIdentity;
import com.tvseriesradar.dto.base.Identifiable;
import com.tvseriesradar.enumeration.MediaType;

import java.io.Serializable;


/**
 * Created by tkiziloren on 01/05/2017.
 */
public class TvMediaItem extends BaseIdentity implements Serializable, Identifiable{

    private static final long serialVersionUID = 100L;
    private MediaType mediaType;
    @JsonProperty("backdrop_path")
    private String backdropPath;
    @JsonProperty("poster_path")
    private String posterPath;
    @JsonProperty("popularity")
    private float popularity;
    @JsonProperty("vote_average")
    private float voteAverage;
    @JsonProperty("vote_count")
    private int voteCount;

    @JsonProperty("imdb_rating")
    private float imdbRating;
    @JsonProperty("imdb_vote_count")
    private int imdbVoteCount;

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public float getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(float voteAverage) {
        this.voteAverage = voteAverage;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public float getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(float imdbRating) {
        this.imdbRating = imdbRating;
    }

    public int getImdbVoteCount() {
        return imdbVoteCount;
    }

    public void setImdbVoteCount(int imdbVoteCount) {
        this.imdbVoteCount = imdbVoteCount;
    }
}
