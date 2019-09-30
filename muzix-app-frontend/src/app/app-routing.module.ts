import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TrackListComponent} from './track-list/track-list.component';
import { TrackComponent } from './track/track.component';
import { HomeComponent } from './home/home.component';


const routes: Routes = [
  { path: '',component: HomeComponent},
  { path: 'tracks', component: TrackListComponent },
  {
    path : 'track/:searchString',
    component: TrackComponent
  }
  // { path: 'adduser', component: TrackFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
