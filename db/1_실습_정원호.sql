--1. �޿��� 10000�̰ų� 14000�� ������� ���, �̸�, �޿��� �˻�
SELECT employee_id, first_name, salary
FROM employees
WHERE salary IN (10000, 14000);

--2. first_name �� ��ҹ��� ���� ����('e', 'E')�� �����ϴ� ��� ����� �˻��Ͻÿ�
SELECT first_name
FROM employees
WHERE upper(first_name) LIKE '%E%'; 

--3 first_name�� 'J'�ν����ϰ� n���ڸ� �����ϴ� ����� ���, �̸��� �˻��Ͻÿ�.
SELECT employee_id, first_name
FROM employees
WHERE first_name LIKE 'J%n%';

--4 �޿��� 10000�̻��� ����� ���, �μ���ȣ, �̸�, �޿�, ������ ���, �� �μ���ȣ�� 30��, 60�� 90���� �μ��� �����ϰ� ����� �˻�
SELECT employee_id, department_id, first_name, salary, commission_pct
FROM employees
WHERE salary >= 10000 AND department_id NOT IN (30,60,90);
-- department_id <> 30 AND department_id <> 60 AND department_id <>90
--5 �޿��� 4000���� ���� ������� �μ��� �޿� ����� ����Ͻÿ�. �� �޿� ����� �Ҽ��� ���� 2�ڸ����� �ݿø�
SELECT department_id, ROUND(AVG(salary), 1)
FROM employees
WHERE salary > 4000
GROUP BY department_id;

--6 �μ� ��ġ�� ���� ���� ����� �����ϰ� �μ��� �޿������ ����Ͻÿ�, �� �޿������ �Ҽ������� 2�ڸ����� �ݿø�
SELECT department_id, ROUND(AVG(salary), 1)
FROM employees
WHERE department_id IS NOT NULL
GROUP BY department_id;

--7 �μ���ġ�� ���� ���� ����� �����ϰ� �޿������ 10000�̻��� �μ��� �޿������ ����Ͻÿ�,
SELECT department_id, ROUND(AVG(salary), 1) 
FROM employees
WHERE department_id IS NOT NULL
GROUP BY department_id
HAVING  ROUND(AVG(salary), 1)  >= 10000;

--8 ����� �ٹ��ϼ� �ٹ��������� ����Ͻÿ�
SELECT hire_date, trunc((sysdate-hire_date)-1) �ټ��ϼ� , round(months_between(sysdate, hire_date),-1) �ټӿ���
FROM employees;

--9 �⵵�� �Ի��ڼ��� ����Ͻÿ�, �� �ֱ� �⵵ ����
SELECT To_CHAR(hire_date, 'YYYY'), COUNT(*)
FROM employees
GROUP BY To_CHAR(hire_date, 'YYYY')
ORDER BY To_CHAR(hire_date, 'YYYY') DESC;

--10. �Ϲݱ� (7~12��) ���� �Ի��ڼ��� ����Ͻÿ� �Ի��ڼ��� 5���̻��� ��츸 ����մϴ�.
SELECT TO_CHAR(hire_date, 'mm') �Ի�� , Count(TO_CHAR(hire_date, 'mm')) �Ի��ڼ�
FROM employees
GROUP BY TO_CHAR(hire_date, 'mm')
HAVING Count(TO_CHAR(hire_date, 'mm')) > 5;