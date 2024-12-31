package com.example.favorites_characters;

public class DataModel {


    private String name;
    private String details;
    private int image;
    private int _id;


    public DataModel() { }

    public DataModel(String name, String details, int image, int _id) {
        this.name = name;
        this.details = details;
        this.image = image;
        this._id = _id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }





}
