package com.shweta.practicebook;

import com.google.gson.annotations.SerializedName;

public class GenderModel {

    @SerializedName("id")
    String id;

    @SerializedName("category_id")
    String categoryId;

    @SerializedName("name")
    String name;

    @SerializedName("meaning")
    String meaning;

    @SerializedName("gender")
    String gender;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
