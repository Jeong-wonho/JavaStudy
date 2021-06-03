-- view ��� ��ü!
-- ����� ���, �̸�, �μ���ȣ , �μ���, �������� ����Ͻÿ�
SELECT employee_id, first_name, e.department_id, department_name, job_title
FROM employees e JOIN departments d ON (e.department_id = d.department_id)
                JOIN jobs j ON (e.job_id = j.job_id);
                
--�����
CREATE VIEW emp_vw1
AS SELECT employee_id, first_name, e.department_id, department_name, job_title
FROM employees e JOIN departments d ON (e.department_id = d.department_id)
                JOIN jobs j ON (e.job_id = j.job_id);

--view�� ��ü�̴�.                
SELECT * FROM emp_vw1;
SELECT employee_id FROM emp_vw1;
--�����
CREATE VIEW emp_vw2 --��� ��Ī�� �������ν� ���Ȼ� ������ �÷��� ���� �� �ִ�.
AS SELECT employee_id ���, first_name �̸�, e.department_id �μ���ȣ, department_name �μ���, job_title ������
FROM employees e JOIN departments d ON (e.department_id = d.department_id)
                JOIN jobs j ON (e.job_id = j.job_id);
                
SELECT ��� FROM emp_vw2;
SELECT employee_id FROM emp_vw2; --(x)

--�� ���� (ALTER X, TABLE�� ���� �ڷ�, VIEW ���� �ڷ� X)
CREATE OR REPLACE VIEW emp_vw2
AS SELECT employee_id ���, first_name �̸�, e.department_id �μ���ȣ, department_name �μ���,
job_title ������, city �μ�����
FROM employees e JOIN departments d ON (e.department_id = d.department_id)
                JOIN jobs j ON (e.job_id = j.job_id)
                JOIN locations i ON (d.location_id = i.location_id);

SELECT * FROM emp_vw2;

SELECT * FROM EMP_DETAILS_VIEW;

-- �� ����!! 
CREATE OR REPLACE VIEW customer_vw1
AS SELECT id, pwd, name
FROM customer;

SELECT * FROM customer_vw1;

--���̺� �� �߰�
CREATE TABLE customer(id varchar2(10) NOT NULL PRIMARY KEY,
pwd varchar2(10),
name varchar2(10),
buidingno varchar2(10));

alter table customer rename column buidingno to buildingno;
-- �� ����!! 
CREATE OR REPLACE VIEW customer_vw1
AS SELECT id, pwd, name
FROM customer;

SELECT * FROM customer_vw1;
-- ���̺� ���߰�
INSERT INTO customer(id, pwd, name, buildingno) VALUES ('id1', 'p1', 'n1', '');

--�信 ���߰�
INSERT INTO customer_vw1(id, pwd, name) values ('id2', 'p2', 'n2');

--�並 �б� ����
CREATE OR REPLACE VIEW customer_vw1
AS SELECT id, pwd, name
FROM customer
WITH READ ONLY;

--�信 ���߰�("cannot perform a DML operation on a read-only view")
INSERT INTO customer_vw1(id, pwd, name) VALUES ('id3', 'p3', 'n3');

--�������ϱ�
DROP VIEW customer_vw1;
