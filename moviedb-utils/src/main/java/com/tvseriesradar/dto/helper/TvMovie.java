package com.tvseriesradar.dto.helper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tvseriesradar.enumeration.MediaType;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tkiziloren on 01/05/2017.
 */
public class TvMovie extends TvMediaItem implements Serializable {



    private static final long serialVersionUID = 100L;
    @JsonProperty("_id")
    private String mediaId;
    @JsonProperty("adult")
    private boolean adult;
    @JsonProperty("original_title")
    private String originalTitle;
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonProperty("title")
    private String title;
    @JsonProperty("video")
    private Boolean video = null;
    @JsonProperty("rating")
    private float userRating = -1.0F;
    @JsonProperty("genre_ids")
    private List<Integer> genreIds;
    @JsonProperty("original_language")
    private String originalLanguage;
    @JsonProperty("overview")
    private String overview;
    @JsonProperty("revenue")
    private long revenue = 0L;

    public TvMovie() {
        super.setMediaType(MediaType.MOVIE);
    }

    public String getMediaId() {
        return this.mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public boolean isAdult() {
        return this.adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getOriginalTitle() {
        return this.originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isVideo() {
        return this.video.booleanValue();
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public float getUserRating() {
        return this.userRating;
    }

    public void setUserRating(float userRating) {
        this.userRating = userRating;
    }

    public List<Integer> getGenreIds() {
        return this.genreIds;
    }

    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    public String getOriginalLanguage() {
        return this.originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOverview() {
        return this.overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public long getRevenue() {
        return this.revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }
}
