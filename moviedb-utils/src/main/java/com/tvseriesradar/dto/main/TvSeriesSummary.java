package com.tvseriesradar.dto.main;

import com.tvseriesradar.dto.base.BaseIdentity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by tkiziloren on 04/07/2017.
 */


public class TvSeriesSummary extends BaseIdentity implements Serializable {

    public TvSeriesSummary(int id, String name) {
        super.setId(id);
        super.setName(name);
    }

    private Boolean onAirStatus;
    private Date lastUpdateDate;

    public Boolean getOnAirStatus() {
        return onAirStatus;
    }

    public void setOnAirStatus(Boolean onAirStatus) {
        this.onAirStatus = onAirStatus;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        return "TvSeriesSummary{" +
                "id=" + getId() +
                " name=" + getName() +
                " onAirStatus=" + onAirStatus +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
    }
}
