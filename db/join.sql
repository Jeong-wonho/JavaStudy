--사원의 사번, 이름,  부서번호를 출력하시오[107건]
SELECT employee_id, first_name, department_id
FROM employees;

--부서번호, 부서명을 출력하시오[27건]
SELECT department_id, department_name
FROM departments; 

--사원의 사번, 이름, 부서번호, 부서명을 출력하시오
SELECT employee_id, first_name, department_id, department_name
FROM employees, departments; --오류

SELECT employee_id, first_name, employees.department_id, department_name
FROM employees, departments; --카티션곱

SELECT employee_id, first_name, employees.department_id, department_name
FROM employees, departments
WHERE employees.department_id = departments.department_id; --106건

--표준화된 ANSI조인
--JOIN ON
SELECT employee_id, first_name, e.department_id, department_name
FROM employees e JOIN departments d ON (e.department_id = d.department_id); --106건

--JOIN USING [조인조건용 컬럼명이 동일한 경우]
--주의 테이블명. 또는 테이블별치명. 사용불가
SELECT employee_id, first_name, 
           department_id, department_name
FROM employees e JOIN departments d USING(department_id); --106건


--NATURAL JOIN [조인조건용 컬럼명이 동일한 경우 자동 조건설정됨]
SELECT employee_id, first_name, 
           department_id, department_name
FROM employees  NATURAL JOIN departments; --32건

위의 NATURAL JOIN은 아래 ON과 같은 효과가 남
SELECT employee_id, first_name, 
           e.department_id, department_name
FROM employees e JOIN departments d ON (e.department_id = d.department_id AND e.manager_id = d.manager_id);
--------------------------------------------------------------------------------------------
--사원 사번, 이름, 부서번호, 부서명, 직무명(job_title)을 출력하시오
SELECT employee_id, first_name, 
           e.department_id, department_name,
           job_title
FROM employees e 
JOIN departments d ON ( e.department_id = d.department_id)
JOIN jobs j ON (e.job_id = j.job_id);

--사원 사번, 이름, 부서번호, 부서명, 부서가 속한 도시명(city)을 출력하시오
SELECT employee_id, first_name, 
           e.department_id, department_name,
           city
FROM employees e 
JOIN departments d ON ( e.department_id = d.department_id)
JOIN locations l ON (d.location_id = l.location_id);

--사원 사번, 이름, 부서번호, 부서명, 부서가 속한 도시명(city)을 출력하시오
--'s'로 포함한 부서중 'Seattle'도시에 속한 사원들만 출력한다 --7건
SELECT employee_id, first_name, 
           e.department_id, department_name,
           city
FROM employees e 
JOIN departments d ON ( e.department_id = d.department_id)
JOIN locations l ON (d.location_id = l.location_id)
--WHERE INSTR(department_name, 's') > 0
WHERE department_name LIKE '%s%'
AND city = 'Seattle';

--부서번호, 부서명, 부서가 속한 도시명, 국가명(country_name)을 출력하시오
SELECT department_id, department_name,
           city,
           country_name
FROM departments d 
JOIN  locations l ON (d.location_id = l.location_id)
JOIN countries c ON (l.country_id = c.country_id);
------------------------------------------------------------------------------------------
--OUTER JOIN   
  1) ANSI 표준방식           
   -LEFT OUTER JOIN
   -RIGHT OUTER JOIN

  2) 오라클 방식 : (+)
--모든사원의 사번, 이름, 부서번호, 부서명을 출력하시오. 부서가 없는 사원도 출력한다--107
SELECT employee_id, first_name, 
           e.department_id, department_name
FROM employees e LEFT OUTER JOIN departments d ON (e.department_id = d.department_id);

SELECT employee_id, first_name, 
           e.department_id, department_name
FROM employees e, departments d 
WHERE e.department_id = d.department_id(+);

--부서[27건]
--지역[23건]
--모든 지역의 지역ID, 도시명, 부서번호, 부서명을 출력하시오. 부서가 없는 지역도 모두 출력한다--43건
ex)                 AA     BB       null        null
                     CC      DD      1           F
SELECT l.location_id, city,
           department_id, department_name, d.location_id 
FROM departments d  RIGHT JOIN locations l ON (d.location_id = l.location_id);

SELECT l.location_id, city,
           department_id, department_name, d.location_id 
FROM departments d, locations l
WHERE d.location_id(+) = l.location_id;

--사원의 사번, 이름, 부서명, 직무명를 출력하시오, 단 부서가없는 사원도 출력한다--107건
SELECT employee_id, first_name, 
           e.department_id, department_name,
           job_title
FROM employees e LEFT OUTER JOIN departments d ON (e.department_id = d.department_id)
                            JOIN jobs j ON (e.job_id = j.job_id);

SELECT employee_id, first_name, 
           e.department_id, department_name,
           job_title
FROM employees e ,departments d, jobs j 
WHERE e.department_id = d.department_id(+) AND e.job_id = j.job_id;


--FULL OUTER JOIN : 양쪽테이블의 자료를 모두 출력한다(ANSI)
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
FROM a JOIN b ON a.b1 = b.b1; --2건

SELECT * 
FROM a LEFT JOIN b ON a.b1 = b.b1;

SELECT * 
FROM a RIGHT JOIN b ON a.b1 = b.b1;

SELECT * 
FROM a FULL JOIN b ON a.b1 = b.b1;
---------------------------------------------------

SELF JOIN : 자기참조관계에서 사용
--사원의 사번과 이름, 사원의 관리자번호, 관리자 이름을 출력하시오
SELECT e.employee_id 사번 , e.first_name 사원이름,
           m.employee_id 관리자번호, m.first_name 관리자이름
FROM employees  e  JOIN employees m ON ( e.manager_id = m.employee_id );

--사원의 부서와 사원의 관리자 부서가 서로 다른 사원들의 
사원의 사번과 이름, 부서번호, 부서명
사원의 관리자번호, 관리자 이름, 부서번호, 부서명을 출력하시오
SELECT e.employee_id 사번 , e.first_name 사원이름, e.department_id 사원부서번호, d.department_name 사원부서명, 
           m.employee_id 관리자번호, m.first_name 관리자이름, 
           m.department_id 관리자부서번호,  md.department_name 관리자부서명
FROM employees  e  JOIN employees m ON ( e.manager_id = m.employee_id )
                             JOIN departments d ON ( e.department_id = d.department_id)
                             JOIN departments md ON (m.department_id = md.department_id)
WHERE  e.department_id <> m.department_id;



