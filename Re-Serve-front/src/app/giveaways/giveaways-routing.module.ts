import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ViewSearchResultsComponent } from './view-search-results/view-search-results.component'

const routes: Routes = [
  {
      path: '',
      component: ViewSearchResultsComponent
    }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class GiveawaysRoutingModule { }
