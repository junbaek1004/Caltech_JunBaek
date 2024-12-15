import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Meeting } from 'src/app/models/meeting.model';
import { ClientManagementService } from 'src/app/services/client-management.service';

@Component({
  selector: 'app-add-meeting',
  templateUrl: './add-meeting.component.html',
  styleUrls: ['./add-meeting.component.css']
})
export class AddMeetingComponent {
  meeting: Meeting = {
    clientName: '',
    date:'',
    time:'',
    purpose:'',
  }

  constructor(private meetingService: ClientManagementService,private router:Router) {}

  onSubmit() {
    if (this.meeting.clientName && this.meeting.date && this.meeting.time && this.meeting.purpose) {
      this.meetingService.addMeeting(this.meeting);
      console.log('Meeting added:',this.meeting)
      this.meeting = {
        clientName: '',
        date: '',
        time:'',
        purpose:'',
      }
      alert("Meeting Added")
    }
  }
  goToDashboard():void {
    this.router.navigate(["/home"])
  }
}
