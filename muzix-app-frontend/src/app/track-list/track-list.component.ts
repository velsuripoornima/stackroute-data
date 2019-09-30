import { Component, OnInit, Inject } from '@angular/core';
import { Track } from '../modals/Track';
import { TrackServiceService } from '../track-service.service';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
// import { MatDialog, MatDialogRef } from '@angular/material';
// import { DialogComponent } from '../dialog/dialog.component';
// import * as Toast from "nativescript-toast";
// import { ToastrService } from 'ngx-toastr';

export interface DialogData {
  animal: string;
  name: string;
}

@Component({
  selector: 'app-track-list',
  templateUrl: './track-list.component.html',
  styleUrls: ['./track-list.component.css']
})
export class TrackListComponent implements OnInit {

  tracks: Track[];
  public updateTrack : Track;
  public updatedComment : string;
 
  constructor(private trackService: TrackServiceService,public dialog: MatDialog) {
  }
 
  ngOnInit() {
    this.trackService.findAll().subscribe(data => {
      this.tracks = data;
    });
  }
  deleteTrack(track: Track){
    console.log(track);
    alert("track deleted successfully")
    this.trackService.deleteTrack(track.id).subscribe(data=>{
    // Toast.makeText("deleted successfully").show();
    // this.toastr.success('deleted successfully', 'Toastr fun!');
    this.trackService.findAll().subscribe(
      (data) => {this.tracks = data
        console.log(data);
      }
      
    )})
  }

  openDialog(track : Track) {
    this.updateTrack = track;
    const dialogRef = this.dialog.open(TrackListDialog,
      {
        width : '250px',
        data : {}
      });
    dialogRef.afterClosed().subscribe(result => {
      this.updatedComment = result;
      console.log('Dialog result: ${result}');
      console.log('updated comment:' , this.updatedComment);
      this.editTack();
    });
  }

  editTack()
  {
      this.updateTrack.name = this.updatedComment;
      this.trackService.updateTrack(this.updateTrack, this.updateTrack.id).subscribe(
        data => {
          this.trackService.findAll().subscribe(
            data => {this.tracks = data}
          )
        }
      );
  }
 }

 @Component({
  selector: 'track-list-dialog',
  templateUrl: 'track-list-dialog.html',
 })
 export class TrackListDialog {
  constructor(
    public dialogRef: MatDialogRef<TrackListDialog>,
    @Inject(MAT_DIALOG_DATA) public data: Track) {}
    onNoClick(): void {
      this.dialogRef.close();
    }
}

