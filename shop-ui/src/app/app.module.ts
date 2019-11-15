import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BootAdminComponent } from './boot-admin/boot-admin.component';
import { BootAdminMainComponent } from './boot-admin-main/boot-admin-main.component';

@NgModule({
  declarations: [
    AppComponent,
    BootAdminComponent,
    BootAdminMainComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
