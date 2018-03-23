package com.tvseriesradar.util.imdb;

/**
 * Created by tkiziloren on 23.03.2018.
 */
public class ImdbInfo {

    private float rating;
    private long voteCount;

    public ImdbInfo(float rating, long voteCount) {
        this.rating = rating;
        this.voteCount = voteCount;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(long voteCount) {
        this.voteCount = voteCount;
    }
}
