import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import {AppService} from './app.service';
import {RouterModule} from "@angular/router";
import {MatCardModule} from "@angular/material/card";
import {MatCommonModule} from "@angular/material/core";
import {MatIconModule, MatTableModule} from "@angular/material";

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    MatCardModule,
    MatCommonModule,
    MatIconModule,
    MatTableModule,
    RouterModule.forRoot([])
  ],
  providers: [AppService],
  bootstrap: [AppComponent]
})
export class AppModule { }
