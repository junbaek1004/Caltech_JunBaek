import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Meeting } from 'src/app/models/meeting.model';
import { ClientManagementService } from 'src/app/services/client-management.service';

@Component({
  selector: 'app-schedules',
  templateUrl: './schedules.component.html',
  styleUrls: ['./schedules.component.css']
})
export class SchedulesComponent implements OnInit {
meetings: Meeting[]= [];

constructor(private clientService: ClientManagementService,private router:Router) {}

ngOnInit(): void {
  this.meetings = this.clientService.getMeetings();
}
goToDashboard():void {
  this.router.navigate(["/home"])
}
}
