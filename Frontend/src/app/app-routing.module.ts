import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TestregisterComponent } from './testregister/testregister.component';
import { Form1Component } from './form1/form1.component';


const routes: Routes = [
  { path: 'register', component: TestregisterComponent},
  { path: '', component: Form1Component}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
