package com.tvseriesradar.dto.main;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.omertron.themoviedbapi.enumeration.Gender;
import com.tvseriesradar.dto.base.BaseIdentity;
import com.tvseriesradar.dto.helper.Artwork;
import com.tvseriesradar.dto.helper.ArtworkMedia;
import com.tvseriesradar.dto.helper.ExternalID;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * Created by tkiziloren on 01/05/2017.
 */
public class TvPerson extends BaseIdentity implements Serializable {

    public TvPerson() {
    }

    private static final long serialVersionUID = 100L;
    @JsonProperty("profile_path")
    private String profilePath;
    @JsonProperty("adult")
    private boolean adult;
    @JsonProperty("also_known_as")
    private List<String> alsoKnownAs;
    @JsonProperty("biography")
    private String biography;
    @JsonProperty("birthday")
    private String birthday;
    @JsonProperty("deathday")
    private String deathday;
    @JsonProperty("homepage")
    private String homepage;
    @JsonProperty("imdb_id")
    private String imdbId;
    @JsonProperty("place_of_birth")
    private String placeOfBirth;
    @JsonProperty("popularity")
    private float popularity;
    private Gender gender;
    private ExternalID externalIDs = new ExternalID();
    private List<Artwork> images = Collections.emptyList();
    private List<ArtworkMedia> taggedImages = Collections.emptyList();

    public String getProfilePath() {
        return profilePath;
    }

    public void setProfilePath(String profilePath) {
        this.profilePath = profilePath;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public List<String> getAlsoKnownAs() {
        return alsoKnownAs;
    }

    public void setAlsoKnownAs(List<String> alsoKnownAs) {
        this.alsoKnownAs = alsoKnownAs;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDeathday() {
        return deathday;
    }

    public void setDeathday(String deathday) {
        this.deathday = deathday;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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

    public List<ArtworkMedia> getTaggedImages() {
        return taggedImages;
    }

    public void setTaggedImages(List<ArtworkMedia> taggedImages) {
        this.taggedImages = taggedImages;
    }
}
