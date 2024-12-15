import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  user:string=""

  constructor(public router:Router){}

  ngOnInit(): void {
    let obj=sessionStorage.getItem("emailid");
    if (obj!=null) {
      this.user=obj;
    }
  }
  
  logout():void {
    sessionStorage.clear();
    this.router.navigate(["/login"])
  }
}
