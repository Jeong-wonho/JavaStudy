DROP TABLE order_line;     
DROP TABLE order_info;
DROP TABLE customer;
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

CREATE TABLE "ORDER_INFO" 
   (	"ORDER_NO" NUMBER, 
	"ORDER_ID" VARCHAR2(10 BYTE) CONSTRAINT "ORDER_INFO_ID_NN" NOT NULL, 
	"ORDER_DT" DATE DEFAULT SYSDATE NOT NULL, 
	 CONSTRAINT "ORDER_INFO_NO_PK" PRIMARY KEY ("ORDER_NO"),
     CONSTRAINT "ORDER_INFO_ID_FK" FOREIGN KEY ("ORDER_ID")
	  REFERENCES "CUSTOMER" ("ID")
);
CREATE TABLE "ORDER_LINE" 
   (	ORDER_NO NUMBER, 
	ORDER_PROD_NO VARCHAR2(10 BYTE), 
	ORDER_QUANTITY NUMBER(2,0)
   );
   
ALTER TABLE "ORDER_LINE" 
ADD CONSTRAINT "ORDER_LINE_NO_PROD_NO_PK" PRIMARY KEY ("ORDER_NO", "ORDER_PROD_NO")
ADD CONSTRAINT "ORDER_LINE_NO_FK" FOREIGN KEY (order_no) REFERENCES order_info(order_no) 
ADD CONSTRAINT "ORDER_LINE_PROD_NO_FK" FOREIGN KEY (order_prod_no) REFERENCES product(prod_no)  
ADD CONSTRAINT "ORDER_LINE_QUANTITY_CK" CHECK (order_quantity > 0) 
MODIFY "ORDER_QUANTITY" NOT NULL
MODIFY "ORDER_PROD_NO" NOT NULL ;


---------------------
--��[CUSTOMER]
--id      pwd name  buildingno
--'id1'  'p1'  'n1'       ''
--'id2'  'p2'  'n2'       ''
--'id3'  'p3'  'n1'       ''
INSERT INTO customer(id, pwd, name) VALUES ('id1', 'p1', 'n1');
INSERT INTO customer(id, pwd, name) VALUES ('id2', 'p2', 'n2');
INSERT INTO customer(id, pwd, name) VALUES ('id3', 'p3', 'n3');

--��ǰ[PRODUCT]
--prod_no prod_name   prod_price prod_mf_dt
--'C0001'  '�Ƹ޸�ī��'  1000          '21/06/02'
--'C0002'  'ICE�Ƹ޸�ī��' 1000       '21/06/02'
--'C0003'  'ī���'      1500          '21/06/02'
--'G0001'  '�Һ�1'       5000          '21/01/30'
--'G0002'  '���̾1'    6000          '21/01/14'
--'F0001'  'ġ������'      4000          '21/06/01'
--'F0002'  '�ٳ���'         2000          '21/05/31'

INSERT INTO product VALUES ('C0001',  '�Ƹ޸�ī��',  1000,          '21/06/02');
INSERT INTO product VALUES ('C0002',  'ICE�Ƹ޸�ī��', 1000,       '21/06/02' );
INSERT INTO product VALUES  ( 'C0003',  'ī���',      1500,          '21/06/02');
INSERT INTO product VALUES  ( 'G0001',  '�Һ�1',       5000,          '21/01/30');
INSERT INTO product VALUES  ( 'G0002',  '���̾1',    6000,          '21/01/14');
INSERT INTO product VALUES  ( 'F0001',  'ġ������',      4000,          '21/06/01');
INSERT INTO product VALUES  ( 'F0002',  '�ٳ���',         2000,          '21/05/31');
commit;

--�ֹ��⺻����[ORDER_INFO]
--order_no  order_id  order_dt
--   1          'id2'          
--   2          'id3'

--�ֹ��⺻������ ������[ORDER_SEQ]
DROP SEQUENCE order_seq;
CREATE SEQUENCE order_seq;

INSERT INTO order_info(order_no, order_id) VALUES (order_seq.NEXTVAL, 'id2');
INSERT INTO order_info(order_no, order_id) VALUES (order_seq.NEXTVAL, 'id3');
SELECT order_no, order_id, TO_CHAR(order_dt, 'YEAR/MM/DD HH24:MI:SS') FROM order_info ORDER BY order_dt;

--�������� �ʴ� �ֹ��ھ��̵�� �ֹ��߰�
--INSERT INTO order_info(order_no, order_id) VALUES (order_seq.NEXTVAL, 'id999'); --(X)
commit;

--�ֹ���[ORDER_LINE]
--order_no  order_prod_no  order_quantity
--   1           'C0001'               3
--   1           'C0002'               2
--   2           'G0001'               1

INSERT INTO order_line VALUES (1, 'C0001', 3);
INSERT INTO order_line VALUES (1, 'C0002', 2);
INSERT INTO order_line VALUES (2, 'G0001', 1);
commit;

INSERT INTO order_line VALUES (9, 'C0003', 2); --(X)

--�ֹ��۾�: �ֹ��⺻�߰� + �ֹ����߰�
INSERT INTO order_info(order_no, order_id) VALUES (ORDER_SEQ.NEXTVAL, 'id3'); --�ֹ��⺻�߰�
INSERT INTO order_line VALUES (ORDER_SEQ.CURRVAL, 'C0003', 2); --�ֹ����߰�
INSERT INTO order_line VALUES (ORDER_SEQ.CURRVAL, 'F0001', 1); --�ֹ����߰�
commit;

INSERT INTO order_info(order_no, order_id) VALUES (ORDER_SEQ.NEXTVAL, 'id2'); --�ֹ��⺻�߰�
INSERT INTO order_line VALUES (ORDER_SEQ.CURRVAL, 'C0003', 2); --�ֹ����߰�
INSERT INTO order_line VALUES (ORDER_SEQ.CURRVAL, 'X0001', 1); --�ֹ����߰�(X)
rollback; 

-- �ֹ���ȣ, �ֹ���ID, �ֹ��ڸ�, �ֹ�����, �ֹ���ǰ��ȣ, ��ǰ��, ����, �ֹ������� ����Ͻÿ�
-- �ֱ� �ֹ���ȣ���� ����Ͻÿ�
-- order_line, order_info, product

SELECT i.order_no, order_id, name, order_dt, order_prod_no, prod_name, prod_price, order_quantity
FROM order_line l JOIN order_info i ON l.order_no = i.order_no JOIN product p ON  p.prod_no = l.order_prod_no
JOIN customer c ON i.order_id = c.id ORDER BY  i.order_no DESC ;

-- �ֹ��� ���õ� ����, 'id3'�ֹ��ڰ� �ֹ��� ��ǰ.!
--�ֹ���ȣ, �ֹ���ID, �ֹ��ڸ�, �ֹ�����, �ֹ���ǰ��ȣ, ��ǰ��, ����, �ֹ�����
--�ֱ� �ֹ���ȣ���� ���

drop view order_view;
-- view�� ����� ó��
CREATE VIEW order_view
as SELECT i.order_no, order_id, name, order_dt, order_prod_no, prod_name, prod_price, order_quantity
FROM order_line l JOIN order_info i ON l.order_no = i.order_no JOIN product p ON  p.prod_no = l.order_prod_no
JOIN customer c ON i.order_id = c.id;

-- 'id3' order_no ������ ����
select * from order_view where order_id = 'id3' order by order_no desc;

--'C0001'��ǰ�� �ֹ���
--�ֹ���ȣ, �ֹ���ID, �ֹ��ڸ�, �ֹ�����, �ֹ���ǰ��ȣ, ��ǰ��, ����, �ֹ�����
--�ֱ� �ֹ���ȣ���� ���

SELECT * FROM order_view WHERE order_prod_no = 'C0003' ORDER BY order_no DESC;

--��ǰ�� ��ǰ��ȣ, �ֹ������� ����Ͻÿ�. '21/01/01' ���� '21/06/30'����
SELECT prod_no ��ǰ��ȣ, SUM(ORDER_QUANTITY)
FROM order_line ol 
JOIN product p ON ol.order_prod_no = p.prod_no
WHERE prod_mf_dt BETWEEN '21/01/01' AND '21/06/30'
GROUP BY prod_no ORDER BY COUNT(*) DESC;

CREATE OR REPLACE VIEW order_view
AS
SELECT i.*, l.order_quantity, c.*, p.*
FROM order_line l JOIN order_info i ON l.order_no = i.order_no JOIN product p ON  p.prod_no = l.order_prod_no
JOIN customer c ON i.order_id = c.id ORDER BY  i.order_no DESC ;

SELECT 
order_no, 
order_id, 
name, 
order_dt, 
prod_no, 
prod_name, 
prod_price, 
order_quantity
FROM order_view
ORDER BY order_no;

-- �ֹ��۾�[�⺻���� �߰� + ������ �߰�]
INSERT INTO order_info(order_no, order_id) VALUES (order_seq.nextval, 'id1');
INSERT INTO order_line(order_no, order_prod_no, order_quantity) VALUES (ORDER_SEQ.CURRVAL, 'C0001', 1);
INSERT INTO order_line(order_no, order_prod_no, order_quantity) VALUES (ORDER_SEQ.CURRVAL, 'C0002', 2);
COMMIT;

INSERT INTO order_info(order_no, order_id) VALUES (order_seq.nextval, 'id3');
INSERT INTO order_line(order_no, order_prod_no, order_quantity) VALUES (ORDER_SEQ.CURRVAL, 'F0001', 1);
INSERT INTO order_line(order_no, order_prod_no, order_quantity) VALUES (ORDER_SEQ.CURRVAL, 'C0002', 3);
COMMIT;

INSERT INTO order_info(order_no, order_id) VALUES (order_seq.nextval, 'id3');
INSERT INTO order_line(order_no, order_prod_no, order_quantity) VALUES (ORDER_SEQ.CURRVAL, 'F0001', 1);
INSERT INTO order_line(order_no, order_prod_no, order_quantity) VALUES (ORDER_SEQ.CURRVAL, 'C0002', 3);
COMMIT;

SELECT 
order_no, 
order_id, 
name, 
order_dt, 
prod_no, 
prod_name, 
prod_price, 
order_quantity
FROM order_view
ORDER BY order_no; -- ������ �Ϸù�ȣ�� RECALL ����� �ƴϴ�.!

--�� 9���� ��� �������� ��ȸ!
-- ���������� 5�྿ ��ȸ
-- 1������ �ش��ϴ� �ֹ� ����� ����Ͻÿ�
-- �ֱ� �ֹ���ȣ���� ����Ѵ�.

SELECT FROM(SELECT rownum rn,
            FROM    (SELECT
                    FROM order_view
                    WHERE order_dt BETWEEN '21/01/01 AND '21/03/31'
                    ORDER BY order_no DESC);
                    
                    