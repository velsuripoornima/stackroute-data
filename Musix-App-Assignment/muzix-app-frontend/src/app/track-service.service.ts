import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Track } from './modals/Track';
import {Observable, from} from 'rxjs';
// import { Result} from 
import { HttpParams} from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
import { Result } from './modals/Result';
// import { Guid } from "guid-typescript";


const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
    'Authorization': 'my-auth-token'
  })
};

@Injectable({
  providedIn: 'root'
})
export class TrackServiceService {

  private tracksUrl: string;
 
  constructor(private http: HttpClient) {
    this.tracksUrl = 'http://localhost:8090/track';
  }
 
  public findAll(): Observable<Track[]> {
    return this.http.get<Track[]>(this.tracksUrl);
  }

  public results : any;

  getLastFmTracks(searchString : string) : Observable<Result>
  {
    let params = new HttpParams();
    params = params.append('track', searchString);
    
    var url = 'http://ws.audioscrobbler.com/2.0/?method=track.search&api_key=d49c2ee6942b4ad28ef6334c4591f231&format=json';
    return this.http.get<Result>(url,{params: params});
    // return this.results;
  }

 
  saveTrack(track : Track) : Observable<Track>
  {
    // var postUrl = "http://localhost:8090/track";

    // track.id = Guid.create();
    return this.http.post<Track>(this.tracksUrl, track, httpOptions);
    // .pipe(
    //   catchError(this.handleError('addTrack', track))
    // );
  }


  deleteTrack (id: number): Observable<{}> {
    const url = `${this.tracksUrl}/${id}`;
    return this.http.delete(url, httpOptions)
      // .pipe(
      //   catchError(this.handleError('deleteHero'))
      // );
  }


  updateTrack (track: Track,id:number): Observable<Track> {
    return this.http.put<Track>(this.tracksUrl+"/"+id,track,httpOptions)
      // .pipe(
      //   catchError(this.handleError('updateHero', hero))
      // );
  }

}
