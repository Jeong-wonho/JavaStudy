--단일행함수 : 각행별로 처리되는 함수
--다중행함수 :  여러행을 모아서 처리되는 함수
  COUNT()
  SUM()
  MAX()
  MIN()
  AVG()

SELECT COUNT(*), --NULL값 포함한 행수 107
           COUNT(department_id), --NULL값 제외한 행수 106
           SUM(salary), --급여총액 --691416
           AVG(salary), --급여평균 (NULL값 제외한 행수로 나누기됨)  : 691416 / 107
           MAX(salary),
           MIN(salary)
FROM employees;
-----------------------------------------------------------

SELECT
FROM
WHERE 행의 조건
GROUP BY 행의 그룹화

급여가 5000이상인 사원들의 부서별 사원수와 총급여를 계산하여 출력하시오
SELECT department_id, COUNT(*), SUM(salary)
FROM employees
WHERE salary >= 5000
GROUP BY department_id
ORDER BY department_id;

--2007년에 입사한 사원수와 평균급여를 출력하시오. 
  평균급여는 소수점이하1자리까지 표시하고 2자리에서 반올림한다.
SELECT COUNT(*), ROUND(AVG(salary), 1)
FROM employees
WHERE TO_CHAR(hire_date, 'YYYY') = '2007';

----2007년에 입사한 부서별 부서번호, 사원수와 평균급여를 출력하시오. 
  평균급여는 소수점이하1자리까지 표시하고 2자리에서 반올림한다.
  평균급여값이 많은 부서부터 출력하시오

SELECT department_id, COUNT(*), ROUND(AVG(salary), 1)
FROM employees
WHERE TO_CHAR(hire_date, 'YYYY') = '2007'
GROUP BY department_id
ORDER BY  3 DESC;

--지역별 지역번호(location_id), 부서수를 출력하시오
SELECT location_id, COUNT(*)
FROM departments
GROUP BY location_id;

--지역들의 지역별 지역번호(location_id), 부서수를 출력하시오
--지역별 부서수가 10개이상인 지역만 출력하시오
SELECT location_id, COUNT(*)
FROM departments
--WHERE COUNT(*) >= 10 
GROUP BY location_id
HAVING COUNT(*) >= 10;

--부서별 부서번호와 최대급여값을 출력하시오
SELECT department_id, MAX(salary)
FROM employees
GROUP BY department_id;

--부서별 부서번호와 최대급여값, 최대급여자사번을 출력하시오
SELECT department_id, MAX(salary), employee_id --오류발생
FROM employees
GROUP BY department_id;














