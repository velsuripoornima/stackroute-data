import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Component12Component } from './component12.component';

describe('Component12Component', () => {
  let component: Component12Component;
  let fixture: ComponentFixture<Component12Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Component12Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Component12Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
