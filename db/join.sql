--����� ���, �̸�,  �μ���ȣ�� ����Ͻÿ�[107��]
SELECT employee_id, first_name, department_id
FROM employees;

--�μ���ȣ, �μ����� ����Ͻÿ�[27��]
SELECT department_id, department_name
FROM departments; 

--����� ���, �̸�, �μ���ȣ, �μ����� ����Ͻÿ�
SELECT employee_id, first_name, department_id, department_name
FROM employees, departments; --����

SELECT employee_id, first_name, employees.department_id, department_name
FROM employees, departments; --īƼ�ǰ�

SELECT employee_id, first_name, employees.department_id, department_name
FROM employees, departments
WHERE employees.department_id = departments.department_id; --106��

--ǥ��ȭ�� ANSI����
--JOIN ON
SELECT employee_id, first_name, e.department_id, department_name
FROM employees e JOIN departments d ON (e.department_id = d.department_id); --106��

--JOIN USING [�������ǿ� �÷����� ������ ���]
--���� ���̺��. �Ǵ� ���̺�ġ��. ���Ұ�
SELECT employee_id, first_name, 
           department_id, department_name
FROM employees e JOIN departments d USING(department_id); --106��


--NATURAL JOIN [�������ǿ� �÷����� ������ ��� �ڵ� ���Ǽ�����]
SELECT employee_id, first_name, 
           department_id, department_name
FROM employees  NATURAL JOIN departments; --32��

���� NATURAL JOIN�� �Ʒ� ON�� ���� ȿ���� ��
SELECT employee_id, first_name, 
           e.department_id, department_name
FROM employees e JOIN departments d ON (e.department_id = d.department_id AND e.manager_id = d.manager_id);
--------------------------------------------------------------------------------------------
--��� ���, �̸�, �μ���ȣ, �μ���, ������(job_title)�� ����Ͻÿ�
SELECT employee_id, first_name, 
           e.department_id, department_name,
           job_title
FROM employees e 
JOIN departments d ON ( e.department_id = d.department_id)
JOIN jobs j ON (e.job_id = j.job_id);

--��� ���, �̸�, �μ���ȣ, �μ���, �μ��� ���� ���ø�(city)�� ����Ͻÿ�
SELECT employee_id, first_name, 
           e.department_id, department_name,
           city
FROM employees e 
JOIN departments d ON ( e.department_id = d.department_id)
JOIN locations l ON (d.location_id = l.location_id);

--��� ���, �̸�, �μ���ȣ, �μ���, �μ��� ���� ���ø�(city)�� ����Ͻÿ�
--'s'�� ������ �μ��� 'Seattle'���ÿ� ���� ����鸸 ����Ѵ� --7��
SELECT employee_id, first_name, 
           e.department_id, department_name,
           city
FROM employees e 
JOIN departments d ON ( e.department_id = d.department_id)
JOIN locations l ON (d.location_id = l.location_id)
--WHERE INSTR(department_name, 's') > 0
WHERE department_name LIKE '%s%'
AND city = 'Seattle';

--�μ���ȣ, �μ���, �μ��� ���� ���ø�, ������(country_name)�� ����Ͻÿ�
SELECT department_id, department_name,
           city,
           country_name
FROM departments d 
JOIN  locations l ON (d.location_id = l.location_id)
JOIN countries c ON (l.country_id = c.country_id);
------------------------------------------------------------------------------------------
--OUTER JOIN   
  1) ANSI ǥ�ع��           
   -LEFT OUTER JOIN
   -RIGHT OUTER JOIN

  2) ����Ŭ ��� : (+)
--������� ���, �̸�, �μ���ȣ, �μ����� ����Ͻÿ�. �μ��� ���� ����� ����Ѵ�--107
SELECT employee_id, first_name, 
           e.department_id, department_name
FROM employees e LEFT OUTER JOIN departments d ON (e.department_id = d.department_id);

SELECT employee_id, first_name, 
           e.department_id, department_name
FROM employees e, departments d 
WHERE e.department_id = d.department_id(+);

--�μ�[27��]
--����[23��]
--��� ������ ����ID, ���ø�, �μ���ȣ, �μ����� ����Ͻÿ�. �μ��� ���� ������ ��� ����Ѵ�--43��
ex)                 AA     BB       null        null
                     CC      DD      1           F
SELECT l.location_id, city,
           department_id, department_name, d.location_id 
FROM departments d  RIGHT JOIN locations l ON (d.location_id = l.location_id);

SELECT l.location_id, city,
           department_id, department_name, d.location_id 
FROM departments d, locations l
WHERE d.location_id(+) = l.location_id;

--����� ���, �̸�, �μ���, ������ ����Ͻÿ�, �� �μ������� ����� ����Ѵ�--107��
SELECT employee_id, first_name, 
           e.department_id, department_name,
           job_title
FROM employees e LEFT OUTER JOIN departments d ON (e.department_id = d.department_id)
                            JOIN jobs j ON (e.job_id = j.job_id);

SELECT employee_id, first_name, 
           e.department_id, department_name,
           job_title
FROM employees e ,departments d, jobs j 
WHERE e.department_id = d.department_id(+) AND e.job_id = j.job_id;


--FULL OUTER JOIN : �������̺��� �ڷḦ ��� ����Ѵ�(ANSI)
CREATE TABLE a (a1 number, b1 char(1));
INSERT INTO a VALUES (1, 'A');
INSERT INTO a VALUES (2, 'B');
INSERT INTO a VALUES (3, null);

CREATE TABLE b (b1 char(1), a1 number);
INSERT INTO b VALUES ('A', 1);
INSERT INTO b VALUES ('B', null);
INSERT INTO b VALUES ('C', 2);
commit;

SELECT * 
FROM a JOIN b ON a.b1 = b.b1; --2��

SELECT * 
FROM a LEFT JOIN b ON a.b1 = b.b1;

SELECT * 
FROM a RIGHT JOIN b ON a.b1 = b.b1;

SELECT * 
FROM a FULL JOIN b ON a.b1 = b.b1;
---------------------------------------------------

SELF JOIN : �ڱ��������迡�� ���
--����� ����� �̸�, ����� �����ڹ�ȣ, ������ �̸��� ����Ͻÿ�
SELECT e.employee_id ��� , e.first_name ����̸�,
           m.employee_id �����ڹ�ȣ, m.first_name �������̸�
FROM employees  e  JOIN employees m ON ( e.manager_id = m.employee_id );

--����� �μ��� ����� ������ �μ��� ���� �ٸ� ������� 
����� ����� �̸�, �μ���ȣ, �μ���
����� �����ڹ�ȣ, ������ �̸�, �μ���ȣ, �μ����� ����Ͻÿ�
SELECT e.employee_id ��� , e.first_name ����̸�, e.department_id ����μ���ȣ, d.department_name ����μ���, 
           m.employee_id �����ڹ�ȣ, m.first_name �������̸�, 
           m.department_id �����ںμ���ȣ,  md.department_name �����ںμ���
FROM employees  e  JOIN employees m ON ( e.manager_id = m.employee_id )
                             JOIN departments d ON ( e.department_id = d.department_id)
                             JOIN departments md ON (m.department_id = md.department_id)
WHERE  e.department_id <> m.department_id;



