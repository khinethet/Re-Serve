import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewSearchResultsComponent } from './view-search-results.component';

describe('ViewSearchResultsComponent', () => {
  let component: ViewSearchResultsComponent;
  let fixture: ComponentFixture<ViewSearchResultsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewSearchResultsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewSearchResultsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
