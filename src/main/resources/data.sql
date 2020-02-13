insert into Shipment_Info(ID,EARLIEST_ORIGIN_DATE,LATEST_ORIGIN_DATE,EARLIEST_DESTINATION_DATE,LATEST_DESTINATION_DATE,STATUS,COMMENTS,
HEALTH_STATUS_CODE,HEALTH_REASON) values (201,{ts '2020-02-12 18:47:52.69'},{ts '2020-02-12 20:47:52.69'},
{ts '2020-02-13 08:47:52.69'},{ts '2020-02-13 15:47:52.69'},'TENDER ACCEPT','Handel with care','GOOD','Fast driving');
/*please use locations from the USA. Judges won't know Warngal*/
insert into Stop(ID,STOP_SEQ, NAME,CITY,STATE,POSTAL_CODE,COUNTRY,LATITUDE,LONGITUDE,CONTACT_NAME,SHIPMENT_ID) values
(301,1,'Frisco','Dallas','TX','75033','USA', 33.1507,96.8236,'Chris Martin','201'),
(302,99,'San Francisco','San Francisco','CA','95008','USA',37.3382,121.8863,'Donald Trump','201');

insert into Check_Call (ID,CHECK_CALLTYPE,CREATED_DATE_TIME,LOCATION_NAME,LATITUDE,LONGITUDE,STATUS_DESC, STATUS_CODE,STOP_TYPE,CITY,
STATE,COMMENTS,SHIPMENT_ID) values (101,'ARRIVAL',{ts '2020-02-13 18:47:52.69'},'GAR INFOBAN',40.873647,-109.392029,'Past Appointment Time ; 1.9 Hours BEHIND (Past Appointment without Arrival Call); Distance to Stop 43.09 miles',
null,'DROPOFF','ANN ARBOR','MI','ON TIME',201);

