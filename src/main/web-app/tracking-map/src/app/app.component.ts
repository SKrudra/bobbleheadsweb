import {Component} from '@angular/core';

import {AppService} from './app.service';
import {ActivatedRoute} from "@angular/router";
import {CheckCall, Shipment} from "./models";

declare var L : any;
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  private map: any;
  shipmentId;
  shipmentData: Shipment;
  displayedColumns: string[] = ['checkCalltype', 'createdDateTime', 'locationName', 'stopType', 'comments'];
  dataSource: CheckCall[];

  constructor(private service: AppService, private route: ActivatedRoute) {
  }

  ngOnInit() {

    this.route.queryParams
      .subscribe(
      params => {
        this.shipmentId = params['shipment'];
        if(this.shipmentId) {
          this.service.getShipmentDetails(this.shipmentId)
            .subscribe((data: Shipment) => {
              this.shipmentData = data;
              this.dataSource = this.shipmentData.checkcalls;
              this.initMap();
            });
        }

      });
  }

  private getLocation(isPickup: boolean) {
    if(isPickup) {
      return this.shipmentData.stops[0].city + ' ' + this.shipmentData.stops[0].state;
    } else {
      return this.shipmentData.stops[1].city + ' ' + this.shipmentData.stops[1].state;
    }
  }

  private initMap() {

    L.mapquest.key = 'ciTzzbfKR5ZGZu9tLPkPldCqq9DfPryD';

    this.map = L.mapquest.map('map', {

      center: [37.7749, -122.4194],

      layers: L.mapquest.tileLayer('map'),

      zoom: 6

    });


    this.map.addControl(L.mapquest.control());

    var directions = L.mapquest.directions();
    directions.route({
      start: this.getLocation(true),
      end: this.getLocation(false)
    }, (err, response) => {
      var customLayer = L.mapquest.directionsLayer({
        startMarker: {
          icon: 'circle',
          iconOptions: {
            size: 'sm',
            primaryColor: '#1fc715',
            secondaryColor: '#1fc715',
            symbol: 'P'
          },
          title: 'Drag to change location'
        },
        endMarker: {
          icon: 'circle',
          iconOptions: {
            size: 'sm',
            primaryColor: '#e9304f',
            secondaryColor: '#e9304f',
            symbol: 'D'
          },
          title: 'Drag to change location'
        },
        routeRibbon: {
          color: "#2aa6ce",
          opacity: 1.0,
          showTraffic: false
        },
        directionsResponse: response
      });
      customLayer.addTo(this.map);
    });

  }
}
