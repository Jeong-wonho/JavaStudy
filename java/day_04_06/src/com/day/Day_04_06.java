package com.day;

public class Day_04_06 {

	
	
	public static void main(String[] args) {//�ݹ��Լ�
		// ���������(+, -, *, /, %)
/*
		int c = 0; //�ʱ��
		c = 300;
		c = c + 300;
		System.out.println(c);
		c += 300;
		System.out.println(c);
		c = c-100;
		System.out.println(c);
		c -= 100;
		System.out.println(c);
		c = c * 2;
		System.out.println(c);
		c *= 2;;
		System.out.println(c);
		c = c/2;
		System.out.println(c);
		c /= 2;
		System.out.println(c);
		// �񱳿����� (==, <=, >=, <, >, !=(not������))
		System.out.println(100 == 200);
		c *= 10;
		System.out.println(c);
		System.out.println(c % 2 == 1);
		System.out.println(c % 2 == 0);
		
		System.out.println(300 <= 300); // �ε�ȣ�� ������!
		System.out.println(300 < 300); // => �Ҹ�Ÿ��
		
		boolean is_b = 300 <= 300 - 1; // �켱����: ��������� > �񱳿����� > ���Կ�����
		System.out.println("(!)�����ڰ� ���� ����:" + is_b);
		System.out.println("(!)�����ڰ� �ִ� ����:" + !is_b);
		
		int l = 100 - 50;
		int r = 200 - 150;
		System.out.println(l != r);
		System.out.println(l_f() != r_f());	
		// ���Կ����� (=)
		
		//���Կ�����: ������ ���׿� �־��ش�.
*/
//		System.out.println(true && false);
		
		
//		System.out.println(trues() && falses()); // ���̵� ���� �� &&������ Ȱ���Ѵ�.
//		System.out.println(falses() || trues()); // �����̳� �ڵ�����ȣ�� �Է��ϼ���
		// && �ΰ��� �����ؾ� �۾��� ����ȴ�. || �����ϳ��� �����ص��Ǽ� ���ʸ� �����ǵ� ������ ��ģ��.
		
//		System.out.println(trues() && falses() || trues2());
//		System.out.println("============================");
//		System.out.println(falses() || trues() && trues2()); //||�����ڸ� ������� �տ��� True�̸� �ڿ��� �����Ѵ�.!
		
//		byte c = 127;
//		System.out.println(c++); // ����ó�� �Ǵ� ���� 1
//		System.out.println(c);
//		System.out.println(c--); // ����ó�� �Ǵ� ���� 2
//		System.out.println(c);
		
//		int c = 0;
//		int c2 = c++; //���Կ����� �������Ŀ� 1�� �߰��ȴ�.
//		System.out.println("c2: "+c2+" �Դϴ�.");
//		int c3 = ++c;
//		System.out.println("c2: "+c3+" �Դϴ�.");
		
//		byte b = 127; //b(^n-1)-1
//		System.out.println(--b);
//		System.out.println(b);
		
//		if ((falses() || trues()) && trues2()) {
//			System.out.println("�ȳ�");
//			System.out.println("�Ǿȳ�");
//		}
//		System.out.println("-----------------");
//		System.out.println("�׷��� �ȳ�");
//		boolean is_b2 = trues();
//		if (is_b2) {
//			System.out.println("���� if ���̿���");
//			System.out.println("�ȳ�");
//			System.out.println("�Ǿȳ�");
//		} else {
//			System.out.println("���� else���̿���");
//			System.out.println("�ƴϿ�");
//			System.out.println("�� �ƴϿ�~ ���� �ƴϿ�~~");
//		}
		
//		int c = 75;
//		
//		if (c >= 90) 
//			System.out.println("90����:"+c);
//		 else if (c >= 80) 
//			System.out.println("80����:"+c);
//		 else if (c >= 70) 
//			System.out.println("70����:"+c);
//		 else if (c >= 60) 
//			System.out.println("60����:"+c);
//		 else
//			System.out.println(c);
		
//		int id = 1234;
//		int pw = 5678;
//		if (id == 124 || pw == 5678) {
//			System.out.println("īī���� ���� ���� ȯ���մϴ�.");
//			}
//		
//		if (id == login(1234)) {
//			system.out.println("ID�� �½��ϴ�");
//			if (pw == 5678) {
//				System.out.println("���̹��� ���� ���� ȯ���մϴ�.");
//			}else {
//				System.out.println("password�� �߸��Է��ϼ̽��ϴ�!");
//			}
//		}else {
//				System.out.println("id�� �߸��Է��ϼ̽��ϴ�!");
//			}
		
		if (login(123)) {
			System.out.println("ok");
		}else if(login(1234)) {
			System.out.println("yes no");
		}else {
			System.out.println("else no");
		}
	}

	
	
	static boolean login(int p) {
		if(p == 1234) {
			return true;
		}else {
			return false;
		}
		
}
		
	
	
	


		//Ŀ���� �Լ�
	static boolean trues() {
		System.out.println("���� trues�Դϴ�.");
		return true;
	}
	
	static boolean trues2() {
		System.out.println("���� trues2�Դϴ�.");
		return true;
	}
	
	static boolean falses() {
		System.out.println("���� false�Դϴ�..");
		return false;
	}
	
	static boolean falses2() {
		System.out.println("���� false2�Դϴ�..");
		return false;
	}
	static int l_f() {
		System.out.println("l_f�Դϴ�.");
		return 100-50; // Ÿ�԰� return�� ������� �׻� ��ġ �ؾ� �Ѵ�.
		
	}
	static int r_f() {
		System.out.println("r_f�Դϴ�.");
		return 200-150;

	}
}