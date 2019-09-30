package com.stackroute.onlinefashionretail.manufacturer.domain;
import org.springframework.data.annotation.Id;

import java.awt.*;
public class Material
{
    @Id
    private String id;
    private String category;
    private String name;
    private String image;

  public Material() {
  }

  public Material(String id, String category, String name, String image) {
    this.id = id;
    this.category = category;
    this.name = name;
    this.image = image;
  }

  public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
}
