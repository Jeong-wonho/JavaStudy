--사원의 사번, 이름, 부서번호, 부서명을 출력하시오
SELECT employee_id, first_name, department_id, department_name
FROM employees, departments;

SELECT employee_id, first_name, department_id, department_name
FROM employees, departments;

SELECT employee_id, first_name, department_id, department_name
FROM employees, departments
where employees.department_id = departments.department_id;

--표준화된 Ansi조인
SELECT employee_id, first_name, employees.department_id, department_name
FROM employees JOIN departments
ON (employees.department_id = departments.department_id);

--join on 
select employee_id, first_name, e.department_id, department_name
from employees e Join departments d ON(e.department_id = d.department_id);

--join using [조인조건용 컬럼명이 동일한 경우만 사용이 가능하다]
select employee_id, first_name, department_id, department_name
FROM employees e JOIN departments d USING(department_id); --어느 테이블의 컬럼인지 안정해줘도 되는구나

--Natural join[조인조건용 컬럼명이 동일한 경우 자동 조건설정됨]
select employee_id, first_name, e.department_id, department_name
from employees e join departments d on (e.department_id = d.department_id and e.manager_id = d.manager_id);

--사원 사번, 이름, 부서번호 부서명, 직무명을 출력하시오
select employee_id, first_name, e.department_id, department_name, job_title
from employees e
join departments d on (e.department_id = d.department_id)
join jobs j on (e.job_id = j.job_id);

--사원 사번, 이름, 부서번호, 부서명, 부서가 속한 도시명을 출력하시오
select employee_id, first_name, e.department_id, department_name, city
from employees e
join departments d on (e.department_id = d.department_id)
join locations l   on (d.location_id = l.location_id);

--사원 사번, 이름, 부서번호, 부서명, 부서가 속한 도시명을 출력하시오
--'s'로 포함한 부서중 'seattle'도시에 속한 사원들만 출력하다.
select employee_id, first_name, e.department_id, department_name, city
from employees e
join departments d on (e.department_id = d.department_id)
join locations l   on (d.location_id = l.location_id)
WHERE INSTR(department_name,  's') > 0 AND city = 'Seattle';

--부서번호, 부서명, 부서가 속한 도시명, 국가명 을 출력하시오
select department_id, department_name, city, country_name
from departments d
join locations l on (d.location_id = l.location_id)
join countries c on (l.country_id  = c.country_id);

-- outer join
-- left outer join
-- rigth outer join

--모든 사원의 사번, 이름, 부서번호, 부서명을 출력하시오 부서가 없는 사람도 출력한다 -- 107 왼쪽에 employee사용
select employee_id, first_name, e.department_id, department_name
from employees e left outer join departments d on (e.department_id = d.department_id);

--모든 지역의 지역 id ,도시명, 부서번호, 부서명을 출력하시오 부서가 없는 지역도 모두 출력한다. --43
select count(*) from locations;
select l.location_id, city,
department_id, department_name, d.location_id
from departments d right join locations l on (d.location_id = l.location_id);


-- 사원의 사번, 이름, 부서명, 직무명을 출력하시오, 단 부서가 없는 사원도 출력한다.
select employee_id, first_name,
            e.department_id, department_name,
            job_title
from employees e left outer join departments d on (e.department_id = d.department_id) join jobs j on (e.job_id = j.job_id);

-- inner join 확인
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
FROM a JOIN b ON a.b1 = b.b1;

SELECT * 
FROM a LEFT JOIN b ON a.b1 = b.b1;

SELECT * 
FROM a RIGHT JOIN b ON a.b1 = b.b1;

SELECT * 
FROM a FULL JOIN b ON a.b1 = b.b1;

--self join : 자기 참조관계에서 사용
--사원의 사번과 이름, 사원의 관리자번호, 관리자 이름을 출력하시오
select e.employee_id 사번, e.first_name 사원이름,
            m.employee_id 관리자번호, m.first_name 관리자이름
from employees e JOIN employees m ON ( e.manager_id = m.employee_id );

--사원의 부서와 사원의 관리자 부서가 서로 다른 사원들의 
--사원의 사번과 이름, 부서번호, 부서명
--사원의 관리자번호, 관리자 이름, 부서번호, 부서명을 출력하시오
SELECT e.employee_id 사번 , e.first_name 사원이름, e.department_id 사원부서번호, d.department_name 사원부서명,
           m.employee_id 관리자번호, m.first_name 관리자이름, 
           m.department_id 관리자부서번호,  md.department_name 관리자부서명
FROM employees  e  JOIN employees m ON ( e.manager_id = m.employee_id )
                             JOIN departments d ON ( e.department_id = d.department_id)
                             JOIN departments md ON (m.department_id = md.department_id)
WHERE  e.department_id <> m.department_id;
