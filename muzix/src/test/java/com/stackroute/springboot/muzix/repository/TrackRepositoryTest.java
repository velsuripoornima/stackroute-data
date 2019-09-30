package com.stackroute.springboot.muzix.repository;

import com.stackroute.springboot.muzix.model.Track;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TrackRepositoryTest {

    @Autowired
    TrackRepository trackRepository;
    Track track;

    @Before
    public void setUp()
    {
        track = new Track();
        track.setId(10);
        track.setName("John");
        track.setContent("uyfu");
        track.setStatus("tdyu");
        track.setId(101);
        track.setName("John");
        track.setContent("uyfu");
        track.setStatus("tdyu");

    }

    @After
    public void tearDown(){

        trackRepository.deleteAll();
    }


    @Test
    public void testSaveUser(){
//        track=new Track(1,"track name","track content","track status");
        trackRepository.save(track);
        Track fetchTrack = trackRepository.findById(track.getId()).get();
        Assert.assertEquals(101,fetchTrack.getId());

    }

    @Test
    public void testSaveUserFailure(){
        Track testUser = new Track(2,"Harry","john","Harry123");
        trackRepository.save(testUser);
        Track fetchUser = trackRepository.findById(track.getId()).get();
        System.out.println(fetchUser);
        Assert.assertNotSame(testUser,track);
    }

    @Test
    public void testGetAllUser(){
        Track u = new Track(1,"Johny","Jenny","Johny12");
        Track u1 = new Track(2,"Harry","Jenny","Harry12");
        trackRepository.save(u);
        trackRepository.save(u1);

        List<Track> list = trackRepository.findAll();
        Assert.assertEquals(u1,list.get(1));


    }

}