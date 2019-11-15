import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {BootAdminMainComponent} from "./boot-admin-main/boot-admin-main.component";
import {BootAdminComponent} from "./boot-admin/boot-admin.component";
import {AppComponent} from "./app.component";


const routes: Routes = [
  {path: '', component: BootAdminComponent,
    children: [
      {path: '', component: BootAdminMainComponent}
    ]
  },
  {path: 'shop', component: BootAdminMainComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
