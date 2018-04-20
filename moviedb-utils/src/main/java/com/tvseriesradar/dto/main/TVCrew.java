package com.tvseriesradar.dto.main;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tvseriesradar.dto.base.BaseIdentity;

import java.io.Serializable;

/**
 * Created by tkiziloren on 01/05/2017.
 */
public class TVCrew extends BaseIdentity implements Serializable{
    private static final long serialVersionUID = 100L;

    public TVCrew() {
    }

    @JsonProperty("credit_id")
    private String creditId;
    @JsonProperty("id")
    private int id;
    @JsonProperty("profile_path")
    private String artworkPath;
    @JsonProperty("department")
    private String department;
    @JsonProperty("job")
    private String job;

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
