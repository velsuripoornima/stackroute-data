import { Component, OnInit ,Output,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-component6',
  templateUrl: './component6.component.html',
  styleUrls: ['./component6.component.css']
})
export class Component6Component implements OnInit {

  //output decarator is used for send the output using eventemitter
  @Output() public parentComponent= new EventEmitter();
  constructor() { }

  ngOnInit() {
  }
//the content of the displaying message
  parentComponent1(){
     this.parentComponent.emit("getting data from child component to parent component")
   }

}
