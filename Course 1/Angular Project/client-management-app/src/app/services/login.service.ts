import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class LoginService { 

  constructor(public router:Router) { }

  checkLoginDetails(login:any):string {
    const registeredEmail = sessionStorage.getItem('registeredEmail');
    const registeredPassword = sessionStorage.getItem('registeredPassword');

    if(login.emailid ===registeredEmail && login.password === registeredPassword) {
      alert ("Successfully Logged In");
      sessionStorage.setItem('emailid',login.emailid);
      this.router.navigate(["/home"],{skipLocationChange:true})
      return "Success"
    } else {
      alert("Login Failed. Please Try Again")
      return "Failure"
    }

  }
}
