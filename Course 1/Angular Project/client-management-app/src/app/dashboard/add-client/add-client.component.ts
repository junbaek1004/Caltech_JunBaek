import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Client } from 'src/app/models/client.model';
import { ClientManagementService } from 'src/app/services/client-management.service';

@Component({
  selector: 'app-add-client',
  templateUrl: './add-client.component.html',
  styleUrls: ['./add-client.component.css']
})
export class AddClientComponent {
  client: Client = {name:'', email:'', type:'', memo:''};

  constructor(private clientAddService: ClientManagementService, private router: Router)  {}

  onSubmit() {
    if (this.client.name && this.client.email) {
      this.clientAddService.addClient(this.client);
      console.log('Client added:', this.client);

      sessionStorage.setItem('lastClientName',this.client.name);
      sessionStorage.setItem('lastClientEmail',this.client.email);
      sessionStorage.setItem('lastClientType',this.client.type);
      sessionStorage.setItem('lastClientMemo',this.client.memo);

      this.client = {name:'', email:'',type:'',memo:''};

      alert ("Client Added")
    }
  }

  goToDashboard():void {
    this.router.navigate(["/home"])
  }
  
  
  ngOnInit() {

  }

}
