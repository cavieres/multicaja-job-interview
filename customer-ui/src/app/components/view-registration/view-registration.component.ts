import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../../services/customer.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-view-registration',
  templateUrl: './view-registration.component.html',
  styleUrls: ['./view-registration.component.css']
})
export class ViewRegistrationComponent implements OnInit {

  public customerReg;

  constructor(private customerService: CustomerService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.getCustomerReg(this.route.snapshot.params.id);
  }

  getCustomerReg(id:number) {
    this.customerService.getCustomer(id).subscribe(
      data => {
        this.customerReg = data;
      },
      err => console.error(err),
      () => console.log('customers loaded')
    )
  }
}
