CREATE DATABASE airport_db;
SELECT * FROM airport_db;
CREATE TABLE pilot(
id INT AUTO_INCREMENT,
first_name VARCHAR (255) NOT NULL,
last_name VARCHAR (255) NOT NULL,
pilot_range VARCHAR (255) NOT NULL,
pilot_code VARCHAR (100) UNIQUE NOT NULL,
PRIMARY KEY (id)
);
CREATE TABLE planer(
id INT auto_increment,
brand VARCHAR (255) NOT NULL,
model VARCHAR (255) NOT NULL,
count_passengers INT NOT NULL,
num_airplane VARCHAR (100) UNIQUE NOT NULL,
PRIMARY KEY (id)
);
CREATE TABLE flights(
id INT AUTO_INCREMENT,
airplane_id INT NOT NULL,
pilot_id INT NOT NULL,
date_num DATE  NOT NULL,
time_num TIME NOT NULL,
flights_num VARCHAR (100) UNIQUE NOT NULL,
PRiMARY KEY (id),
FOREiGN KEY (airplane_id) REFERENCES planer(id),
FOREiGN KEY (pilot_id) REFERENCES pilot(id)
);