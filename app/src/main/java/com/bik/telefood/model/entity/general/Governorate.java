package com.bik.telefood.model.entity.general;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Governorate {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("title")
    @Expose
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
