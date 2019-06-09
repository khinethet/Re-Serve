import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-search-results',
  templateUrl: './view-search-results.component.html',
  styleUrls: ['./view-search-results.component.css']
})
export class ViewSearchResultsComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

}
