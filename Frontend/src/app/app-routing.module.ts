import { DataFormComponent } from './data-form/data-form.component';
import { TamplateFormComponent } from './tamplate-form/tamplate-form.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


const routes: Routes = [
  { path: 'tamplateForm', component: TamplateFormComponent },
  { path: 'dateForm', component: DataFormComponent },
  { path: '', pathMatch: 'full', redirectTo: 'tamplateForm' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
