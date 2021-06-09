*문자조합 : ASCII, UNICODE, UTF-8, MS949, CP949, KSC5601, EUC-KR, SHIFT-JIS

-문자처리함수 : UPPER(), LOWER( ), INITCAP(), LENGTH(),
                     SUBSTR(), 
                     INSTR()
                     REPLACE(),
                     LPAD(), RPAD()
                    TRIM()
SELECT LENGTH('한글'),
           LENGTHB('한글')
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

SELECT '앞'||TRIM('  ABC   ')||'뒤',
           '앞'||TRIM(LEADING FROM '  ABC   ')||'뒤',
           '앞'||TRIM(TRAILING FROM '  ABC   ')||'뒤'
FROM dual;

SELECT '앞'||TRIM('^' FROM '^^ABC^^')||'뒤',  --TRIM(BOTH '^' FROM ~~)
           '앞'||TRIM(LEADING '^' FROM '^^ABC^^')||'뒤',
           '앞'||TRIM(TRAILING '^' FROM '^^ABC^^')||'뒤'
FROM dual;

-숫자처리함수
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


-날짜처리함수
SYSDATE, SYSTIMESTAMP, 
ADD_MONTHS(),
MONTHS_BETWEEN()
NEXT_DAY() : 돌아올 일자 
LAST_DAY() : 월의 마지막일자

SELECT SYSDATE,
           SYSTIMESTAMP
FROM dual;

SELECT ADD_MONTHS(SYSDATE, 1), --한달후
          ADD_MONTHS(SYSDATE, -1) --한달전
FROM dual;


SELECT MONTHS_BETWEEN(ADD_MONTHS(SYSDATE, 10), SYSDATE),
           ROUND(MONTHS_BETWEEN('21/09/07', SYSDATE)) --수료일까지의 개월수 
FROM dual;

SELECT NEXT_DAY(SYSDATE, '일'),  --돌아오는 일요일의 날자값
           NEXT_DAY('21/05/01', '월'), --5월의 첫월요일의 날짜값
           LAST_DAY(SYSDATE), --이달의 마지막날자
           LAST_DAY('21/02/01') --
FROM dual;

날짜값+숫자 : ex) SYSDATE+1 =>내일 
날짜값-숫자         SYSDATE -1 =>어제
날짜값 - 날짜값    (SYSDATE + 2) - (SYSDATE -1) =>기간(어제~모레)
                         '21/09/07' - SYSDATE => 일수
문자값 '21/05/27'을 날자자료형과 비교할경우 문자형이 날짜형으로 자동형변환됨
ex) SYSDATE > '21/05/27'
ex) SELECT FROM employees WHERE hire_date LIKE '05%';

-변환함수
숫자형 ----TO_CHAR() ----> 문자형  <---- TO_CHAR()--- 날짜형
        <-   TO_NUMBER()--                     TO_DATE() -->

--날짜를 문자로 변환
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD DAY HH:MI:SS')
FROM dual;

--숫자를 문자로 변환
SELECT TO_CHAR(123456789.567, 'L9,999,999,999,999.0000'), --￦123,456,789.5670
          TO_CHAR(123456789.567, '9,999.0')  --########
FROM dual;

--문자를 숫자로 변환
SELECT TO_NUMBER('￦123,456,789.5670', 'L9,999,999,999,999.0000')
FROM dual;

--문자를 날짜로 변환
SELECT TO_DATE('2021-01-01', 'YYYY-MM-DD'   )
FROM dual;

SELECT '22/01/01' - '21/01/01'
FROM dual; --오류발생

SELECT TO_DATE('22/01/01', 'YY/MM/DD') - TO_DATE('21/01/01')
FROM dual;

--올해 크리스마스의 요일을 출력하시오
SELECT TO_CHAR(TO_DATE('21/12/25'), 'DAY')
FROM dual;

SELECT TO_CHAR(TO_DATE('991231', 'YYMMDD'), 'DAY'), --21세기 현재기준(2099년으로 이해)
           TO_CHAR(TO_DATE('991231', 'RRMMDD'), 'DAY') --20세기 기준(1999년으로 이해) 
FROM dual;

----------------------------------------------------------------
NULL관련 함수
NVL(),
NVL2()
--부서없는 사원을 출력하시오(--178번사원)
SELECT *   
FROM employees
WHERE department_id IS NULL;

--부서없는 사원은 부서없음으로 출력, 그렇지 않으면 부서번호를 출력하시오(107건)
SELECT employee_id, department_id, NVL(TO_CHAR(department_id), '부서없음')--두개인자의 자료형일치해야함!
FROM employees;
 
--부서없는 사원은 '부서없음'으로 출력, 그렇지 않으면 '부서있음'를 출력하시오(107건)
SELECT employee_id, department_id, NVL2(department_id, '부서있음', '부서없음')
FROM employees;
-------------------------------------------------------------------
-- DECODE함수 : 조건문처리가능 >,<와 같은 비교연산처리가 불편하다
SELECT employee_id,
           job_id, 
           DECODE(job_id, 'AD_PRES', 'CEO', 
                                 'AD_VP', '임원',
                                 'EMP')
FROM employees;

SELECT employee_id,
           DECODE(manager_id, null, '관리자없음', '관리자있음')
FROM employees;   

--CASE식 : 조건문처리가능  비교연산처리가용이하다
--급여가 10000보다 큰 경우 'A'
--          5000보다 큰 경우 'B'
--          그외는  'C'
SELECT employee_id,
           salary,
          CASE    WHEN  salary > 10000 THEN 'A'
                     WHEN  salary > 5000   THEN 'B'
                     ELSE 'C'
          END
FROM employees;

SELECT employee_id,
           CASE  WHEN manager_id IS NULL THEN '관리자없음'
                    ELSE '관리자있음'
           END
FROM employees;
           









  

