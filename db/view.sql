-- view 라는 객체!
-- 사원의 사번, 이름, 부서번호 , 부서명, 직무명을 출력하시오
SELECT employee_id, first_name, e.department_id, department_name, job_title
FROM employees e JOIN departments d ON (e.department_id = d.department_id)
                JOIN jobs j ON (e.job_id = j.job_id);
                
--뷰생성
CREATE VIEW emp_vw1
AS SELECT employee_id, first_name, e.department_id, department_name, job_title
FROM employees e JOIN departments d ON (e.department_id = d.department_id)
                JOIN jobs j ON (e.job_id = j.job_id);

--view도 객체이다.                
SELECT * FROM emp_vw1;
SELECT employee_id FROM emp_vw1;
--뷰생성
CREATE VIEW emp_vw2 --뷰와 별칭을 붙임으로써 보안상 예민한 컬럼을 막을 수 있다.
AS SELECT employee_id 사번, first_name 이름, e.department_id 부서번호, department_name 부서명, job_title 직무명
FROM employees e JOIN departments d ON (e.department_id = d.department_id)
                JOIN jobs j ON (e.job_id = j.job_id);
                
SELECT 사번 FROM emp_vw2;
SELECT employee_id FROM emp_vw2; --(x)

--뷰 변경 (ALTER X, TABLE엔 실제 자료, VIEW 실제 자료 X)
CREATE OR REPLACE VIEW emp_vw2
AS SELECT employee_id 사번, first_name 이름, e.department_id 부서번호, department_name 부서명,
job_title 직무명, city 부서도시
FROM employees e JOIN departments d ON (e.department_id = d.department_id)
                JOIN jobs j ON (e.job_id = j.job_id)
                JOIN locations i ON (d.location_id = i.location_id);

SELECT * FROM emp_vw2;

SELECT * FROM EMP_DETAILS_VIEW;

-- 뷰 생성!! 
CREATE OR REPLACE VIEW customer_vw1
AS SELECT id, pwd, name
FROM customer;

SELECT * FROM customer_vw1;

--테이블에 행 추가
CREATE TABLE customer(id varchar2(10) NOT NULL PRIMARY KEY,
pwd varchar2(10),
name varchar2(10),
buidingno varchar2(10));

alter table customer rename column buidingno to buildingno;
-- 뷰 생성!! 
CREATE OR REPLACE VIEW customer_vw1
AS SELECT id, pwd, name
FROM customer;

SELECT * FROM customer_vw1;
-- 테이블에 행추가
INSERT INTO customer(id, pwd, name, buildingno) VALUES ('id1', 'p1', 'n1', '');

--뷰에 행추가
INSERT INTO customer_vw1(id, pwd, name) values ('id2', 'p2', 'n2');

--뷰를 읽기 전용
CREATE OR REPLACE VIEW customer_vw1
AS SELECT id, pwd, name
FROM customer
WITH READ ONLY;

--뷰에 행추가("cannot perform a DML operation on a read-only view")
INSERT INTO customer_vw1(id, pwd, name) VALUES ('id3', 'p3', 'n3');

--뷰제거하기
DROP VIEW customer_vw1;
