import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  // title = 'muzix-app-frontend';
  title: string;
 
  constructor() {
    this.title = 'Spring Boot - Angular Application';
  }
}
