package com.example.screendesign1;


public class Items
{
    private int image_id;
    private String text;

    public int getImage_id()
    {
        return image_id;
    }

    public void setImage_id(int image_id)
    {
        this.image_id = image_id;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    Items(int img, String text)
    {
        image_id = img;
        this.text = text;
    }
}