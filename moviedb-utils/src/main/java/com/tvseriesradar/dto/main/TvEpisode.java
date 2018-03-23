package com.tvseriesradar.dto.main;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tvseriesradar.dto.helper.*;
import com.tvseriesradar.enumeration.MediaType;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * Created by tkiziloren on 01/05/2017.
 */
public class TvEpisode extends TvMediaItem implements Serializable{

    private static final long serialVersionUID = 100L;

    public TvEpisode() {
        super.setMediaType(MediaType.TV);
    }

    @JsonProperty("air_date")
    private String airDate;
    @JsonProperty("season_number")
    private int seasonNumber;
    @JsonProperty("episode_number")
    private int episodeNumber;
    @JsonProperty("overview")
    private String overview;
    @JsonProperty("still_path")
    private String stillPath;

    @JsonProperty("show_id")
    private String showId;
    @JsonProperty("guest_stars")
    private List<TvCharacter> guestStars;
    @JsonProperty("production_code")
    private String productionCode;
    private ExternalID externalIDs = new ExternalID();
    private List<Artwork> images = Collections.emptyList();
    private List<Video> videos = Collections.emptyList();
    private MediaCreditList credits = new MediaCreditList();

    public String getAirDate() {
        return airDate;
    }

    public void setAirDate(String airDate) {
        this.airDate = airDate;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getStillPath() {
        return stillPath;
    }

    public void setStillPath(String stillPath) {
        this.stillPath = stillPath;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public List<TvCharacter> getGuestStars() {
        return guestStars;
    }

    public void setGuestStars(List<TvCharacter> guestStars) {
        this.guestStars = guestStars;
    }

    public String getProductionCode() {
        return productionCode;
    }

    public void setProductionCode(String productionCode) {
        this.productionCode = productionCode;
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
