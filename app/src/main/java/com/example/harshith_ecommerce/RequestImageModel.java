package com.example.harshith_ecommerce;

import com.google.firebase.database.Exclude;

public class RequestImageModel {
    private String mName;
    private String mImageUrl;
    private String mKey;

    public RequestImageModel() {
        //empty constructor needed
    }

    public RequestImageModel(String name, String imageUrl) {
        if (name.trim().equals("")) {
            name = "No Name";
        }
        mName = name;
        mImageUrl = imageUrl;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    @Exclude
    public String getKey() {
        return mKey;
    }

    @Exclude
    public void setKey(String key) {
        mKey = key;
    }
}