-- 시퀀스 (순서를 갖는)
CREATE SEQUENCE seq1;

-- 시퀀스 일련번호 값 얻기.
SELECT seq1.NEXTVAL
FROM dual;

-- 시퀀스 현재 일련번호값 확인(nextval 사용후에만 사용이 가능합니다.)
SELECT seq1.CURRVAL FROM dual;

--시퀀스 생성
CREATE SEQUENCE seq2
START WITH 11
INCREMENT BY 3
MINVALUE 5
MAXVALUE 30
CYCLE -- MAXVALUE 도달시 MINVALUE로 돌아가겠다.
NOCACHE;

--시퀀스 일련번호 확인
SELECT seq2.CURRVAL FROM dual;

--시퀀스 일련번호값 얻기
SELECT seq2.NEXTVAL
FROM dual;

SELECT seq2.NEXTVAL
FROM dual; -- 14, 17, 20, 23, ~29, 5;

--시퀀스 변경
ALTER SEQUENCE seq2
START WITH 1; --(X)제거하고 다시 시퀀스 작성하는것이 낫다.!
MAXVALUE 3; --(X) 

--시퀀스 제거
DROP SEQUENCE seq2;

-- 제약 조건 보기
SELECT * FROM user_constraints;
SELECT * FROM user_tables;
SELECT * FROM user_views;
SELECT * FROM user_sequences;

-- unique 제약 조건을 설정하면 자동으로 index가 생성된다.



