--CREATE TABLE books (
--  id NUMBER PRIMARY KEY,
--title	VARCHAR(100) NOT NULL,
--publish_date	DATE,
--author	VARCHAR(50) NOT NULL,
--type	VARCHAR(50) NOT NULL,
--price	NUMBER,
--num_of_pages	NUMBER,
--publisher	VARCHAR(50) NOT NULL,
--language	VARCHAR(50) NOT NULL,
--isbn	VARCHAR(13) NOT NULL,
--);
--
---- Create Sequences
--
--CREATE SEQUENCE id_seq;

INSERT INTO book (id, title, publish_date, author, type, price, num_of_pages, publisher, language,
isbn) VALUES (id_seq.NEXTVAL, 'Learn You a Haskell',  '1995-01-02 07:13:30','Miran Lipovaca', 'Hardcover', 33.33, 200, 'RedRiver Pub','English','000-222');
INSERT INTO book (id, title, publish_date, author, type, price, num_of_pages, publisher, language,
isbn)  VALUES (id_seq.NEXTVAL, 'A Storm of Swords',  '2010-12-13 07:13:30','Miran Lipovaca', 'Hardcover', 33.33, 200, 'RedRiver Pub','English','000-222');
INSERT INTO book (id, title, publish_date, author, type, price, num_of_pages, publisher, language,
isbn) VALUES (id_seq.NEXTVAL, 'Thinking with Type',  '2000-12-15 07:13:30','Miran Lipovaca', 'Hardcover', 33.33, 200, 'RedRiver Pub','English','000-222');
INSERT INTO book (id, title, publish_date, author, type, price, num_of_pages, publisher, language,
isbn) VALUES (id_seq.NEXTVAL, 'A Dance with Dragons',  '2013-01-23 07:13:30','Miran Lipovaca', 'Hardcover', 33.33, 200, 'RedRiver Pub','English','000-222');
INSERT INTO book (id, title, publish_date, author, type, price, num_of_pages, publisher, language,
isbn) VALUES (id_seq.NEXTVAL, 'Expert Python Programming',  '2010-09-17 07:13:30','Miran Lipovaca', 'Hardcover', 33.33, 200, 'RedRiver Pub','English','000-222');
INSERT INTO book (id, title, publish_date, author, type, price, num_of_pages, publisher, language,
isbn) VALUES (id_seq.NEXTVAL, 'Spring in Action',  '2000-11-27 07:13:30','Miran Lipovaca', 'Hardcover', 33.33, 200, 'RedRiver Pub','English','000-222');
