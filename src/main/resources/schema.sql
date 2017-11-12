CREATE database yummyback;

USE yummyback;

# dish_id => A00,....Z99
CREATE TABLE dish (
  dish_id VARCHAR(3) NOT NULL,
  price INT NOT NULL,
  PRIMARY KEY (dish_id));

# conjunction table dish <=> feedback
# feedback_id is a uuid with length 36
CREATE TABLE feedback_link (
  feedback_id VARCHAR(36) NOT NULL,
  dish_id VARCHAR(3) NOT NULL,
  submitted TINYINT NOT NULL,
  PRIMARY KEY (feedback_id),
  FOREIGN KEY (dish_id) REFERENCES dish(dish_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

CREATE TABLE feedback (
  feedback_id VARCHAR(36) NOT NULL,
  service INT NULL,
  quality INT NULL,
  cleanliness INT NULL,
  food_value INT NULL,
  res_time INT NULL,
  comments VARCHAR(200) NULL,
  email VARCHAR(255) NULL,
  datetime VARCHAR(17) NOT NULL,
  mobile VARCHAR(10) NULL,
  PRIMARY KEY (feedback_id));