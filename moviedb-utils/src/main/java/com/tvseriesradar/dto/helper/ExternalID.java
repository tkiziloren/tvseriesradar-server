package com.tvseriesradar.dto.helper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tvseriesradar.dto.base.Identifiable;

import java.io.Serializable;

/**
 * Created by tkiziloren on 01/05/2017.
 */
public class ExternalID implements Serializable, Identifiable{
    private static final long serialVersionUID = 100L;
    @JsonProperty("id")
    private int id;
    @JsonProperty("imdb_id")
    private String imdbId;
    @JsonProperty("freebase_mid")
    private String freebaseMid;
    @JsonProperty("freebase_id")
    private String freebaseId;
    @JsonProperty("tvdb_id")
    private String tvdbId;
    @JsonProperty("tvrage_id")
    private String tvrageId;
    @JsonProperty("facebook_id")
    private String facebookId;
    @JsonProperty("twitter_id")
    private String twitterId;

    public ExternalID() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImdbId() {
        return this.imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getFreebaseMid() {
        return this.freebaseMid;
    }

    public void setFreebaseMid(String freebaseMid) {
        this.freebaseMid = freebaseMid;
    }

    public String getFreebaseId() {
        return this.freebaseId;
    }

    public void setFreebaseId(String freebaseId) {
        this.freebaseId = freebaseId;
    }

    public String getTvrageId() {
        return this.tvrageId;
    }

    public void setTvrageId(String tvrageId) {
        this.tvrageId = tvrageId;
    }

    public String getTvdbId() {
        return this.tvdbId;
    }

    public void setTvdbId(String tvdbId) {
        this.tvdbId = tvdbId;
    }

    public String getFacebookId() {
        return this.facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getTwitterId() {
        return this.twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }
}
