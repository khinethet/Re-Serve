import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { GiveawaysRoutingModule } from './giveaways-routing.module';
import { ViewSearchResultsComponent } from './view-search-results/view-search-results.component';

@NgModule({
  declarations: [ViewSearchResultsComponent],
  imports: [
    CommonModule,
    GiveawaysRoutingModule
  ]
})
export class GiveawaysModule { }
