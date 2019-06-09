import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomepageLandingComponent } from './homepage-landing/homepage-landing.component'

const routes: Routes = [
  {
    path: '',
    component: HomepageLandingComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomepageRoutingModule { }
