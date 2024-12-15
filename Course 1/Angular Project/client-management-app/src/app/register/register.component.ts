import { Component } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  name: string='';
  email: string = '';
  password: string='';

  constructor(private router: Router){}
  onRegister() {
    if(this.name && this.email && this.password) {

    
    sessionStorage.setItem('registeredEmail',this.email);
    sessionStorage.setItem('registeredPassword',this.password);
    alert("Registration Successful!");
    this.router.navigate(["/login"])
    } else {
      alert("Error. Please try again")
    }
  }
}
