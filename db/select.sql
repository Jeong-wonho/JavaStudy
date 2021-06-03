--SELECT : �˻��� ����
--�������
--SELECT
--FROM
--WHERE
--GROUP BY
--HAVING
--ORDER BY   
-------------------------------------------------------------------------------------------------
--SELECTó������
--| <-----------   SELECTION���� --------------------->|<-- PROJECTION����-->
--             (���ǿ� �����ϴ� �� ã��)                          (�ʿ��� �÷��� ���)
--FROM -> WHERE -> GROUP BY ->  HAVING  ->  SELECT -> ORDER BY

SELECT employee_id, first_name, last_name
FROM employees;

--������� ��� �÷����� ����Ͻÿ�
SELECT *
FROM employees;

--�÷�(���)�� ��Ī�ֱ�
SELECT employee_id "��� ���̵�", first_name fn, last_name "ln", salary AS �޿�
FROM employees;

--���ڿ��� ' '�� ǥ���Ѵ�
--���ڿ� ���տ����� ||
SELECT employee_id,  first_name, last_name, 
           first_name || '~' || last_name ����
FROM employees;

--�� �ߺ� ����
SELECT department_id
FROM employees;

SELECT DISTINCT department_id
FROM employees;

SELECT DISTINCT department_id, job_id
FROM employees;

--�������� : null���� ����Ŀ� ����ϸ� ����� ������ null�� ��ȯ�Ѵ�
+, -, *, /
SELECT  employee_id, salary, commission_pct, salary + salary*commission_pct �Ǳ޿� 
FROM employees;

--NULL�� �ƹ����� �ƴϴ�
--null�� �Լ� : NVL(null���� �����ϴ� ǥ����, null�ΰ�� ��ȯ�� ��)
SELECT  employee_id, salary, commission_pct, 
            salary + salary*NVL(commission_pct, 0) �Ǳ޿� 
FROM employees;

--�������� ����Լ� : mod()
SELECT 3+4,  3/4, MOD(3, 4)
--FROM employees;
FROM dual;

--ORDER BY
--�������� : �������������, ū���������
                 �����ȳ�¥�� ����, �ֱٳ�¥�� �������
         ASC - ����
--�������� : DESC
--�÷��� ���� ��Ī��� ����,�÷��ε��� ���, �������ǿ��� ������� ���� �÷�(SELECT������ ������� ���� �÷�)�� ��밡��

--���� �޿��� �޴� ��������� ���, �̸�, �޿��� ����Ͻÿ�
SELECT employee_id, first_name, salary 
FROM employees
ORDER BY salary DESC;

SELECT employee_id, first_name, salary �޿� 
FROM employees
ORDER BY �޿� DESC; --��Ī���

SELECT employee_id, first_name, salary 
FROM employees
ORDER BY 3 DESC;  --�÷��ε��� ���

SELECT employee_id, first_name, salary 
FROM employees
ORDER BY job_id DESC;  --�������ǿ��� ������� ���� �÷�(SELECT������ ������� ���� �÷�)�� ��밡��



--���� �޿��� �޴� ��������� ���, �̸�, �޿��� ����Ͻÿ�. �޿��� ������ �̸��� ���������� �����Ͻÿ�
SELECT employee_id, first_name, salary
FROM employees
ORDER BY salary DESC, first_name ASC;

SELECT employee_id, first_name, salary
FROM employees
ORDER BY salary DESC, first_name;
-------------------------------------------------------------

--���ǿ� �����ϴ� �� �����ϱ�
--�񱳿����� : >, >=, <, <=, =, <>
--�������� : AND, OR, NOT

--�޿��� 10000���� ���� ����� ���, �̸�, �޿�, �μ���ȣ�� ����Ͻÿ�[15��]
SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE salary > 10000;


--�޿��� 10000���� ���� ����� �μ���ȣ�� 80���� �μ��� ���, �̸�, �޿�, �μ���ȣ�� ����Ͻÿ�[8��]
SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE salary > 10000 AND  department_id=80;

--�޿��� 10000���� 30000������ ����� ���, �̸�, �޿�, �μ���ȣ�� ����Ͻÿ�[19��]
SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE salary >= 10000 AND salary <= 30000;

SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE salary  BETWEEN 10000 AND 30000;



--�μ���ȣ�� 80��, 50���� �μ��� ���, �̸�, �޿�, �μ���ȣ�� ����Ͻÿ�[79��]
SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE department_id = 80 OR department_id = 50;

SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE department_id IN ( 80, 50 );

--�μ���ȣ�� 80���� �ƴϰ� 50���� �ƴ� �μ��� ���, �̸�, �޿�, �μ���ȣ�� ����Ͻÿ�[107��-79��]
SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE department_id <> 80 AND department_id <> 50;

SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE NOT (department_id = 80 OR department_id = 50);

SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE department_id NOT IN (80, 50);

--�޿��� 10000���� 30000������ ����� 80��,50���μ������  ���, �̸�, �޿�, �μ���ȣ�� ����Ͻÿ�[11��]
SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE salary >= 10000 AND salary <= 30000 
   AND (department_id =80 OR department_id =50);

SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE salary BETWEEN 10000 AND 30000
   AND department_id IN (80, 50);

--�̸��� kelly�� ����� ���, �̸��� ����Ͻÿ�. �� ��ҹ��ڴ� ���о���
--�빮�ڷ� ��ȯ�Լ� : UPPER()/ �ҹ��ڷ� ��ȯ�Լ� : LOWER( )
SELECT employee_id, first_name
FROM employees
WHERE LOWER(first_name) = 'kelly';


--�̸��� 'K'�� �����ϴ� ����� ���, �̸��� ����Ͻÿ�. 
--LIKE������ 
     %������ 0�̻��� ���ڿ� ��ġ
     _������ 1���� ���ڿ� ��ġ
SELECT employee_id, first_name
FROM employees
WHERE first_name LIKE 'K%';  //--'K', 'Ka', 'Kabc'

--�̸��� 'K'�� �����ϰ� ���ڼ��� 5���� ����� ���, �̸��� ����Ͻÿ�.
SELECT employee_id, first_name
FROM employees
WHERE first_name LIKE 'K____'; //Kabcd, K�����ٶ�, K1234

--��¥���� ' '�� ǥ���Ѵ�
--�Ի����ڰ� '05/09/21'�� ����� ���, �̸�, �Ի����� ����Ͻÿ�.
SELECT employee_id, first_name, hire_date
FROM employees
WHERE hire_date = '05/09/21';

--�Ի�⵵�� '05'�� ����� ���, �̸�, �Ի����� ����Ͻÿ�.[29��]
SELECT employee_id, first_name, hire_date
FROM employees
WHERE hire_date LIKE '05%';

SELECT employee_id, first_name, hire_date
FROM employees
WHERE hire_date>= '05/01/01' AND hire_date <= '05/12/31';


SELECT employee_id, first_name, hire_date
FROM employees
WHERE hire_date BETWEEN '05/01/01' AND '05/12/31';

--�Ի����� '05/09'�� ����� ���, �̸�, �Ի����� ����Ͻÿ�.[3��]
SELECT employee_id, first_name, hire_date
FROM employees
WHERE hire_date LIKE '05/09%';

SELECT employee_id, first_name, hire_date
FROM employees
WHERE hire_date>= '05/09/01' AND hire_date <= '05/09/30';

SELECT employee_id, first_name, hire_date
FROM employees
WHERE hire_date BETWEEN '05/09/01' AND '05/09/30';


--NULL���� ������ IS NULL/ IS NOT NULL
--������ ���� �ʴ� ����� ���, �̸�, �޿�, ������� ����Ͻÿ�[72��]
SELECT employee_id, first_name, salary, commission_pct
FROM employees
WHERE commission_pct = NULL;   -- <>NULL  (X)

SELECT employee_id, first_name, salary, commission_pct
FROM employees
WHERE commission_pct IS NULL;  -- IS NOT NULL

--�μ���ġ�� ���� ���� ����� ���, �̸�, �μ���ȣ�� ����Ͻÿ�
SELECT employee_id, first_name, department_id
FROM employees
WHERE department_id IS NULL;

----------------------------------------------------
--���տ����� : ������, ������, ������
--101������� ���������� ����Ͻÿ� (AD_VP)
SELECT job_id
FROM employees
WHERE employee_id=101;

--101������� ���������� ����Ͻÿ�(AC_ACCOUNT, AC_MGR)
SELECT job_id
FROM job_history
WHERE employee_id=101;

--101������� ���������� ���������� ����Ͻÿ�
SELECT job_id, null
FROM employees
WHERE employee_id=101
UNION
SELECT job_id, start_date
FROM job_history
WHERE employee_id=101;


--176�� ����� ���������� ��������, ������������ ����Ͻÿ�(����:SA_REP -> SA_MAN-> ����:SA_REP)
SELECT job_id, null
FROM employees
WHERE employee_id=176
UNION
SELECT job_id, start_date
FROM job_history
WHERE employee_id=176;

--176�� ����� ���������� ������������Ͻÿ�(SA_REP, SA_MAN)
--UNION ( �ߺ�������)
SELECT job_id
FROM employees
WHERE employee_id=176
UNION
SELECT job_id
FROM job_history
WHERE employee_id=176;

--UNION ALL (�ߺ������� ����) -- (SA_REP, SA_MAN, SA_REP)
SELECT job_id
FROM employees
WHERE employee_id=176
UNION ALL
SELECT job_id
FROM job_history
WHERE employee_id=176;

--���������� ��������� �ٽô���ϴ� ����� ����Ͻÿ�
--������ : intersect  --(SA_REP)
SELECT job_id
FROM employees
WHERE employee_id=176
INTERSECT
SELECT job_id
FROM job_history
WHERE employee_id=176;

--���������� �ߺ����� �ʴ� ���������� ����Ͻÿ�
--������ : minus  job_history - employees (SA_MAN)
SELECT job_id ��������
FROM job_history
WHERE employee_id=176
MINUS
SELECT job_id  ��������
FROM employees
WHERE employee_id=176;


--���տ����� ����
176�� ����� ���������� ��������, ������������ ��� ����Ͻÿ�
SELECT job_id ��������, start_date
FROM job_history
WHERE employee_id=176
UNION
SELECT job_id  ��������, null
FROM employees
WHERE employee_id=176
ORDER BY start_date ASC;








