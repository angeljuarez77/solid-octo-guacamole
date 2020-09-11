import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CpusComponent } from "./cpus/cpus.component";
import { GpusComponent } from './gpus/gpus.component';
import { MotherboardsComponent } from './motherboards/motherboards.component';
import { WelcomeComponent } from './welcome/welcome.component';

// motherboards
// gpus
// cpus
const routes: Routes = [
  { path: 'cpus', component: CpusComponent },
  { path: 'motherboards', component: MotherboardsComponent},
  { path: 'gpus', component: GpusComponent },
  { path: '', component: WelcomeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
