package com.codegym.model;

import javax.persistence.*;



public class GlassesForm {
    //    Glasses (id, code, price, color, description, img)

    private Long id;
    private String code;
    private int price;
    private String color;
    private String description;
    private String img;

    public GlassesForm() {
    }

    public GlassesForm(Long id, String code, int price, String color, String description, String img) {
        this.id = id;
        this.code = code;
        this.price = price;
        this.color = color;
        this.description = description;
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
