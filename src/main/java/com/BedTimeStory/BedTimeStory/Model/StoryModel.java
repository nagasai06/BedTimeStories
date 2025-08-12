package com.BedTimeStory.BedTimeStory.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StoryModel {
    @Id
    private String id;

    private String story;

    private Theme theme;
    private String audioUrl;
    private long audioSize;
    private String audioFormat;


    public StoryModel() {
    }

    public StoryModel(String id, String story, Theme theme, String audioUrl, String audioFormat, long audioSize) {
        this.id = id;
        this.story = story;
        this.theme = theme;
        this.audioSize = audioSize;
        this.audioFormat=audioFormat;
        this.audioUrl=audioUrl;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public long getAudioSize() {
        return audioSize;
    }

    public void setAudioSize(long audioSize) {
        this.audioSize = audioSize;
    }

    public String getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }
    //    public byte[] getAudio() {
//        return audio;
//    }

//    public void setAudio(byte[] audio) {
//        this.audio = audio;
//    }

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
