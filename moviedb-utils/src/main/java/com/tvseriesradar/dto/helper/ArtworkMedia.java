package com.tvseriesradar.dto.helper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.tvseriesradar.dto.main.TvEpisode;
import com.tvseriesradar.dto.main.TvSeries;
import com.tvseriesradar.enumeration.MediaType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by tkiziloren on 01/05/2017.
 */
public class ArtworkMedia {

    private static final long serialVersionUID = 100L;
    private MediaType mediaType;
    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
            property = "media_type",
            defaultImpl = MediaType.class
    )
    @JsonSubTypes({@JsonSubTypes.Type(
            value = TvMovie.class,
            name = "movie"
    ), @JsonSubTypes.Type(
            value = TvSeries.class,
            name = "tv"
    ), @JsonSubTypes.Type(
            value = TvEpisode.class,
            name = "episode"
    )})
    @JsonProperty("media")
    private TvMediaItem media;

    public ArtworkMedia() {
    }

    public MediaType getMediaType() {
        return this.mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    @JsonSetter("media_type")
    public void setMediaType(String mediaType) {
        this.mediaType = MediaType.fromString(mediaType);
    }

    public TvMediaItem getMedia() {
        return this.media;
    }

    public void setMedia(TvMediaItem media) {
        this.media = media;
    }

    public int hashCode() {
        return (new HashCodeBuilder()).appendSuper(super.hashCode()).append(this.mediaType).toHashCode();
    }

    public boolean equals(Object obj) {
        if(obj instanceof ArtworkMedia) {
            ArtworkMedia other = (ArtworkMedia)obj;
            return (new EqualsBuilder()).appendSuper(super.equals(obj)).append(this.mediaType, other.mediaType).isEquals();
        } else {
            return false;
        }
    }
}
