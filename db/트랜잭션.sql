-- 트랜잭션이란 일처리 작업 단위이다.
--ex) 계좌이체(A계좌에서 금액이 출금, B계좌로 금액이 입금)
-- <- 트랜잭션시작
-- A계좌에서 금액이 출금
-- B계좌로 금액이 입금
-- 트랜잭션 종료!
-- (작업성공 : 완료=> commit, 작업실패: 원상태로 복구=>rollback)
-- DDL(CREATE, ALTER, DROP) : 자동완료 (트랜잭션시작, DDL구문처리, Commit) (DDL부분은 자동으로 COMMIT이 되기에 관리자가 COMMIT할 수 없다.
-- DML (INSERT, UPDATE, DELETE) : 자동 완료 안됨(트랜잭션시작, DML구문처리)
--                                 COMMIT/ROLLBACK이 필요하다.
CREATE TABLE account(no varchar2(3) primary key, balance number(5));

--트랜잭션 시작
INSERT INTO account(no, balance) VALUES('100', 1000);
INSERT INTO account(no, balance) VALUES('200', 1000);
SELECT * FROM account;--  => 완료가 되지 않으면 임시 저장소에 데이터만 보게 되는것이다.
--트랜잭션 완료
commit;
----------------------------------------------------------------
UPDATE account SET balance = balance - 10 WHERE no = '100';
UPDATE account SET balance = balance + 10 WHERE no = '200';

select * from account;

--트랜잭션 복구
rollback;


/* UPDATE - 1
   INSERT - 2
   INSERT - 3
   DELETE - 4
   UPDATE - 5
   commit(1,2,3,4,5) 모두 처리 됨
   
   UPDATE - 1
   INSERT - 2
   rollback(1,2 취소)
   INSERT - 3
   DELETE - 4
   commit(3, 4처리)
   UPDATE - 5 
   DELETE FROM account -6
   WHERE no = '100';
   
 DELETE FROM account -1
 WHERE no = '100'; --DEAD LOCK지연됨
 
 rollback;
 1개행이 삭제되엇습니다.
 */
 
 /* 
 명시적 트래잭션 제어문 
 truncate 권한을 부여 받은 사람들만 다른계정에 테이블을 만들어낼수 있다.
 */
  
CREATE TABLE order_info(
    order_no number CONSTRAINT order_info_no_pk PRIMARY KEY,
    order_id VARCHAR(10) CONSTRAINT order_info_id_nn NOT NULL,
    order_dt DATE DEFAULT SYSDATE NOT NULL,
    CONSTRAINT order_info_id_fk FOREIGN KEY (order_id) REFERENCES customer(id)
    );
       
--4)컬럼삭제
/*
ALTER TABLE 테이블명
DROP COLUMN 컬럼명

--5)테이블 레벨로 제약조건 추가
ALTER TABLE 테이블명
ADD CONSTRAINT 제약조건명 제약조건 종류 컬럼명
EX)ADD CONSTRAINT customer_pk PRIMARY KEY id;
   ADD CONSTRAINT order_pord_no_fk FOREIGN KEY prod_no
                                    REFERENCES products(product_no);
    ADD CONSTRAINT order_quantity_ck CHECK order_quantity > 0;
    
제약조건이름 변경/삭제
ALTER TABLE 테이블명
RENAME CONSTRAINT 기존 제약 조건명 TO 새 제약 조거명;
DROP CONSTRAINT 제약조건명;
  */
  
  /* 참조제약 조건 설정시 부모삭제와 함께 자식도 삭제되도록 설정
ALTER TABLE order_info
ADD CONSTRAINT order_id_fk FOREIGN KEY order_id,
                            References(id)
                            ON DELETE CASCADE;
    
insert into order_info(order_no, order_id) values (3, 'id1');

delete from customer where id = 'id1'; -- 부모삭제시 자식(order_info)행도 삭제

select * from order_info where order_id = 'id1'; -- 0건

