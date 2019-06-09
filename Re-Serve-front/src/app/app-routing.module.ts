import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {
    path: 'giveaways',
    loadChildren: () => import('./giveaways/giveaways.module').then(mod => mod.GiveawaysModule)
  },
  {
    path: 'homepage',
    loadChildren: () => import('./homepage/homepage.module').then(mod => mod.HomepageModule)
  },
  {
    path: '',
    redirectTo: '',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
