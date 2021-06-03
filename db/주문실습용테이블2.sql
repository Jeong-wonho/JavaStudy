CREATE TABLE "HR"."CUSTOMER" 
   (	"ID" VARCHAR2(10 BYTE), 
	"PWD" VARCHAR2(10 BYTE), 
	"NAME" VARCHAR2(10 BYTE) CONSTRAINT "CUSTOMER_NAME_NN" NOT NULL , 
	"BUILDINGNO" CHAR(25 BYTE), 
	 CONSTRAINT "CUSTOMER_ID_PK" PRIMARY KEY ("ID")
     );
DROP TABLE product;
CREATE TABLE "HR"."PRODUCT" 
   (	"PROD_NO" VARCHAR2(10 BYTE) CONSTRAINT prod_no_pk PRIMARY KEY, 
	"PROD_NAME" VARCHAR2(30 BYTE) CONSTRAINT "PROD_NAME_NN" NOT NULL, 
	"PROD_PRICE" NUMBER(8,0) CONSTRAINT "PROD_PRICE_NN" NOT NULL, 
	"PROD_MF_DT" DATE, 
	 CONSTRAINT "PROD_PRICE_CK" CHECK (prod_price >= 0)
   ); 
DROP TABLE ORDER_INFO;
CREATE TABLE "ORDER_INFO" 
   (	"ORDER_NO" NUMBER, 
	"ORDER_ID" VARCHAR2(10 BYTE) CONSTRAINT "ORDER_INFO_ID_NN" NOT NULL, 
	"ORDER_DT" DATE DEFAULT SYSDATE NOT NULL, 
	 CONSTRAINT "ORDER_INFO_NO_PK" PRIMARY KEY ("ORDER_NO"),
     CONSTRAINT "ORDER_INFO_ID_FK" FOREIGN KEY ("ORDER_ID")
	  REFERENCES "CUSTOMER" ("ID")
);

drop table order_line;

CREATE TABLE "ORDER_LINE" 
   (	"ORDER_NO" NUMBER, 
	"ORDER_PROD_NO" VARCHAR2(5 BYTE), 
	"ORDER_QUANTITY" NUMBER(2,0)
   );
   
ALTER TABLE "ORDER_LINE" 
ADD CONSTRAINT "ORDER_LINE_NO_PROD_NO_PK" PRIMARY KEY ("ORDER_NO", "ORDER_PROD_NO")
ADD CONSTRAINT "ORDER_LINE_NO_FK" FOREIGN KEY (order_no) references order_info(order_no)
ADD CONSTRAINT "ORDER_LINE_PROD_NO_FK" FOREIGN KEY (order_prod_no) references product(prod_no)
ADD CONSTRAINT "ORDER_LINE_QUANTITY_CK" CHECK (order_quantity > 0) 
MODIFY "ORDER_QUANTITY" NOT NULL
MODIFY "ORDER_PROD_NO" NOT NULL ;


---------------------
고객[CUSTOMER]
id      pwd name  buildingno
'id1'  'p1'  'n1'       ''
'id2'  'p2'  'n2'       ''
'id3'  'p3'  'n1'       ''
INSERT INTO customer(id, pwd, name) VALUES ('id1', 'p1', 'n1');


상품[PRODUCT]
prod_no prod_name   prod_price prod_mf_dt
'C0001'  '아메리카노'  1000          '21/06/02'
'C0002'  'ICE아메리카노' 1000       '21/06/02'
'C0003'  '카페라떼'      1500          '21/06/02'
'G0001'  '텀블러1'       5000          '21/01/30'
'G0002'  '다이어리1'    6000          '21/01/14'
'F0001'  '치즈케익'      4000          '21/06/01'
'F0002'  '바나나'         2000          '21/05/31'

INSERT INTO product VALUES ('C0001',  '아메리카노',  1000,          '21/06/02');
INSERT INTO product VALUES ('C0002',  'ICE아메리카노', 1000,       '21/06/02' );
INSERT INTO product VALUES  ( 'C0003',  '카페라떼',      1500,          '21/06/02');
INSERT INTO product VALUES  ( 'G0001',  '텀블러1',       5000,          '21/01/30');
INSERT INTO product VALUES  ( 'G0002',  '다이어리1',    6000,          '21/01/14');
INSERT INTO product VALUES  ( 'F0001',  '치즈케익',      4000,          '21/06/01');
INSERT INTO product VALUES  ( 'F0002',  '바나나',         2000,          '21/05/31');

commit;


commit;

-- INSERT INTO order_line VALUES(9, 'C0003', 2);
-- 주문작업: 주문기본추가 + 주문상세추가

CREATE SEQUENCE order_seq;

rollback;

INSERT INTO order_info(order_no, order_id) VALUES (order_seq.NEXTVAL, 'id2');
INSERT INTO order_info(order_no, order_id) VALUES (order_seq.NEXTVAL, 'id3');

SELECT * FROM order_info;
SELECT order_no, order_id, TO_CHAR(order_dt, 'YY/MM/DD HH24:MI:SS') FROM order_info ORDER BY order_dt DESC;

INSERT INTO order_line VALUES (1, 'C0001', 3);
INSERT INTO order_line VALUES (1, 'C0002', 2);
INSERT INTO order_line VALUES (2, 'G0001', 1);

commit;

INSERT INTO order_info(order_no, order_id) VALUES(OREDR_SEQ.NEXTVAL, 'id3');
INSERT INTO order_info VALUES (ORDER_SEQ.CURRVAL, 'C0003', 2);
INSERT INTO order_info VALUES (ORDER_SEQ.CURRVAL, 'F0003', 1);
commit;

INSERT INTO order_info(order_no, order_id) VALUES (ORDER_SEQ.NEXTVAL, 'id2');
INSERT INTO VALUES ((
INSERT INTO VALUES





