--1. 급여가 10000이거나 14000인 사원들의 사번, 이름, 급여를 검색
SELECT employee_id, first_name, salary
FROM employees
WHERE salary IN (10000, 14000);

--2. first_name 에 대소문자 구별 없이('e', 'E')를 포함하는 모든 산원을 검색하시오
SELECT first_name
FROM employees
WHERE upper(first_name) LIKE '%E%'; 

--3 first_name이 'J'로시작하고 n문자를 포함하는 사원의 사번, 이름을 검색하시오.
SELECT employee_id, first_name
FROM employees
WHERE first_name LIKE 'J%n%';

--4 급여가 10000이상인 사원의 사번, 부서번호, 이름, 급여, 수당을 출력, 단 부서번호가 30번, 60번 90번인 부서는 제외하고 사원을 검색
SELECT employee_id, department_id, first_name, salary, commission_pct
FROM employees
WHERE salary >= 10000 AND department_id NOT IN (30,60,90);
-- department_id <> 30 AND department_id <> 60 AND department_id <>90
--5 급여가 4000보다 많은 사람들의 부서별 급여 평균을 출력하시오. 단 급여 평균은 소수점 이하 2자리에서 반올림
SELECT department_id, ROUND(AVG(salary), 1)
FROM employees
WHERE salary > 4000
GROUP BY department_id;

--6 부서 배치를 받지 않은 사원은 제외하고 부서별 급여평균을 출력하시오, 단 급여평균은 소숫점이하 2자리에서 반올림
SELECT department_id, ROUND(AVG(salary), 1)
FROM employees
WHERE department_id IS NOT NULL
GROUP BY department_id;

--7 부서배치를 받지 않은 사원은 제외하고 급여평균이 10000이상인 부서별 급여평균을 출력하시오,
SELECT department_id, ROUND(AVG(salary), 1) 
FROM employees
WHERE department_id IS NOT NULL
GROUP BY department_id
HAVING  ROUND(AVG(salary), 1)  >= 10000;

--8 사원의 근무일수 근무개월수를 출력하시오
SELECT hire_date, trunc((sysdate-hire_date)-1) 근속일수 , round(months_between(sysdate, hire_date),-1) 근속월수
FROM employees;

--9 년도별 입사자수를 출력하시오, 단 최근 년도 부터
SELECT To_CHAR(hire_date, 'YYYY'), COUNT(*)
FROM employees
GROUP BY To_CHAR(hire_date, 'YYYY')
ORDER BY To_CHAR(hire_date, 'YYYY') DESC;

--10. 하반기 (7~12울) 월별 입사자수를 출력하시오 입사자수가 5명이상인 경우만 출력합니다.
SELECT TO_CHAR(hire_date, 'mm') 입사월 , Count(TO_CHAR(hire_date, 'mm')) 입사자수
FROM employees
GROUP BY TO_CHAR(hire_date, 'mm')
HAVING Count(TO_CHAR(hire_date, 'mm')) > 5;