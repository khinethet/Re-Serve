import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomepageLandingComponent } from './homepage-landing.component';

describe('HomepageLandingComponent', () => {
  let component: HomepageLandingComponent;
  let fixture: ComponentFixture<HomepageLandingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomepageLandingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomepageLandingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
