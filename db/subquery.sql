--subquery: �κ�����, ��������

--'IT'�μ��� ���� ��� ���, �̸�, �޿��� ����Ͻÿ� 
SELECT emplyoee_id, first_name, salary
FROM employees e JOIN departments d ON (e.department_id = d.department_id)
WHERE department_name = 'IT';

--1) 'IT'�μ��� �μ���ȣ�˻��Ѵ� SELECT department_id FROM departments WHERE department_name = 'IT'
--2) 1)�μ���ȣ�� ���� �μ���ȣ�� ���� ����� �˻��Ѵ�  
             SELECT emplyoee_id, first_name, salary 
             FROM employees
             WHERE department_id = 1)

SELECT emplyoee_id, first_name, salary 
FROM employees
WHERE department_id = (SELECT department_id FROM departments WHERE department_name = 'IT');

--subquery�� ����
--��ġ�� ���� ����
   SubQuery : WHERE��
   INLINE View : FROM��
   Scalar Query : SELECT��

--���������� �������� ���� ����
  multi Row SubQuery : ���������� WHERE������ �񱳿����� ���Ұ�
                                 IN, >ALL, <ALL, >ANY, <ANY
  single Row SubQuery : ���������� WHERE������ �񱳿�����(>,<,>=,<=,<>) ��밡��

--����� ���, �޿��� ����Ͻÿ�. ������ ��ҹ��ڱ��о��� manager�� ���Ե� ����鸸 ����Ѵ�
--1) ������ manager�� ���Ե� job_id�� �˻��Ѵ� 
            SELECT job_id FROM jobs WHERE LOWER(job_title) LIKE '%manager%' 
--2) 1)�� ���� job_id�� ���� ����� ���, �޿��� �˻��Ѵ�

--IN������ : =ANY�� ����
SELECT employee_id, salary
FROM employees 
WHERE job_id IN (SELECT job_id FROM jobs WHERE LOWER(job_title) LIKE '%manager%');

--�������� 'Sales Representative'�� ����� ���, �޿�, �μ�ID�� ����Ͻÿ�.
SELECT employee_id, salary, department_id
FROM employees
WHERE job_id = (SELECT job_id FROM jobs WHERE job_title = 'Sales Representative')

--�������� 'Sales'�� �����ϴ�  ����� ���, �޿�, �μ�ID�� ����Ͻÿ�.
SELECT employee_id, salary, department_id
FROM employees 
WHERE job_id IN (SELECT job_id FROM jobs WHERE job_title LIKE 'Sales%');

--�μ���ȣ�� 100���� ũ�ų� �μ��� ���� ������� �������� ����Ͻÿ�
1)  �μ���ȣ�� 100���� ũ�ų� �μ��� ���� ����� job_id�˻��Ѵ�
2)  1)�� ���� ������ �˻��Ѵ�
SELECT job_title
FROM jobs
WHERE job_id IN (SELECT job_id FROM employees WHERE department_id > 100 OR department_id IS NULL);


-->ALL, <ALL, >ANY, <ANY
SELECT * 
FROM employees
WHERE department_id  IN  (10, 20, 30); --10���μ�, 20���μ�, 30���μ�

SELECT employee_id, department_id
FROM employees
WHERE department_id  >ALL (20, 30);  -- ������������� �ִ밪���� ũ��

SELECT employee_id, department_id
FROM employees
WHERE department_id  <ALL (20, 30); -- ������������� �ּҰ����� �۴�

SELECT employee_id, department_id
FROM employees
WHERE department_id >ANY (20, 30); --������������� �ּҰ����� ũ��

SELECT employee_id, department_id
FROM employees
WHERE department_id  <ANY (20, 30); --������������� �ִ밪���� �۴�

SELECT employee_id, department_id
FROM employees
WHERE department_id  IN (10, 20, NULL, 30); --NULL�ش� ��� ��ã��

SELECT employee_id, department_id
FROM employees
WHERE NVL(department_id, 0) IN (10, 20, 0, 30);
                                               (SELECT NVL(department_id, 0) FROM ~ )


SELECT employee_id, department_id
FROM employees
WHERE department_id  NOT IN (10, 20, NULL, 30); 







