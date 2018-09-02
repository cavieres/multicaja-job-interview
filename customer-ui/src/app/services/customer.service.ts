import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Observable} from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class CustomerService {
  constructor(private http: HttpClient) { }

  getCustomers() {
    return this.http.get('/server/tenants/29/customers');
  }

  getCustomer(id: number) {
    return this.http.get('/server/tenants/29/customer/' + id);
  }

  createCustomerRegistration(customer) {
    let body = JSON.stringify(customer);
    return this.http.post('/server/tenants/29/customers', body, httpOptions);
  }
}
