--�������Լ� : ���ະ�� ó���Ǵ� �Լ�
--�������Լ� :  �������� ��Ƽ� ó���Ǵ� �Լ�
  COUNT()
  SUM()
  MAX()
  MIN()
  AVG()

SELECT COUNT(*), --NULL�� ������ ��� 107
           COUNT(department_id), --NULL�� ������ ��� 106
           SUM(salary), --�޿��Ѿ� --691416
           AVG(salary), --�޿���� (NULL�� ������ ����� �������)  : 691416 / 107
           MAX(salary),
           MIN(salary)
FROM employees;
-----------------------------------------------------------

SELECT
FROM
WHERE ���� ����
GROUP BY ���� �׷�ȭ

�޿��� 5000�̻��� ������� �μ��� ������� �ѱ޿��� ����Ͽ� ����Ͻÿ�
SELECT department_id, COUNT(*), SUM(salary)
FROM employees
WHERE salary >= 5000
GROUP BY department_id
ORDER BY department_id;

--2007�⿡ �Ի��� ������� ��ձ޿��� ����Ͻÿ�. 
  ��ձ޿��� �Ҽ�������1�ڸ����� ǥ���ϰ� 2�ڸ����� �ݿø��Ѵ�.
SELECT COUNT(*), ROUND(AVG(salary), 1)
FROM employees
WHERE TO_CHAR(hire_date, 'YYYY') = '2007';

----2007�⿡ �Ի��� �μ��� �μ���ȣ, ������� ��ձ޿��� ����Ͻÿ�. 
  ��ձ޿��� �Ҽ�������1�ڸ����� ǥ���ϰ� 2�ڸ����� �ݿø��Ѵ�.
  ��ձ޿����� ���� �μ����� ����Ͻÿ�

SELECT department_id, COUNT(*), ROUND(AVG(salary), 1)
FROM employees
WHERE TO_CHAR(hire_date, 'YYYY') = '2007'
GROUP BY department_id
ORDER BY  3 DESC;

--������ ������ȣ(location_id), �μ����� ����Ͻÿ�
SELECT location_id, COUNT(*)
FROM departments
GROUP BY location_id;

--�������� ������ ������ȣ(location_id), �μ����� ����Ͻÿ�
--������ �μ����� 10���̻��� ������ ����Ͻÿ�
SELECT location_id, COUNT(*)
FROM departments
--WHERE COUNT(*) >= 10 
GROUP BY location_id
HAVING COUNT(*) >= 10;

--�μ��� �μ���ȣ�� �ִ�޿����� ����Ͻÿ�
SELECT department_id, MAX(salary)
FROM employees
GROUP BY department_id;

--�μ��� �μ���ȣ�� �ִ�޿���, �ִ�޿��ڻ���� ����Ͻÿ�
SELECT department_id, MAX(salary), employee_id --�����߻�
FROM employees
GROUP BY department_id;














