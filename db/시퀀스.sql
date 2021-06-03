-- ������ (������ ����)
CREATE SEQUENCE seq1;

-- ������ �Ϸù�ȣ �� ���.
SELECT seq1.NEXTVAL
FROM dual;

-- ������ ���� �Ϸù�ȣ�� Ȯ��(nextval ����Ŀ��� ����� �����մϴ�.)
SELECT seq1.CURRVAL FROM dual;

--������ ����
CREATE SEQUENCE seq2
START WITH 11
INCREMENT BY 3
MINVALUE 5
MAXVALUE 30
CYCLE -- MAXVALUE ���޽� MINVALUE�� ���ư��ڴ�.
NOCACHE;

--������ �Ϸù�ȣ Ȯ��
SELECT seq2.CURRVAL FROM dual;

--������ �Ϸù�ȣ�� ���
SELECT seq2.NEXTVAL
FROM dual;

SELECT seq2.NEXTVAL
FROM dual; -- 14, 17, 20, 23, ~29, 5;

--������ ����
ALTER SEQUENCE seq2
START WITH 1; --(X)�����ϰ� �ٽ� ������ �ۼ��ϴ°��� ����.!
MAXVALUE 3; --(X) 

--������ ����
DROP SEQUENCE seq2;

-- ���� ���� ����
SELECT * FROM user_constraints;
SELECT * FROM user_tables;
SELECT * FROM user_views;
SELECT * FROM user_sequences;

-- unique ���� ������ �����ϸ� �ڵ����� index�� �����ȴ�.



