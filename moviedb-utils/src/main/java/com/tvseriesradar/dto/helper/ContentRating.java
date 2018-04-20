package com.tvseriesradar.dto.helper;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by tkiziloren on 01/05/2017.
 */
public class ContentRating implements Serializable {

    private static final long serialVersionUID = 100L;
    @JsonProperty("iso_3166_1")
    private String country;
    @JsonProperty("rating")
    private String rating;

    public ContentRating() {
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
