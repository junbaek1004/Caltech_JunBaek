import { Injectable } from '@angular/core';
import { Client } from '../models/client.model';
import { Meeting } from '../models/meeting.model';

@Injectable({
  providedIn: 'root'
})
export class ClientManagementService {
  private clients: Client[] = [];
  private meetings: Meeting[] = [];

  constructor() { }

  addClient(client:Client) {
    this.clients.push(client);
    console.log('Client added', client);
  }

  getClients() {
    return this.clients;
  }

  addMeeting(meeting:Meeting) {
    this.meetings.push(meeting);
    console.log('Meeting added', meeting);
  }

  getMeetings() {
    return this.meetings;
  }

}
