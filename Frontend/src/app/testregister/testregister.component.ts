import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormGroup, FormControl } from '@angular/forms';
import { FormBuilder, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-testregister',
  templateUrl: './testregister.component.html',
  styleUrls: ['./testregister.component.css']
})
export class TestregisterComponent implements OnInit {
 
  url:string= "http://localhost:8080/Registration";
  userForm: FormGroup;
 fullName:string;
 email:string;
 companyName:string;
 jobRole:string;
 totalUserOrg:number;
 countryRegion:string;
  result:any;
  
  constructor(private http:HttpClient,private router: Router, private formBuilder: FormBuilder) { }
  
  ngOnInit() {
   this.userForm = this.formBuilder.group({
    fullName:[],
    email:[],
    companyName:[],
    jobRole:[],
    totalUserOrg:[],
    countryRegion:[]
  
   });
  }
  
  submit():void{
    // alert('login');
   // let url = this.url+"/"+this.Username+"/"+this.password;
  //  alert(this.url);
   this.http.post(this.url,this.userForm.value).subscribe(data=>{
    alert('Assessment Started');
    
    this.result = data;
  
   
   });
   this.router.navigate(['one']);
  }
  }