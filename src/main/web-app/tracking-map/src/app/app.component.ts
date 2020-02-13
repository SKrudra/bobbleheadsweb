import { Component } from '@angular/core';
import { MouseEvent } from '@agm/core';
declare var L : any;
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  private map: any;


  constructor() {
  }


  ngOnInit() {


    L.mapquest.key = 'lYrP4vF3Uk5zgTiGGuEzQGwGIVDGuy24';

    this.map = L.mapquest.map('map', {

      center: [37.7749, -122.4194],

      layers: L.mapquest.tileLayer('map'),

      zoom: 12

    });


    this.map.addControl(L.mapquest.control());

  }
}
