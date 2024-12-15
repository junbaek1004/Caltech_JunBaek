import { Component } from '@angular/core';
import { LoginService } from '../services/login.service';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  msg:string=''
  loginRef = new FormGroup ({
    emailid: new FormControl(),
    password: new FormControl()
  });

  constructor(public ls:LoginService, public router:Router) { }

  ngOnInit(): void {
    // Set the sessionStorage values for testing
    sessionStorage.setItem('registeredEmail', 'test@example.com');
    sessionStorage.setItem('registeredPassword', 'password123');
  }
checkLoginDetails(): void {
  let login = this.loginRef.value;
  console.log(login);
  this.msg=this.ls.checkLoginDetails(login);
  this.loginRef.reset();
}
}
