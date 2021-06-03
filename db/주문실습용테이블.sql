-- 고객[CUSTOMER]
--  id    pwd  name  buildingno
-- 'id1' 'p1'  'n1'    ''
-- 'id2' 'p2'  'n2'    ''
-- 'id3' 'p3'  'n3'    ''

-- 상품[PRODUCT]
-- prod_no prod_name prod_price prod_mf_dt
-- 'C0001' '아메리카노'   '1000'   '21/06/02'
-- 'C0002' 'ICE아메리카노' '1000'  '21/06/02'
-- 'C0003' '카페라떼'     '1500'   '21/06/02'
-- 'G0001' '텀블러1'     '5000'   '21/01/30'
-- 'G0002' '다이어리1'   '6000'   '21/01/14'
-- 'F0001' '치즈케익'    '4000'   '21/06/01'
-- 'F0002' '바나나'     '2000'    '21/05/31'

INSERT INTO product VALUES ('C0001', '아메리카노', '1000', '21/06/02');
INSERT INTO product VALUES ('C0002', 'ICE아메리카노', '1000',  '21/06/02');
INSERT INTO product VALUES ('C0003', '카페라떼', '1500', '21/06/02');
INSERT INTO product VALUES ('G0001', '텀블러1', '5000', '21/01/30');
INSERT INTO product VALUES ('G0002', '다이어리1', '6000', '21/01/14');
INSERT INTO product VALUES ('F0001', '치즈케익', '4000', '21/06/01');
INSERT INTO product VALUES ('F0002', '바나나', '2000', '21/05/31');
commit;

SELECT * FROM product;

-- 주문기본정보[ORDER_INFO]
-- order_no order_id order_dt
--     1     'id2'     ''
--     2     'id3'     ''

-- 주문기본정보용 시퀀스(ORDER SEQ)
CREATE SEQUENCE order_seq;
rollback;

INSERT INTO order_info(order_no, order_id) VALUES (order_seq.NEXTVAL, 'id2');
INSERT INTO order_info(order_no, order_id) VALUES (order_seq.NEXTVAL, 'id3');

SELECT * FROM order_info;
SELECT order_no, order_id, TO_CHAR(order_dt, 'YY/MM/DD HH24:MI:SS') FROM order_info ORDER BY order_dt;


-- 존재하지 않는 주문자 아이로 주문추가 
INSERT INTO order_info(order_no, order_id) VALUES (order_seq.NEXTVAL,'id999'); -- (X)
commit;



