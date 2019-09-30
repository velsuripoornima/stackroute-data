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
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@JsonIgnoreProperties(ignoreUnknown = true)
public class Track {
    @Id  //representing id as a primary key
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    private String name;

    private String artist;

    private String url;

    private String streamable;

    private int listeners;

    public void setId(int id) {
    }


//    public void setId(int id) {
//    }
}
