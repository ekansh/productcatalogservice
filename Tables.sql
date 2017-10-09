CREATE TABLE product (
    id int,
    name varchar(255),
    price DECIMAL(7,2),
	number_of_items int,
	PRIMARY KEY (id)
);

CREATE TABLE category (
    id int,
    name varchar(255),
	PRIMARY KEY (id),
	FOREIGN KEY (parent_category_id) REFERENCES category(id)
);
CREATE TABLE product_category (
    id int,
	PRIMARY KEY (id),
	FOREIGN KEY (categoryD) REFERENCES category(id),
	FOREIGN KEY (productId) REFERENCES product(id)
);

CREATE TABLE media (
    id int,
    name varchar(255),
	location varchar(255),
	PRIMARY KEY (id),
	FOREIGN KEY (productID) REFERENCES product(id)
);














