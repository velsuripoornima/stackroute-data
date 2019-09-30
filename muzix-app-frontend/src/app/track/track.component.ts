import { Component, OnInit } from '@angular/core';
import { Track } from '../modals/Track';
import { TrackServiceService } from '../track-service.service';
import { ParamMap, ActivatedRoute } from '@angular/router';
// import * as Toast from "nativescript-toast";

@Component({
  selector: 'app-track',
  templateUrl: './track.component.html',
  styleUrls: ['./track.component.css']
})
export class TrackComponent implements OnInit {

  constructor(private muzixService : TrackServiceService,private route: ActivatedRoute) { }

  public tracks : Track[];
  public track : Track;

  ngOnInit() {
    this.route.paramMap.subscribe((params: ParamMap) =>
    {
      let searchString = params.get('searchString');
      this.muzixService.getLastFmTracks(searchString).subscribe((data) => {
      this.tracks = data.results.trackmatches.track;
      console.log("result is ",this.tracks);
    });
    })  
  }
 
  async saveTrack(track: Track) {
    this.muzixService.findAll().subscribe((data) => {
      let isExists: boolean;
      data.forEach(
        (item) => {
          if (item.url == track.url) {
            alert("Track Already exists");
            isExists = true;
          }
        })
      if (!isExists) {
        console.log(track);
        alert("Added to playList")
        this.muzixService.saveTrack(track).subscribe((data) => {
          this.track = data;
          console.log("result is ", this.track);
        });
      }
    })
  }

  updateTrack(track: Track,id:number){
    console.log(track)
    alert("Track is updated")
    this.muzixService.updateTrack(track,id).subscribe((data)=>{
      this.track=data
    })
    // Toast.makeText("Track name updated successfully").show();
  }
 
}
