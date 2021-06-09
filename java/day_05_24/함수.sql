*�������� : ASCII, UNICODE, UTF-8, MS949, CP949, KSC5601, EUC-KR, SHIFT-JIS

-����ó���Լ� : UPPER(), LOWER( ), INITCAP(), LENGTH(),
                     SUBSTR(), 
                     INSTR()
                     REPLACE(),
                     LPAD(), RPAD()
                    TRIM()
SELECT LENGTH('�ѱ�'),
           LENGTHB('�ѱ�')
FROM dual;

SELECT SUBSTR('hellojava', 2, 4)   --ello
FROM dual; 

SELECT INSTR('hellojava', 'l') --3
        ,  INSTR('hellojava', 'l', 4) --4
        ,  INSTR('hellojava', 'l', 1, 2) --4
FROM dual;

SELECT REPLACE('hellojava', 'l', 't') --hettojava
FROM dual;

SELECT LPAD('hellojava', 15, '^'), --^^^^^^hellojava
           RPAD('hellojava', 15, '^'), --hellojava^^^^^^
            RPAD((LPAD('hellojava', 12, '^') , 15, '^')       --^^^hellojava^^^
FROM dual;

SELECT '��'||TRIM('  ABC   ')||'��',
           '��'||TRIM(LEADING FROM '  ABC   ')||'��',
           '��'||TRIM(TRAILING FROM '  ABC   ')||'��'
FROM dual;

SELECT '��'||TRIM('^' FROM '^^ABC^^')||'��',  --TRIM(BOTH '^' FROM ~~)
           '��'||TRIM(LEADING '^' FROM '^^ABC^^')||'��',
           '��'||TRIM(TRAILING '^' FROM '^^ABC^^')||'��'
FROM dual;

-����ó���Լ�
ROUND(), TRUNC(), CEIL(), FLOOR(), MOD()
SELECT ROUND(45.923), --46
           ROUND(45.923, 1), --45.9
           ROUND(45.923, 2),  --45.92
           ROUND(45.923, -1)
FROM dual;

SELECT TRUNC(45.923), --45 
           TRUNC(45.923, 1), --45.9
           TRUNC(45.923, 2),  --45.92
           TRUNC(45.923, -1)  --40
FROM dual;

SELECT CEIL(45.923),  FLOOR(45.923)
FROM dual;


-��¥ó���Լ�
SYSDATE, SYSTIMESTAMP, 
ADD_MONTHS(),
MONTHS_BETWEEN()
NEXT_DAY() : ���ƿ� ���� 
LAST_DAY() : ���� ����������

SELECT SYSDATE,
           SYSTIMESTAMP
FROM dual;

SELECT ADD_MONTHS(SYSDATE, 1), --�Ѵ���
          ADD_MONTHS(SYSDATE, -1) --�Ѵ���
FROM dual;


SELECT MONTHS_BETWEEN(ADD_MONTHS(SYSDATE, 10), SYSDATE),
           ROUND(MONTHS_BETWEEN('21/09/07', SYSDATE)) --�����ϱ����� ������ 
FROM dual;

SELECT NEXT_DAY(SYSDATE, '��'),  --���ƿ��� �Ͽ����� ���ڰ�
           NEXT_DAY('21/05/01', '��'), --5���� ù�������� ��¥��
           LAST_DAY(SYSDATE), --�̴��� ����������
           LAST_DAY('21/02/01') --
FROM dual;

��¥��+���� : ex) SYSDATE+1 =>���� 
��¥��-����         SYSDATE -1 =>����
��¥�� - ��¥��    (SYSDATE + 2) - (SYSDATE -1) =>�Ⱓ(����~��)
                         '21/09/07' - SYSDATE => �ϼ�
���ڰ� '21/05/27'�� �����ڷ����� ���Ұ�� �������� ��¥������ �ڵ�����ȯ��
ex) SYSDATE > '21/05/27'
ex) SELECT FROM employees WHERE hire_date LIKE '05%';

-��ȯ�Լ�
������ ----TO_CHAR() ----> ������  <---- TO_CHAR()--- ��¥��
        <-   TO_NUMBER()--                     TO_DATE() -->

--��¥�� ���ڷ� ��ȯ
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD DAY HH:MI:SS')
FROM dual;

--���ڸ� ���ڷ� ��ȯ
SELECT TO_CHAR(123456789.567, 'L9,999,999,999,999.0000'), --��123,456,789.5670
          TO_CHAR(123456789.567, '9,999.0')  --########
FROM dual;

--���ڸ� ���ڷ� ��ȯ
SELECT TO_NUMBER('��123,456,789.5670', 'L9,999,999,999,999.0000')
FROM dual;

--���ڸ� ��¥�� ��ȯ
SELECT TO_DATE('2021-01-01', 'YYYY-MM-DD'   )
FROM dual;

SELECT '22/01/01' - '21/01/01'
FROM dual; --�����߻�

SELECT TO_DATE('22/01/01', 'YY/MM/DD') - TO_DATE('21/01/01')
FROM dual;

--���� ũ���������� ������ ����Ͻÿ�
SELECT TO_CHAR(TO_DATE('21/12/25'), 'DAY')
FROM dual;

SELECT TO_CHAR(TO_DATE('991231', 'YYMMDD'), 'DAY'), --21���� �������(2099������ ����)
           TO_CHAR(TO_DATE('991231', 'RRMMDD'), 'DAY') --20���� ����(1999������ ����) 
FROM dual;

----------------------------------------------------------------
NULL���� �Լ�
NVL(),
NVL2()
--�μ����� ����� ����Ͻÿ�(--178�����)
SELECT *   
FROM employees
WHERE department_id IS NULL;

--�μ����� ����� �μ��������� ���, �׷��� ������ �μ���ȣ�� ����Ͻÿ�(107��)
SELECT employee_id, department_id, NVL(TO_CHAR(department_id), '�μ�����')--�ΰ������� �ڷ�����ġ�ؾ���!
FROM employees;
 
--�μ����� ����� '�μ�����'���� ���, �׷��� ������ '�μ�����'�� ����Ͻÿ�(107��)
SELECT employee_id, department_id, NVL2(department_id, '�μ�����', '�μ�����')
FROM employees;
-------------------------------------------------------------------
-- DECODE�Լ� : ���ǹ�ó������ >,<�� ���� �񱳿���ó���� �����ϴ�
SELECT employee_id,
           job_id, 
           DECODE(job_id, 'AD_PRES', 'CEO', 
                                 'AD_VP', '�ӿ�',
                                 'EMP')
FROM employees;

SELECT employee_id,
           DECODE(manager_id, null, '�����ھ���', '����������')
FROM employees;   

--CASE�� : ���ǹ�ó������  �񱳿���ó���������ϴ�
--�޿��� 10000���� ū ��� 'A'
--          5000���� ū ��� 'B'
--          �׿ܴ�  'C'
SELECT employee_id,
           salary,
          CASE    WHEN  salary > 10000 THEN 'A'
                     WHEN  salary > 5000   THEN 'B'
                     ELSE 'C'
          END
FROM employees;

SELECT employee_id,
           CASE  WHEN manager_id IS NULL THEN '�����ھ���'
                    ELSE '����������'
           END
FROM employees;
           









  

