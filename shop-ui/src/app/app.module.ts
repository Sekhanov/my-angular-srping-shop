import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BootAdminComponent } from './boot-admin/boot-admin.component';
import { BootAdminMainComponent } from './boot-admin-main/boot-admin-main.component';
import {BootAdminUsersComponent} from "./boot-admin-users/boot-admin-users.component";

@NgModule({
  declarations: [
    AppComponent,
    BootAdminComponent,
    BootAdminMainComponent,
    BootAdminUsersComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
