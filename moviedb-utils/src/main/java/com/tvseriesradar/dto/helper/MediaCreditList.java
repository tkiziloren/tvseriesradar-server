package com.tvseriesradar.dto.helper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tvseriesradar.dto.base.Identifiable;
import com.tvseriesradar.dto.main.TVCrew;
import com.tvseriesradar.dto.main.TvCharacter;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * Created by tkiziloren on 01/05/2017.
 */
public class MediaCreditList implements Serializable, Identifiable{

    private static final long serialVersionUID = 100L;
    @JsonProperty("id")
    private int id = 0;
    @JsonProperty("cast")
    private List<TvCharacter> cast = Collections.emptyList();
    @JsonProperty("guest_stars")
    private List<TvCharacter> guestStars = Collections.emptyList();
    @JsonProperty("crew")
    private List<TVCrew> crew = Collections.emptyList();

    public MediaCreditList() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<TvCharacter> getCast() {
        return cast;
    }

    public void setCast(List<TvCharacter> cast) {
        this.cast = cast;
    }

    public List<TvCharacter> getGuestStars() {
        return guestStars;
    }

    public void setGuestStars(List<TvCharacter> guestStars) {
        this.guestStars = guestStars;
    }

    public List<TVCrew> getCrew() {
        return crew;
    }

    public void setCrew(List<TVCrew> crew) {
        this.crew = crew;
    }
}
