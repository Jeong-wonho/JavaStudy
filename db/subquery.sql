--subquery: 부분질의, 순차질의

--'IT'부서에 속한 사원 사번, 이름, 급여를 출력하시오 
SELECT emplyoee_id, first_name, salary
FROM employees e JOIN departments d ON (e.department_id = d.department_id)
WHERE department_name = 'IT';

--1) 'IT'부서의 부서번호검색한다 SELECT department_id FROM departments WHERE department_name = 'IT'
--2) 1)부서번호와 같은 부서번호를 갖는 사원을 검색한다  
             SELECT emplyoee_id, first_name, salary 
             FROM employees
             WHERE department_id = 1)

SELECT emplyoee_id, first_name, salary 
FROM employees
WHERE department_id = (SELECT department_id FROM departments WHERE department_name = 'IT');

--subquery의 종류
--위치에 따른 구분
   SubQuery : WHERE절
   INLINE View : FROM절
   Scalar Query : SELECT절

--서브쿼리의 결과행수에 따른 구분
  multi Row SubQuery : 메인쿼리의 WHERE절에서 비교연산자 사용불가
                                 IN, >ALL, <ALL, >ANY, <ANY
  single Row SubQuery : 메인쿼리의 WHERE절에서 비교연산자(>,<,>=,<=,<>) 사용가능

--사원의 사번, 급여를 출력하시오. 직무명에 대소문자구분없이 manager가 포함된 사원들만 출력한다
--1) 직무명에 manager가 포함된 job_id를 검색한다 
            SELECT job_id FROM jobs WHERE LOWER(job_title) LIKE '%manager%' 
--2) 1)과 같은 job_id를 갖는 사원의 사번, 급여를 검색한다

--IN연산자 : =ANY와 같음
SELECT employee_id, salary
FROM employees 
WHERE job_id IN (SELECT job_id FROM jobs WHERE LOWER(job_title) LIKE '%manager%');

--직무명이 'Sales Representative'인 사원의 사번, 급여, 부서ID를 출력하시오.
SELECT employee_id, salary, department_id
FROM employees
WHERE job_id = (SELECT job_id FROM jobs WHERE job_title = 'Sales Representative')

--직무명이 'Sales'로 시작하는  사원의 사번, 급여, 부서ID를 출력하시오.
SELECT employee_id, salary, department_id
FROM employees 
WHERE job_id IN (SELECT job_id FROM jobs WHERE job_title LIKE 'Sales%');

--부서번호가 100보다 크거나 부서가 없는 사원들의 직무명을 출력하시오
1)  부서번호가 100보다 크거나 부서가 없는 사원의 job_id검색한다
2)  1)과 같은 직무를 검색한다
SELECT job_title
FROM jobs
WHERE job_id IN (SELECT job_id FROM employees WHERE department_id > 100 OR department_id IS NULL);


-->ALL, <ALL, >ANY, <ANY
SELECT * 
FROM employees
WHERE department_id  IN  (10, 20, 30); --10번부서, 20번부서, 30번부서

SELECT employee_id, department_id
FROM employees
WHERE department_id  >ALL (20, 30);  -- 서브쿼리결과중 최대값보다 크다

SELECT employee_id, department_id
FROM employees
WHERE department_id  <ALL (20, 30); -- 서브쿼리결과중 최소값보다 작다

SELECT employee_id, department_id
FROM employees
WHERE department_id >ANY (20, 30); --서브쿼리결과중 최소값보다 크다

SELECT employee_id, department_id
FROM employees
WHERE department_id  <ANY (20, 30); --서브쿼리결과중 최대값보다 작다

SELECT employee_id, department_id
FROM employees
WHERE department_id  IN (10, 20, NULL, 30); --NULL해당 사원 못찾음

SELECT employee_id, department_id
FROM employees
WHERE NVL(department_id, 0) IN (10, 20, 0, 30);
                                               (SELECT NVL(department_id, 0) FROM ~ )


SELECT employee_id, department_id
FROM employees
WHERE department_id  NOT IN (10, 20, NULL, 30); 







