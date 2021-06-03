-- Ʈ������̶� ��ó�� �۾� �����̴�.
--ex) ������ü(A���¿��� �ݾ��� ���, B���·� �ݾ��� �Ա�)
-- <- Ʈ����ǽ���
-- A���¿��� �ݾ��� ���
-- B���·� �ݾ��� �Ա�
-- Ʈ����� ����!
-- (�۾����� : �Ϸ�=> commit, �۾�����: �����·� ����=>rollback)
-- DDL(CREATE, ALTER, DROP) : �ڵ��Ϸ� (Ʈ����ǽ���, DDL����ó��, Commit) (DDL�κ��� �ڵ����� COMMIT�� �Ǳ⿡ �����ڰ� COMMIT�� �� ����.
-- DML (INSERT, UPDATE, DELETE) : �ڵ� �Ϸ� �ȵ�(Ʈ����ǽ���, DML����ó��)
--                                 COMMIT/ROLLBACK�� �ʿ��ϴ�.
CREATE TABLE account(no varchar2(3) primary key, balance number(5));

--Ʈ����� ����
INSERT INTO account(no, balance) VALUES('100', 1000);
INSERT INTO account(no, balance) VALUES('200', 1000);
SELECT * FROM account;--  => �Ϸᰡ ���� ������ �ӽ� ����ҿ� �����͸� ���� �Ǵ°��̴�.
--Ʈ����� �Ϸ�
commit;
----------------------------------------------------------------
UPDATE account SET balance = balance - 10 WHERE no = '100';
UPDATE account SET balance = balance + 10 WHERE no = '200';

select * from account;

--Ʈ����� ����
rollback;


/* UPDATE - 1
   INSERT - 2
   INSERT - 3
   DELETE - 4
   UPDATE - 5
   commit(1,2,3,4,5) ��� ó�� ��
   
   UPDATE - 1
   INSERT - 2
   rollback(1,2 ���)
   INSERT - 3
   DELETE - 4
   commit(3, 4ó��)
   UPDATE - 5 
   DELETE FROM account -6
   WHERE no = '100';
   
 DELETE FROM account -1
 WHERE no = '100'; --DEAD LOCK������
 
 rollback;
 1������ �����Ǿ����ϴ�.
 */
 
 /* 
 ����� Ʈ����� ��� 
 truncate ������ �ο� ���� ����鸸 �ٸ������� ���̺��� ������ �ִ�.
 */
  
CREATE TABLE order_info(
    order_no number CONSTRAINT order_info_no_pk PRIMARY KEY,
    order_id VARCHAR(10) CONSTRAINT order_info_id_nn NOT NULL,
    order_dt DATE DEFAULT SYSDATE NOT NULL,
    CONSTRAINT order_info_id_fk FOREIGN KEY (order_id) REFERENCES customer(id)
    );
       
--4)�÷�����
/*
ALTER TABLE ���̺��
DROP COLUMN �÷���

--5)���̺� ������ �������� �߰�
ALTER TABLE ���̺��
ADD CONSTRAINT �������Ǹ� �������� ���� �÷���
EX)ADD CONSTRAINT customer_pk PRIMARY KEY id;
   ADD CONSTRAINT order_pord_no_fk FOREIGN KEY prod_no
                                    REFERENCES products(product_no);
    ADD CONSTRAINT order_quantity_ck CHECK order_quantity > 0;
    
���������̸� ����/����
ALTER TABLE ���̺��
RENAME CONSTRAINT ���� ���� ���Ǹ� TO �� ���� ���Ÿ�;
DROP CONSTRAINT �������Ǹ�;
  */
  
  /* �������� ���� ������ �θ������ �Բ� �ڽĵ� �����ǵ��� ����
ALTER TABLE order_info
ADD CONSTRAINT order_id_fk FOREIGN KEY order_id,
                            References(id)
                            ON DELETE CASCADE;
    
insert into order_info(order_no, order_id) values (3, 'id1');

delete from customer where id = 'id1'; -- �θ������ �ڽ�(order_info)�൵ ����

select * from order_info where order_id = 'id1'; -- 0��

