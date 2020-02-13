import {Component} from '@angular/core';

import {AppService} from './app.service';

declare var L : any;
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  private map: any;
  shipmentId;


  constructor(private service: AppService) {
  }

  track(){
    console.log("shipmentId: ", this.shipmentId);
    this.service.getShipmentDetails(this.shipmentId).subscribe(data => {
      console.log("data: ", data);
    });
  }



  ngOnInit() {


    L.mapquest.key = 'ciTzzbfKR5ZGZu9tLPkPldCqq9DfPryD';

    this.map = L.mapquest.map('map', {

      center: [37.7749, -122.4194],

      layers: L.mapquest.tileLayer('map'),

      zoom: 6

    });


    this.map.addControl(L.mapquest.control());

    var directions = L.mapquest.directions();
    directions.route({
      start: 'San Francisco, CA',
      end: 'San Jose, CA'
    }, (err, response) => { console.log(response);
      var customLayer = L.mapquest.directionsLayer({
        startMarker: {
          icon: 'circle',
          iconOptions: {
            size: 'sm',
            primaryColor: '#1fc715',
            secondaryColor: '#1fc715',
            symbol: 'A'
          },
          title: 'Drag to change location'
        },
        endMarker: {
          icon: 'circle',
          iconOptions: {
            size: 'sm',
            primaryColor: '#e9304f',
            secondaryColor: '#e9304f',
            symbol: 'B'
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

  createMap(err, response) {
       var customLayer = L.mapquest.directionsLayer({
      startMarker: {
        icon: 'circle',
        iconOptions: {
          size: 'sm',
          primaryColor: '#1fc715',
          secondaryColor: '#1fc715',
          symbol: 'A'
        },
        title: 'Drag to change location'
      },
      endMarker: {
        icon: 'circle',
        iconOptions: {
          size: 'sm',
          primaryColor: '#e9304f',
          secondaryColor: '#e9304f',
          symbol: 'B'
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
  }
}
