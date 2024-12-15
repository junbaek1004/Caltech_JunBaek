import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AddClientComponent } from './dashboard/add-client/add-client.component';
import { AddMeetingComponent } from './dashboard/add-meeting/add-meeting.component';
import { SchedulesComponent } from './dashboard/schedules/schedules.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { ReactiveFormsModule } from '@angular/forms';
import { ViewClientsComponent } from './dashboard/view-clients/view-clients.component';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    AddClientComponent,
    AddMeetingComponent,
    SchedulesComponent,
    LoginComponent,
    RegisterComponent,
    ViewClientsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
