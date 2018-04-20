package com.tvseriesradar.dto.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Created by tkiziloren on 01/05/2017.
 */

public class BaseIdentity implements Serializable, Identifiable{

    @Id
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if(obj instanceof BaseIdentity) {
            BaseIdentity other = (BaseIdentity)obj;
            return (new EqualsBuilder()).append(this.name, other.name).append(this.id, other.id).isEquals();
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (new HashCodeBuilder()).append(this.id).append(this.name).toHashCode();
    }

}
