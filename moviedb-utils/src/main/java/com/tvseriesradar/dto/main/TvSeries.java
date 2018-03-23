package com.tvseriesradar.dto.main;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.omertron.themoviedbapi.model.person.PersonBasic;
import com.tvseriesradar.dto.helper.*;
import com.tvseriesradar.enumeration.MediaType;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * Created by tkiziloren on 01/05/2017.
 */


public class TvSeries extends TvMediaItem implements Serializable{

    private static final long serialVersionUID = 100L;

    public TvSeries() {
        super.setMediaType(MediaType.TV);
    }

    @JsonProperty("original_name")
    private String originalName;
    @JsonProperty("first_air_date")
    private String firstAirDate;
    @JsonProperty("origin_country")
    private List<String> originCountry;
    @JsonProperty("rating")
    private float rating = -1.0F;
    @JsonProperty("genre_ids")
    private List<Integer> genreIds;
    @JsonProperty("episode_run_time")
    private List<Integer> episodeRunTime;
    @JsonProperty("homepage")
    private String homepage;
    @JsonProperty("in_production")
    private boolean inProduction;
    @JsonProperty("languages")
    private List<String> languages;
    @JsonProperty("last_air_date")
    private String lastAirDate;
    @JsonProperty("number_of_episodes")
    private int numberOfEpisodes;
    @JsonProperty("number_of_seasons")
    private int numberOfSeasons;
    @JsonProperty("original_language")
    private String originalLanguage;
    @JsonProperty("overview")
    private String overview;
    @JsonProperty("status")
    private String status;
    @JsonProperty("type")
    private String type;

    @JsonProperty("seasons")
    private List<TvSeason> seasons;

    private List<Artwork> images = Collections.emptyList();
    private List<AlternativeTitle> alternativeTitles = Collections.emptyList();
    private List<TvSeries> similarTV = Collections.emptyList();
    private List<ContentRating> contentRatings = Collections.emptyList();
    private ExternalID externalIDs = new ExternalID();
    private List<Keyword> keywords = Collections.emptyList();
    private List<Video> videos = Collections.emptyList();

    @JsonProperty("production_companies")
    private List<ProductionCompany> productionCompanies;
    @JsonProperty("networks")
    private List<Network> networks;
    @JsonProperty("genres")
    private List<Genre> genres;
    @JsonProperty("created_by")
    private List<PersonBasic> createdBy;

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getFirstAirDate() {
        return firstAirDate;
    }

    public void setFirstAirDate(String firstAirDate) {
        this.firstAirDate = firstAirDate;
    }

    public List<String> getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(List<String> originCountry) {
        this.originCountry = originCountry;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    public List<Integer> getEpisodeRunTime() {
        return episodeRunTime;
    }

    public void setEpisodeRunTime(List<Integer> episodeRunTime) {
        this.episodeRunTime = episodeRunTime;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public boolean isInProduction() {
        return inProduction;
    }

    public void setInProduction(boolean inProduction) {
        this.inProduction = inProduction;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getLastAirDate() {
        return lastAirDate;
    }

    public void setLastAirDate(String lastAirDate) {
        this.lastAirDate = lastAirDate;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<TvSeason> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<TvSeason> seasons) {
        this.seasons = seasons;
    }

    public List<Artwork> getImages() {
        return images;
    }

    public void setImages(List<Artwork> images) {
        this.images = images;
    }

    public List<AlternativeTitle> getAlternativeTitles() {
        return alternativeTitles;
    }

    public void setAlternativeTitles(List<AlternativeTitle> alternativeTitles) {
        this.alternativeTitles = alternativeTitles;
    }

    public List<TvSeries> getSimilarTV() {
        return similarTV;
    }

    public void setSimilarTV(List<TvSeries> similarTV) {
        this.similarTV = similarTV;
    }

    public List<ContentRating> getContentRatings() {
        return contentRatings;
    }

    public void setContentRatings(List<ContentRating> contentRatings) {
        this.contentRatings = contentRatings;
    }

    public ExternalID getExternalIDs() {
        return externalIDs;
    }

    public void setExternalIDs(ExternalID externalIDs) {
        this.externalIDs = externalIDs;
    }

    public List<Keyword> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public List<ProductionCompany> getProductionCompanies() {
        return productionCompanies;
    }

    public void setProductionCompanies(List<ProductionCompany> productionCompanies) {
        this.productionCompanies = productionCompanies;
    }

    public List<Network> getNetworks() {
        return networks;
    }

    public void setNetworks(List<Network> networks) {
        this.networks = networks;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<PersonBasic> getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(List<PersonBasic> createdBy) {
        this.createdBy = createdBy;
    }
}
