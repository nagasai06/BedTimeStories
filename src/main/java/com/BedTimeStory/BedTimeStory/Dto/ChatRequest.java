package com.BedTimeStory.BedTimeStory.Dto;

import com.BedTimeStory.BedTimeStory.Model.Gender;
import com.BedTimeStory.BedTimeStory.Model.Theme;

public class ChatRequest {
    private String name;
    private Gender gender;
    private int age;
    private Theme theme;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }
}
