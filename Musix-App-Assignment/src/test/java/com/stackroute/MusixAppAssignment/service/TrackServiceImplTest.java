//package com.stackroute.MusixAppAssignment.service;
//
//import com.stackroute.MusixAppAssignment.exceptions.UserAlreadyExistException;
//import com.stackroute.MusixAppAssignment.model.Track;
//import com.stackroute.MusixAppAssignment.model.TrackDto;
//import com.stackroute.MusixAppAssignment.repository.TrackRepository;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import static org.mockito.Mockito.*;
//import static org.mockito.internal.verification.VerificationModeFactory.times;
//
//public class TrackServiceImplTest {
//
//    Track track;
//    TrackMapper trackMapper;
//    //Create a mock for UserRepository
//    @Mock
//    TrackRepository trackRepository;
//
//    //Inject the mocks as dependencies into UserServiceImpl
//    @InjectMocks
//    TrackServiceImpl trackService;
//    List<Track> list= null;
//
//
//    @Before
//    public void setUp(){
//        //Initialising the mock object
//        MockitoAnnotations.initMocks(this);
//        track=new Track(1,"track","track content","track status","ugffd",123);
//
//    }
//
//    @Test
//    public void saveUserTestSuccess() throws UserAlreadyExistException {
//        TrackDto trackDto=trackMapper.trackToTrackDto(track);
//        when(trackRepository.save((TrackDto)any())).thenReturn(trackDto);
//        Track savedUser = trackService.saveTrack(track);
//        Assert.assertEquals(track,savedUser);
//
//        //verify here verifies that userRepository save method is only called once
//        verify(trackRepository,times(1)).save(trackDto);
//
//    }
//
//
//    @Test(expected = UserAlreadyExistException.class)
//    public void saveUserTestFailure() throws UserAlreadyExistException {
//        TrackDto trackDto=trackMapper.trackToTrackDto(track);
//        when(trackRepository.save((TrackDto) any())).thenReturn(null);
//        Track savedUser = trackService.saveTrack(track);
//        System.out.println("savedUser" + savedUser);
//
//    }
//
//    @Test
//    public void getAllTracksTest() throws Exception{
//        List<TrackDto> trackList= Arrays.asList(new TrackDto(1,"tack name","track content","track status","bnm",123) ,
//                new TrackDto(2,"track name1","track content","track status1","asff",678));
//        when(trackRepository.findAll()).thenReturn(trackList);
//        List<Track> trackList1=trackService.getAllTrack();
//        Assert.assertEquals(trackList,trackList1);
//        verify(trackRepository,times(1)).findAll();
//    }
//
//    @Test
//    public void updateTrackTest() throws Exception{
//        TrackDto track1=new TrackDto(2,"track name1","track content","track status1","asfde",1243);
//        Optional<TrackDto> optional=Optional.of(track1);
//        when(trackRepository.save(track1)).thenReturn(track1);
//        when(trackRepository.findById(track1.getId())).thenReturn(optional);
//        Track track=trackMapper.TrackDtoToTrack(track1);
//        Track track2=trackService.updateTrack(track,2);
//        TrackDto trackDto=trackMapper.trackToTrackDto(track2);
//        Assert.assertEquals(track1,track2);
//        verify(trackRepository,times(1)).save(trackDto);
//    }
//}