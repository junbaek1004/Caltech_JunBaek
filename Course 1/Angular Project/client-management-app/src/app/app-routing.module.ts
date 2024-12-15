import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AddClientComponent } from './dashboard/add-client/add-client.component';
import { SchedulesComponent } from './dashboard/schedules/schedules.component';
import { AddMeetingComponent } from './dashboard/add-meeting/add-meeting.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { ViewClientsComponent } from './dashboard/view-clients/view-clients.component';

const routes: Routes = [
  {path:"home",component:DashboardComponent},
  {path:"add_client",component:AddClientComponent},
  {path:"schedules",component:SchedulesComponent},
  {path:"add_meeting",component:AddMeetingComponent},
  {path:"",redirectTo:"login",pathMatch:"full"},
  {path:"login",component:LoginComponent},
  {path:"register",component:RegisterComponent},
  {path:"view_clients",component:ViewClientsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
