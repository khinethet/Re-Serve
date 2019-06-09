import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-homepage-landing',
  templateUrl: './homepage-landing.component.html',
  styleUrls: ['./homepage-landing.component.css']
})
export class HomepageLandingComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

}
