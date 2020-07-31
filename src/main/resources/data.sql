DROP TABLE IF EXISTS train_details;
 
CREATE TABLE train_details (
  id  INT AUTO_INCREMENT  PRIMARY KEY,
  train_code INT(250),
  train_name VARCHAR(250) NOT NULL,
  source VARCHAR(250) NOT NULL,
  destination VARCHAR(250) NOT NULL,
  departure VARCHAR(250) NOT NULL,
  arrival VARCHAR(250) NOT NULL,
  current_location VARCHAR(250) NOT NULL,
  root VARCHAR(500) NOT NULL
);

insert into train_details(train_code,train_name,source,destination,departure,arrival,current_location,root) values (123456,'Test Exp','MAS','SA','00:50','06:00','Vellore','MAS,ARAK,KPD,MOR,SA');
insert into train_details(train_code,train_name,source,destination,departure,arrival,current_location,root) values (123456,'Chennai - Kumari Exp','KK','MAS','00:50','06:00','Vellore','');

insert into train_details(train_code,train_name,source,destination,departure,arrival,current_location,root) values (12675,'Kovai Express','MAS','CBE','06:10','14:05','Erode','MAS,ARAK,KPD,SA,EDE,CBE');
insert into train_details(train_code,train_name,source,destination,departure,arrival,current_location,root) values (12676,'Kovai Express','CBE','MAS','15:15','23:00','Salem','CBE,EDE,SA,KPD,ARAK,MAS');

insert into train_details(train_code,train_name,source,destination,departure,arrival,current_location,root) values (12680,'Intercity Express','CBE','MAS','06:15','13:50','Erode','');
insert into train_details(train_code,train_name,source,destination,departure,arrival,current_location,root) values (12679,'Intercity Express','MAS','CBE','14:30','22:15','Salem','');

insert into train_details(train_code,train_name,source,destination,departure,arrival,current_location,root) values (12675,'Pandiyan Superfast Express','MAS','MDU','06:15','21:20','Dindigul','');
insert into train_details(train_code,train_name,source,destination,departure,arrival,current_location,root) values (12638,'Pandiyan Superfast Express','MDU','MAS','05:35','20:35','Villupuram','');

insert into train_details(train_code,train_name,source,destination,departure,arrival,current_location,root) values (12635,'Vaigai SF Express','MAS','MDU','12:25','13:20','Ariyalur','');
insert into train_details(train_code,train_name,source,destination,departure,arrival,current_location,root) values (12636,'Vaigai SF Express','MDU','MAS','14:40','07:00','Villupuram','');

DROP TABLE IF EXISTS station_details;

CREATE TABLE station_details (
  id  INT AUTO_INCREMENT  PRIMARY KEY,
  station_code VARCHAR(250),
  station_name VARCHAR(250) NOT NULL
);

insert into station_details(station_code,station_name) values ('MAS','Chennai Central');
insert into station_details(station_code,station_name) values ('SA','Salem Junction');
insert into station_details(station_code,station_name) values ('ED','Erode Junction');
insert into station_details(station_code,station_name) values ('KPD','Katpadi Junction');
insert into station_details(station_code,station_name) values ('TBM','Tambaram Station');


