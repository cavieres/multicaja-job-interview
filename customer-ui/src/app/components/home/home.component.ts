import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../../services/customer.service'
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Observable, throwError } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  customerform: FormGroup;
  validMessage: string = "";

  constructor(private customerService: CustomerService) { }

  ngOnInit() {
    this.customerform = new FormGroup({
      nombre_completo: new FormControl('', Validators.required),
      rut: new FormControl('', Validators.required),
    });
  }

  submitRegistration() {

    if (this.customerform.valid) {
      this.validMessage = "Registration done.";
      this.customerService.createCustomerRegistration(this.customerform.value).subscribe(
        data => {
          this.customerform.reset();
          return true;
        },
        error => {
          return throwError(error);
        }
      )
    } else {
      this.validMessage = "Please fill out the form before submitting!";
    }

  }

}
