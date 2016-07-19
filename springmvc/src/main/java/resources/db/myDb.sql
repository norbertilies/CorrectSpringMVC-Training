DROP TABLE IF EXISTS usr;


CREATE TABLE usr(
  id varchar(2) NOT NULL;
  username varchar(50) NOT NULL,
  passwrod varchar(50) NOT NULL,
  age number(3),
  PRIMARY KEY(id);
);

