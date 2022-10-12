package com.example.screendesign1.data;

import android.media.Image;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Product {
    private String name;
    private String image;
    private double price;
    private String numOfRecommandations;
    private List<String> usersImages;



    public Product(String name, double price, String numOfRecommandations , String imageUrl) {
        this.name = name;
        this.price = price;
        this.numOfRecommandations = numOfRecommandations;
        this.image = imageUrl;
    }


    private static int lastProductsId = 0;
    public static ArrayList<Product> createProductsList(int numProducts) {
        lastProductsId = 0;
        ArrayList<Product> products = new ArrayList<Product>();
        ArrayList<String> images = new ArrayList<>();

       // images.add("https://d33p2k2w4zpozf.cloudfront.net/media/catalog/product/cache/6f8b1f57af8facbd0f9bed0480a4b89a/b/e/beyerdynamic-dt-250-perspective_transparent.png");
        images.add("https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/MX472_AV4?wid=2000&hei=2000&fmt=jpeg&qlt=95&.v=1570119352353");
        images.add("https://images.pexels.com/photos/335257/pexels-photo-335257.jpeg?cs=srgb&dl=pexels-eprism-studio-335257.jpg&fm=jpg");
        images.add("https://images.unsplash.com/photo-1505740420928-5e560c06d30e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8cHJvZHVjdHxlbnwwfHwwfHw%3D&w=1000&q=80");
        images.add("https://cdn.shopify.com/s/files/1/2303/2711/files/2_e822dae0-14df-4cb8-b145-ea4dc0966b34.jpg?v=1617059123");
        images.add("https://assets.crowdspring.com/marketing/landing-page/crowdspring-product-design-phase1-1120.jpg");
        images.add("https://images.unsplash.com/photo-1630688231126-dd36840fce51?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8cHJvZHVjdCUyMHBob3RvZ3JhcGh5fGVufDB8fDB8fA%3D%3D&w=1000&q=80");
        images.add("https://petapixel.com/assets/uploads/2017/03/product1.jpeg");
        images.add("https://images.ctfassets.net/2d5q1td6cyxq/4kmwcxuqXxUxUVfggQhbiI/650b0af104bfdf9979545eb326786243/Hero-hottoddy_.jpg");
        images.add("https://www.prodigi.com/img/blog/photo-ideas-16.jpg");
        images.add("https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/c4dbfb65716923.5afd9efd6d450.jpg");


        for (int i = 1; i <= numProducts; i++) {
            String imageUrl = images.get(new Random().nextInt(images.size()));
            products.add(new Product("product " + ++lastProductsId , 99.99 , "+241" , imageUrl));
        }

        return products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
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

    public List<String> getUsersImages() {
        return usersImages;
    }

    public void setUsersImages(List<String> usersImages) {
        this.usersImages = usersImages;
    }
}
