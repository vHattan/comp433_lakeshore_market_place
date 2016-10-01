CREATE TABLE partner
(
  id int NOT NULL AUTO_INCREMENT,
  company_name VARCHAR (255) NOT NULL,
  adress VARCHAR (255) NOT NULL,
  city VARCHAR (255) NOT NULL,
  state VARCHAR (255) NOT NULL,
  postal_code VARCHAR (255) NOT NULL,
  country VARCHAR (255) NOT NULL,
  phone VARCHAR (255) NOT NULL,
  email VARCHAR (255) NOT NULL,
  URL VARCHAR (255) NOT NULL,
  payment_methods VARCHAR (255) NOT NULL,
  type VARCHAR (255) NOT NULL,
  current_order VARCHAR (255) NOT NULL,
  logo VARCHAR (255) NOT NULL,
  PRIMARY KEY (id)
);
