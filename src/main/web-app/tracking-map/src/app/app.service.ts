import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  url = 'shipmentDetails';
  constructor(private http: HttpClient) { }

  getShipmentDetails(shipId) {
    return this.http.get(this.url + '?shipId='+shipId);
  }
}
