package com.example.screendesign1.data;

import android.media.Image;

import java.util.List;

public class Product {
    private String name;
    private Image image;
    private double price;
    private String numOfRecommandations;
    private List<Image> usersImages;

    public Product(String name, Image image, double price, String numOfRecommandations, List<Image> usersImages) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.numOfRecommandations = numOfRecommandations;
        this.usersImages = usersImages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNumOfRecommandations() {
        return numOfRecommandations;
    }

    public void setNumOfRecommandations(String numOfRecommandations) {
        this.numOfRecommandations = numOfRecommandations;
    }

    public List<Image> getUsersImages() {
        return usersImages;
    }

    public void setUsersImages(List<Image> usersImages) {
        this.usersImages = usersImages;
    }
}
