import { Component, OnInit ,Input } from '@angular/core';

@Component({
  selector: 'app-component3',
  templateUrl: './component3.component.html',
  styleUrls: ['./component3.component.css']
})
export class Component3Component implements OnInit {

 

  constructor() { }

  ngOnInit() {
  }

  displayName(value){
    // this.component3=this.component3;
    return console.log(value);
    // this.displayName(value);
  }
}
