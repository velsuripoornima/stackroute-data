import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { MatRippleModule } from '@angular/material';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
import {MatCardModule} from '@angular/material/card';


import { MatToolbarModule } from '@angular/material/toolbar';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SearchComponent } from './search/search.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { TrackComponent } from './track/track.component';
import { PlayListComponent } from './play-list/play-list.component';
import { from } from 'rxjs';
import { TrackListComponent, TrackListDialog } from './track-list/track-list.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { FlexLayoutModule } from "@angular/flex-layout";
import { MatMenuModule} from '@angular/material/menu';
import { DialogComponent } from './dialog/dialog.component';
import { MatDialogModule } from '@angular/material';
 import { ToastContainerModule } from 'ngx-toastr';
import { ToastrModule } from 'ngx-toastr';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    SearchComponent,
    NavbarComponent,
    FooterComponent,
    TrackComponent,
    PlayListComponent,
    TrackListComponent,
    DialogComponent,
    TrackListDialog,
    HomeComponent
  ],
  imports: [
    
    MatRippleModule,
    MatFormFieldModule,
    MatButtonModule,
    MatIconModule,
    MatToolbarModule,
    BrowserAnimationsModule,
    BrowserModule,
    AppRoutingModule,
    MatInputModule,
    HttpClientModule,
    FormsModule,
    MatCardModule,
    FlexLayoutModule,
    MatMenuModule,
    MatDialogModule,
    ToastContainerModule,
    ToastrModule
    
  ],
  entryComponents :[TrackListComponent, TrackListDialog],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
