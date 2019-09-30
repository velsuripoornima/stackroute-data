import { Component, OnInit } from '@angular/core';
import { TrackServiceService } from '../track-service.service';
import { Track } from '../modals/Track';
import { Router } from '@angular/router';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  constructor(private trackService : TrackServiceService, private router : Router) { }

  ngOnInit() {

  }

  public results : Track[];

  getLastFmTracks(searchString){
    

    this.trackService.getLastFmTracks(searchString).subscribe((data) => {
      this.results = data.results.trackmatches.track;
      console.log("result is ",this.results);
    });

    this.router.navigate(["/track",searchString]);
  }

}
