CREATE TABLE people(
  person_id SERIAL PRIMARY KEY ,
  person_name VARCHAR(100) NOT NULL,
  person_surname VARCHAR(100) NOT NULL
);

INSERT INTO people (person_name,person_surname) VALUES ('John','Doe');
INSERT INTO people (person_name,person_surname) VALUES ('Tom','Nothing');