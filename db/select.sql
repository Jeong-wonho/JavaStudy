--SELECT : 검색용 문법
--구성요소
--SELECT
--FROM
--WHERE
--GROUP BY
--HAVING
--ORDER BY   
-------------------------------------------------------------------------------------------------
--SELECT처리순서
--| <-----------   SELECTION절차 --------------------->|<-- PROJECTION절차-->
--             (조건에 만족하는 행 찾기)                          (필요한 컬럼을 출력)
--FROM -> WHERE -> GROUP BY ->  HAVING  ->  SELECT -> ORDER BY

SELECT employee_id, first_name, last_name
FROM employees;

--사원들의 모든 컬럼값을 출력하시오
SELECT *
FROM employees;

--컬럼(헤딩)의 별칭주기
SELECT employee_id "사원 아이디", first_name fn, last_name "ln", salary AS 급여
FROM employees;

--문자열은 ' '로 표현한다
--문자열 결합연산자 ||
SELECT employee_id,  first_name, last_name, 
           first_name || '~' || last_name 성명
FROM employees;

--행 중복 제거
SELECT department_id
FROM employees;

SELECT DISTINCT department_id
FROM employees;

SELECT DISTINCT department_id, job_id
FROM employees;

--산술연산식 : null값을 연산식에 사용하면 결과는 무조건 null을 반환한다
+, -, *, /
SELECT  employee_id, salary, commission_pct, salary + salary*commission_pct 실급여 
FROM employees;

--NULL은 아무값도 아니다
--null용 함수 : NVL(null값을 포함하는 표현식, null인경우 반환할 값)
SELECT  employee_id, salary, commission_pct, 
            salary + salary*NVL(commission_pct, 0) 실급여 
FROM employees;

--나머지값 계산함수 : mod()
SELECT 3+4,  3/4, MOD(3, 4)
--FROM employees;
FROM dual;

--ORDER BY
--오름차순 : 작은값먼저출력, 큰값나중출력
                 오래된날짜가 먼저, 최근날짜가 나중출력
         ASC - 생략
--내림차순 : DESC
--컬럼에 대한 별칭사용 가능,컬럼인덱스 사용, 프로젝션에서 사용하지 않은 컬럼(SELECT절에서 사용하지 않은 컬럼)도 사용가능

--많은 급여를 받는 사원순으로 사번, 이름, 급여를 출력하시오
SELECT employee_id, first_name, salary 
FROM employees
ORDER BY salary DESC;

SELECT employee_id, first_name, salary 급여 
FROM employees
ORDER BY 급여 DESC; --별칭사용

SELECT employee_id, first_name, salary 
FROM employees
ORDER BY 3 DESC;  --컬럼인덱스 사용

SELECT employee_id, first_name, salary 
FROM employees
ORDER BY job_id DESC;  --프로젝션에서 사용하지 않은 컬럼(SELECT절에서 사용하지 않은 컬럼)도 사용가능



--많은 급여를 받는 사원순으로 사번, 이름, 급여를 출력하시오. 급여가 같으면 이름을 사전순으로 정렬하시오
SELECT employee_id, first_name, salary
FROM employees
ORDER BY salary DESC, first_name ASC;

SELECT employee_id, first_name, salary
FROM employees
ORDER BY salary DESC, first_name;
-------------------------------------------------------------

--조건에 만족하는 행 추출하기
--비교연산자 : >, >=, <, <=, =, <>
--논리연산자 : AND, OR, NOT

--급여가 10000보다 많은 사원의 사번, 이름, 급여, 부서번호를 출력하시오[15건]
SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE salary > 10000;


--급여가 10000보다 많은 사원중 부서번호가 80번인 부서의 사번, 이름, 급여, 부서번호를 출력하시오[8건]
SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE salary > 10000 AND  department_id=80;

--급여가 10000부터 30000사이인 사원의 사번, 이름, 급여, 부서번호를 출력하시오[19건]
SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE salary >= 10000 AND salary <= 30000;

SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE salary  BETWEEN 10000 AND 30000;



--부서번호가 80번, 50번인 부서의 사번, 이름, 급여, 부서번호를 출력하시오[79건]
SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE department_id = 80 OR department_id = 50;

SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE department_id IN ( 80, 50 );

--부서번호가 80번도 아니고 50번도 아닌 부서의 사번, 이름, 급여, 부서번호를 출력하시오[107건-79건]
SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE department_id <> 80 AND department_id <> 50;

SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE NOT (department_id = 80 OR department_id = 50);

SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE department_id NOT IN (80, 50);

--급여가 10000부터 30000사이인 사원중 80번,50번부서사원의  사번, 이름, 급여, 부서번호를 출력하시오[11건]
SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE salary >= 10000 AND salary <= 30000 
   AND (department_id =80 OR department_id =50);

SELECT employee_id, first_name, salary, department_id 
FROM employees
WHERE salary BETWEEN 10000 AND 30000
   AND department_id IN (80, 50);

--이름이 kelly인 사원의 사번, 이름을 출력하시오. 단 대소문자는 구분안함
--대문자로 변환함수 : UPPER()/ 소문자로 변환함수 : LOWER( )
SELECT employee_id, first_name
FROM employees
WHERE LOWER(first_name) = 'kelly';


--이름이 'K'로 시작하는 사원의 사번, 이름을 출력하시오. 
--LIKE연산자 
     %패턴은 0이상의 문자와 일치
     _패턴은 1개의 문자와 일치
SELECT employee_id, first_name
FROM employees
WHERE first_name LIKE 'K%';  //--'K', 'Ka', 'Kabc'

--이름이 'K'로 시작하고 글자수가 5개인 사원의 사번, 이름을 출력하시오.
SELECT employee_id, first_name
FROM employees
WHERE first_name LIKE 'K____'; //Kabcd, K가나다라, K1234

--날짜값은 ' '로 표현한다
--입사일자가 '05/09/21'인 사원의 사번, 이름, 입사일을 출력하시오.
SELECT employee_id, first_name, hire_date
FROM employees
WHERE hire_date = '05/09/21';

--입사년도가 '05'인 사원의 사번, 이름, 입사일을 출력하시오.[29건]
SELECT employee_id, first_name, hire_date
FROM employees
WHERE hire_date LIKE '05%';

SELECT employee_id, first_name, hire_date
FROM employees
WHERE hire_date>= '05/01/01' AND hire_date <= '05/12/31';


SELECT employee_id, first_name, hire_date
FROM employees
WHERE hire_date BETWEEN '05/01/01' AND '05/12/31';

--입사년월이 '05/09'인 사원의 사번, 이름, 입사일을 출력하시오.[3건]
SELECT employee_id, first_name, hire_date
FROM employees
WHERE hire_date LIKE '05/09%';

SELECT employee_id, first_name, hire_date
FROM employees
WHERE hire_date>= '05/09/01' AND hire_date <= '05/09/30';

SELECT employee_id, first_name, hire_date
FROM employees
WHERE hire_date BETWEEN '05/09/01' AND '05/09/30';


--NULL관련 연산자 IS NULL/ IS NOT NULL
--수당을 받지 않는 사원의 사번, 이름, 급여, 수당률을 출력하시오[72건]
SELECT employee_id, first_name, salary, commission_pct
FROM employees
WHERE commission_pct = NULL;   -- <>NULL  (X)

SELECT employee_id, first_name, salary, commission_pct
FROM employees
WHERE commission_pct IS NULL;  -- IS NOT NULL

--부서배치를 받지 못한 사원의 사번, 이름, 부서번호를 출력하시오
SELECT employee_id, first_name, department_id
FROM employees
WHERE department_id IS NULL;

----------------------------------------------------
--집합연산자 : 합집합, 교집합, 차집합
--101번사원의 현재직무를 출력하시오 (AD_VP)
SELECT job_id
FROM employees
WHERE employee_id=101;

--101번사원의 이전직무를 출력하시오(AC_ACCOUNT, AC_MGR)
SELECT job_id
FROM job_history
WHERE employee_id=101;

--101번사원의 이전직무와 현재직무를 출력하시오
SELECT job_id, null
FROM employees
WHERE employee_id=101
UNION
SELECT job_id, start_date
FROM job_history
WHERE employee_id=101;


--176번 사원의 이전직무와 현재직무, 직무시작일을 출력하시오(이전:SA_REP -> SA_MAN-> 현재:SA_REP)
SELECT job_id, null
FROM employees
WHERE employee_id=176
UNION
SELECT job_id, start_date
FROM job_history
WHERE employee_id=176;

--176번 사원의 이전직무와 현재직무출력하시오(SA_REP, SA_MAN)
--UNION ( 중복행제거)
SELECT job_id
FROM employees
WHERE employee_id=176
UNION
SELECT job_id
FROM job_history
WHERE employee_id=176;

--UNION ALL (중복행제거 안함) -- (SA_REP, SA_MAN, SA_REP)
SELECT job_id
FROM employees
WHERE employee_id=176
UNION ALL
SELECT job_id
FROM job_history
WHERE employee_id=176;

--이전업무를 현재업무로 다시담당하는 사원을 출력하시오
--교집합 : intersect  --(SA_REP)
SELECT job_id
FROM employees
WHERE employee_id=176
INTERSECT
SELECT job_id
FROM job_history
WHERE employee_id=176;

--현재직무와 중복되지 않는 이전직무만 출력하시오
--차집합 : minus  job_history - employees (SA_MAN)
SELECT job_id 이전직무
FROM job_history
WHERE employee_id=176
MINUS
SELECT job_id  현재직무
FROM employees
WHERE employee_id=176;


--집합연산자 정렬
176번 사원의 이전직무와 현재직무, 직무시작일을 모두 출력하시오
SELECT job_id 이전직무, start_date
FROM job_history
WHERE employee_id=176
UNION
SELECT job_id  현재직무, null
FROM employees
WHERE employee_id=176
ORDER BY start_date ASC;








