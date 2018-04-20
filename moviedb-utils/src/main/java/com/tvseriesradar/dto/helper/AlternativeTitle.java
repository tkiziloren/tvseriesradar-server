package com.tvseriesradar.dto.helper;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;

/**
 * Created by tkiziloren on 01/05/2017.
 */
public class AlternativeTitle implements Serializable {

    private static final long serialVersionUID = 100L;
    @JsonProperty("iso_3166_1")
    private String country;
    @JsonProperty("title")
    private String title;

    public AlternativeTitle() {
    }

    public String getCountry() {
        return this.country;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean equals(Object obj) {
        if(obj instanceof AlternativeTitle) {
            AlternativeTitle other = (AlternativeTitle)obj;
            return (new EqualsBuilder()).append(this.country, other.country).append(this.title, other.title).isEquals();
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (new HashCodeBuilder()).append(this.country).append(this.title).toHashCode();
    }
}
