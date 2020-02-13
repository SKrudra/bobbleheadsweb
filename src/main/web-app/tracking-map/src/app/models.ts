export interface Shipment {
  id: number;
  stops: Stop[];
  comments: string;
  checkcalls: CheckCall[];
  healthReason: string;
  status: string;
}

export interface Stop {
  id: number;
  stopSeq: number;
  name: string;
  city: string;
  state: string;
  postalCode: number;
  contactName: string;
  latitude: number;
  longitude: number;
}

export interface CheckCall {
  id: number;
  checkCalltype: string;
  createdDateTime: string;
  locationName: string;
  latitude: number;
  longitude: number;
  statusDesc: string;
  statusCode: string;
  stopType: string;
  city: string;
  state: string;
  comments: string;
}
