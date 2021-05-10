import { Employee } from '../employee';
import { Component, OnInit, Input } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {

  public id: number=0;
  employee:any

  constructor(private route: ActivatedRoute,private employeeService: EmployeeService){}
  ngOnInit() :void{
    
    this.id = this.route.snapshot.params['id'];
    
    this.employee = new Employee();
    this.employeeService.getEmployeeById(this.id).subscribe(data=>{
      this.employee=data;
    });
  }
}
