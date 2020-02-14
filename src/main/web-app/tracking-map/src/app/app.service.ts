import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  url = '/getshipmentDetails';
  checkcallUrl = '/getCheckCalls'
  constructor(private http: HttpClient) { }

  getShipmentDetails(shipId) {
    return this.http.get(this.url + '?shipId='+shipId);
  }

  getCheckcalls(shipId, checkcallId) {
    return this.http.get(this.checkcallUrl + '?shipId='+shipId+'&checkCallId='+checkcallId);
  }
}
