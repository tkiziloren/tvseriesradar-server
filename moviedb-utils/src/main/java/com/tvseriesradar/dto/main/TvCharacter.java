package com.tvseriesradar.dto.main;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tvseriesradar.dto.base.BaseIdentity;

import java.io.Serializable;

/**
 * Created by tkiziloren on 01/05/2017.
 */
public class TvCharacter extends BaseIdentity implements Serializable{
    private static final long serialVersionUID = 100L;

    public TvCharacter() {
    }

    @JsonProperty("cast_id")
    private int castId = 0;
    @JsonProperty("character")
    private String character;
    @JsonProperty("order")
    private int order;
    @JsonProperty("credit_id")
    private String creditId;
    @JsonProperty("id")
    private int id;
    @JsonProperty("profile_path")
    private String artworkPath;

    public int getCastId() {
        return castId;
    }

    public void setCastId(int castId) {
        this.castId = castId;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getCreditId() {
        return creditId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getArtworkPath() {
        return artworkPath;
    }

    public void setArtworkPath(String artworkPath) {
        this.artworkPath = artworkPath;
    }


}
