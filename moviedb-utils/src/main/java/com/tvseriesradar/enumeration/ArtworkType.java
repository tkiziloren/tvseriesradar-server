package com.tvseriesradar.enumeration;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by tkiziloren on 01/05/2017.
 */
public enum ArtworkType {

    POSTER,
    BACKDROP,
    PROFILE,
    STILL;

    private ArtworkType() {
    }

    public static ArtworkType fromString(String artworkType) {
        if(StringUtils.isNotBlank(artworkType)) {
            try {
                return valueOf(artworkType.trim().toUpperCase());
            } catch (IllegalArgumentException var2) {
                throw new IllegalArgumentException("ArtworkType " + artworkType + " does not exist.", var2);
            }
        } else {
            throw new IllegalArgumentException("ArtworkType must not be null");
        }
    }

}
