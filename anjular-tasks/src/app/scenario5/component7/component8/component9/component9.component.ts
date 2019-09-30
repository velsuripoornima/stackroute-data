import { Component, OnInit , EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-component9',
  templateUrl: './component9.component.html',
  styleUrls: ['./component9.component.css']
})
export class Component9Component implements OnInit {

  @Output() public parentComponent= new EventEmitter();
  constructor() { }

  ngOnInit() {
  }
  displayName(value){
    this.parentComponent.emit(value);
  }
}
