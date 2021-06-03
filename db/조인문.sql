--����� ���, �̸�, �μ���ȣ, �μ����� ����Ͻÿ�
SELECT employee_id, first_name, department_id, department_name
FROM employees, departments;

SELECT employee_id, first_name, department_id, department_name
FROM employees, departments;

SELECT employee_id, first_name, department_id, department_name
FROM employees, departments
where employees.department_id = departments.department_id;

--ǥ��ȭ�� Ansi����
SELECT employee_id, first_name, employees.department_id, department_name
FROM employees JOIN departments
ON (employees.department_id = departments.department_id);

--join on 
select employee_id, first_name, e.department_id, department_name
from employees e Join departments d ON(e.department_id = d.department_id);

--join using [�������ǿ� �÷����� ������ ��츸 ����� �����ϴ�]
select employee_id, first_name, department_id, department_name
FROM employees e JOIN departments d USING(department_id); --��� ���̺��� �÷����� �������൵ �Ǵ±���

--Natural join[�������ǿ� �÷����� ������ ��� �ڵ� ���Ǽ�����]
select employee_id, first_name, e.department_id, department_name
from employees e join departments d on (e.department_id = d.department_id and e.manager_id = d.manager_id);

--��� ���, �̸�, �μ���ȣ �μ���, �������� ����Ͻÿ�
select employee_id, first_name, e.department_id, department_name, job_title
from employees e
join departments d on (e.department_id = d.department_id)
join jobs j on (e.job_id = j.job_id);

--��� ���, �̸�, �μ���ȣ, �μ���, �μ��� ���� ���ø��� ����Ͻÿ�
select employee_id, first_name, e.department_id, department_name, city
from employees e
join departments d on (e.department_id = d.department_id)
join locations l   on (d.location_id = l.location_id);

--��� ���, �̸�, �μ���ȣ, �μ���, �μ��� ���� ���ø��� ����Ͻÿ�
--'s'�� ������ �μ��� 'seattle'���ÿ� ���� ����鸸 ����ϴ�.
select employee_id, first_name, e.department_id, department_name, city
from employees e
join departments d on (e.department_id = d.department_id)
join locations l   on (d.location_id = l.location_id)
WHERE INSTR(department_name,  's') > 0 AND city = 'Seattle';

--�μ���ȣ, �μ���, �μ��� ���� ���ø�, ������ �� ����Ͻÿ�
select department_id, department_name, city, country_name
from departments d
join locations l on (d.location_id = l.location_id)
join countries c on (l.country_id  = c.country_id);

-- outer join
-- left outer join
-- rigth outer join

--��� ����� ���, �̸�, �μ���ȣ, �μ����� ����Ͻÿ� �μ��� ���� ����� ����Ѵ� -- 107 ���ʿ� employee���
select employee_id, first_name, e.department_id, department_name
from employees e left outer join departments d on (e.department_id = d.department_id);

--��� ������ ���� id ,���ø�, �μ���ȣ, �μ����� ����Ͻÿ� �μ��� ���� ������ ��� ����Ѵ�. --43
select count(*) from locations;
select l.location_id, city,
department_id, department_name, d.location_id
from departments d right join locations l on (d.location_id = l.location_id);


-- ����� ���, �̸�, �μ���, �������� ����Ͻÿ�, �� �μ��� ���� ����� ����Ѵ�.
select employee_id, first_name,
            e.department_id, department_name,
            job_title
from employees e left outer join departments d on (e.department_id = d.department_id) join jobs j on (e.job_id = j.job_id);

-- inner join Ȯ��
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
FROM a JOIN b ON a.b1 = b.b1;

SELECT * 
FROM a LEFT JOIN b ON a.b1 = b.b1;

SELECT * 
FROM a RIGHT JOIN b ON a.b1 = b.b1;

SELECT * 
FROM a FULL JOIN b ON a.b1 = b.b1;

--self join : �ڱ� �������迡�� ���
--����� ����� �̸�, ����� �����ڹ�ȣ, ������ �̸��� ����Ͻÿ�
select e.employee_id ���, e.first_name ����̸�,
            m.employee_id �����ڹ�ȣ, m.first_name �������̸�
from employees e JOIN employees m ON ( e.manager_id = m.employee_id );

--����� �μ��� ����� ������ �μ��� ���� �ٸ� ������� 
--����� ����� �̸�, �μ���ȣ, �μ���
--����� �����ڹ�ȣ, ������ �̸�, �μ���ȣ, �μ����� ����Ͻÿ�
SELECT e.employee_id ��� , e.first_name ����̸�, e.department_id ����μ���ȣ, d.department_name ����μ���,
           m.employee_id �����ڹ�ȣ, m.first_name �������̸�, 
           m.department_id �����ںμ���ȣ,  md.department_name �����ںμ���
FROM employees  e  JOIN employees m ON ( e.manager_id = m.employee_id )
                             JOIN departments d ON ( e.department_id = d.department_id)
                             JOIN departments md ON (m.department_id = md.department_id)
WHERE  e.department_id <> m.department_id;
