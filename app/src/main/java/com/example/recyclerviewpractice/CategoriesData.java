package com.example.recyclerviewpractice;

public class CategoriesData {

    private final int image;
    private final String image_name;

    public CategoriesData(int image, String image_name) {
        this.image = image;
        this.image_name = image_name;
    }

    public int getImage() {
        return image;
    }

    public String getImage_name() {
        return image_name;
    }
}
