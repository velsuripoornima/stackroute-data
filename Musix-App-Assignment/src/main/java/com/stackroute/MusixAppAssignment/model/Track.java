package com.stackroute.MusixAppAssignment.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document
//this annotation is used to create a table
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Track {

    private static int counter = 0;

    private int id;

    private String name;

    private String artist;

    private String url;
    private String streamable;
    private int listeners;

    public Track() {
        id = ++counter;
    }
//creating the parameterized construcot
    public Track(int id, String name, String artist, String url, String streamable, int listeners) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.url = url;
        this.streamable = streamable;
        this.listeners = listeners;
    }

    //creating the all getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStreamable() {
        return streamable;
    }

    public void setStreamable(String streamable) {
        this.streamable = streamable;
    }

    public int getListeners() {
        return listeners;
    }

    public void setListeners(int listeners) {
        this.listeners = listeners;
    }

}
