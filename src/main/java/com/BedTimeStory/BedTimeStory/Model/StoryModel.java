package com.BedTimeStory.BedTimeStory.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StoryModel {
    @Id
    private String id;

    private String story;

    private Theme theme;
    private byte[] audio;


    public StoryModel() {
    }

    public StoryModel(String id, String story, Theme theme, byte[] audio) {
        this.id = id;
        this.story = story;
        this.theme = theme;
        this.audio = audio;
    }

    public byte[] getAudio() {
        return audio;
    }

    public void setAudio(byte[] audio) {
        this.audio = audio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }
}
