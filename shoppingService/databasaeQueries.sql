CREATE TABLE category(
	id IDENTITY,
	name varchar(50),
	description varchar(300),
	image_url varchar(100),
	is_active boolean,
	
	constraint pk_category_id PRIMARY KEY (id)
)

CREATE TABLE sub_category(
	id IDENTITY,
	category_id INT, 
	name varchar(50),
	description varchar(300),
	image_url varchar(100),
	is_active boolean,
	
	constraint pk_sub_category_id PRIMARY KEY (id),
	constraint fk_category_id FOREIGN KEY (category_id) references category(id)
)

CREATE TABLE user_profile(
	id IDENTITY,
	username varchar(50),
	firstname varchar(50),
	lastname varchar(50),
	role varchar(50),
	email varchar(50),
	phone varchar(10),
	is_phone_verified boolean,
	is_email_verified boolean,
	is_active boolean,
	
	
	constraint pk_user_profile_id PRIMARY KEY (id)
)


CREATE TABLE product_details(
	id IDENTITY,
	actual_price DECIMAL(10,2),
	normal_price DECIMAL(10,2),
	offer_price DECIMAL(10,2),
	min_qty INT,
	max_qty INT,
	tax_category_id INT,
	active_from DATE,
	active_to DATE,
	product_name varchar(50),
	product_description varchar(1000),
	is_active boolean,
	constraint pk_product_details_id PRIMARY KEY (id),
)

CREATE TABLE product(
	id IDENTITY,
	sub_category_id INT,
	category_id INT,
	product_details_id INT,
	is_active boolean,
	
	
	constraint pk_product_id PRIMARY KEY (id),
	constraint fk_product_category_id FOREIGN KEY (category_id) references category(id),
	constraint fk_product_sub_category_id FOREIGN KEY (sub_category_id) references sub_category(id),
	constraint fk_product_details_id FOREIGN KEY (product_details_id) references product_details(id)
)
