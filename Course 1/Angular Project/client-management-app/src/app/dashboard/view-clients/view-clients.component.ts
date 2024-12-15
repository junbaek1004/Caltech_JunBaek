import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Client } from 'src/app/models/client.model';
import { ClientManagementService } from 'src/app/services/client-management.service';

@Component({
  selector: 'app-view-clients',
  templateUrl: './view-clients.component.html',
  styleUrls: ['./view-clients.component.css']
})
export class ViewClientsComponent implements OnInit {
  clients:Client[] = [];

  constructor(private clientService: ClientManagementService, private router:Router) {}

  ngOnInit(): void {
    this.clients = this.clientService.getClients();
  }
  goToDashboard():void {
    this.router.navigate(["/home"])
  }
}
