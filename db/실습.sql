CREATE TABLE customer(
    id VARCHAR2(10),
    pwd VARCHAR2(10),
    name VARCHAR2(10)
);

CREATE TABLE product(
    prod_no VARCHAR2(10),
    prod_name VARCHAR2(30),
    prod_price NUMBER(8),
    prod_mf_dt DATE
    );

ALTER TABLE customer
ADD buildingno CHAR(25);

INSERT INTO customer (id,pwd,name,buildingno) VALUES ('id1','p1','n1',NULL);
INSERT INTO customer (id,pwd,name,buildingno) VALUES ('id2','p2','n2',NULL);
INSERT INTO customer (id,pwd,name,buildingno) VALUES ('id3','p3','n3',NULL);
INSERT INTO customer (id,pwd,name,buildingno) VALUES ('id4','p4','n4',NULL);

INSERT INTO product values 
('C0001', '아메리카노', 1000, '21/06/02'),
('C0002', 'ICE아메리카노', 1000, '21/06/02'),
('C0003', '카페라떼', 1500, '21/06/02'),
('G0001', '텀블러1', 5000, '21/06/02'),
('G0002', '다이어리1', 6000, '21/06/02'),
('F0001', '치즈케익', 4000, '21/06/02'),
('F0002', '바나나', 2000, '21/06/02'),