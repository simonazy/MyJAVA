package com.learnspring.hellospring;

public class Episodes {
    private String title;
    private String episode;
    private String rating;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEpisode() {
        return this.episode;
    }

    public void setEpisode(String Episode) {
        this.episode = Episode;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String Rating) {
        this.rating = Rating;
    }

    public Episodes(String title, String Episode, String Rating){
        this.title = title;
        this.episode = Episode;
        this.rating = Rating;
    }

}
