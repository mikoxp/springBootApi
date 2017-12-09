CREATE TABLE accounts(
  id SERIAL PRIMARY KEY ,
  login VARCHAR(100) NOT NULL,
  password VARCHAR(100) NOT NULL
);

INSERT INTO accounts (login,password) VALUES ('admin','21232f297a57a5a743894a0e4a801fc3');