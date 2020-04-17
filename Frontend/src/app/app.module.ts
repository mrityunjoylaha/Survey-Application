import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';



import { FormsModule, ReactiveFormsModule } from '@angular/forms';


import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestregisterComponent } from './testregister/testregister.component';
import { Form1Component } from './form1/form1.component';

@NgModule({
  declarations: [
    AppComponent,
    TestregisterComponent,
    Form1Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
