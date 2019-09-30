import { Component, OnInit ,Input } from '@angular/core';

@Component({
  selector: 'app-component4',
  templateUrl: './component4.component.html',
  styleUrls: ['./component4.component.css']
})
export class Component4Component implements OnInit {

  //using input decarator for receiving the input
  @Input() public component3;

  constructor() { }

  ngOnInit() {
  }
}
