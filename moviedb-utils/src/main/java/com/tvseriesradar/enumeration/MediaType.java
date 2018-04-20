package com.tvseriesradar.enumeration;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by tkiziloren on 01/05/2017.
 */
public enum MediaType {
    MOVIE,
    TV,
    EPISODE;

    private MediaType() {
    }

    public static MediaType fromString(String mediaType) {
        if(StringUtils.isNotBlank(mediaType)) {
            try {
                return valueOf(mediaType.trim().toUpperCase());
            } catch (IllegalArgumentException var2) {
                throw new IllegalArgumentException("MediaType " + mediaType + " does not exist.", var2);
            }
        } else {
            throw new IllegalArgumentException("MediaType must not be null");
        }
    }
}
