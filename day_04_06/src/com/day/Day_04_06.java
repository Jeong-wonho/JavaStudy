package com.day;

public class Day_04_06 {

	
	
	public static void main(String[] args) {//콜백함수
		// 산술연산자(+, -, *, /, %)
/*
		int c = 0; //초기식
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
		// 비교연산자 (==, <=, >=, <, >, !=(not연산자))
		System.out.println(100 == 200);
		c *= 10;
		System.out.println(c);
		System.out.println(c % 2 == 1);
		System.out.println(c % 2 == 0);
		
		System.out.println(300 <= 300); // 부등호가 먼저다!
		System.out.println(300 < 300); // => 불린타입
		
		boolean is_b = 300 <= 300 - 1; // 우선순위: 산술연산자 > 비교연산자 > 대입연산자
		System.out.println("(!)연산자가 없는 값은:" + is_b);
		System.out.println("(!)연산자가 있는 값은:" + !is_b);
		
		int l = 100 - 50;
		int r = 200 - 150;
		System.out.println(l != r);
		System.out.println(l_f() != r_f());	
		// 대입연산자 (=)
		
		//대입연산자: 우항을 좌항에 넣어준다.
*/
//		System.out.println(true && false);
		
		
//		System.out.println(trues() && falses()); // 아이디를 비교할 때 &&연산을 활용한다.
//		System.out.println(falses() || trues()); // 메일이나 핸드폰번호를 입력하세요
		// && 두개가 동일해야 작업이 진행된다. || 둘중하나만 충족해도되서 왼쪽만 충족되도 연산을 마친다.
		
//		System.out.println(trues() && falses() || trues2());
//		System.out.println("============================");
//		System.out.println(falses() || trues() && trues2()); //||연산자만 있을경우 앞에가 True이면 뒤에를 무시한다.!
		
//		byte c = 127;
//		System.out.println(c++); // 개행처리 되는 순간 1
//		System.out.println(c);
//		System.out.println(c--); // 개행처리 되는 순간 2
//		System.out.println(c);
		
//		int c = 0;
//		int c2 = c++; //대입연산자 실행이후에 1이 추가된다.
//		System.out.println("c2: "+c2+" 입니다.");
//		int c3 = ++c;
//		System.out.println("c2: "+c3+" 입니다.");
		
//		byte b = 127; //b(^n-1)-1
//		System.out.println(--b);
//		System.out.println(b);
		
//		if ((falses() || trues()) && trues2()) {
//			System.out.println("안녕");
//			System.out.println("또안녕");
//		}
//		System.out.println("-----------------");
//		System.out.println("그래도 안녕");
//		boolean is_b2 = trues();
//		if (is_b2) {
//			System.out.println("저는 if 문이에요");
//			System.out.println("안녕");
//			System.out.println("또안녕");
//		} else {
//			System.out.println("저는 else문이에요");
//			System.out.println("아니요");
//			System.out.println("또 아니요~ 정말 아니요~~");
//		}
		
//		int c = 75;
//		
//		if (c >= 90) 
//			System.out.println("90점대:"+c);
//		 else if (c >= 80) 
//			System.out.println("80점대:"+c);
//		 else if (c >= 70) 
//			System.out.println("70점대:"+c);
//		 else if (c >= 60) 
//			System.out.println("60점대:"+c);
//		 else
//			System.out.println(c);
		
//		int id = 1234;
//		int pw = 5678;
//		if (id == 124 || pw == 5678) {
//			System.out.println("카카오에 오신 것을 환영합니다.");
//			}
//		
//		if (id == login(1234)) {
//			system.out.println("ID가 맞습니다");
//			if (pw == 5678) {
//				System.out.println("네이버에 오신 것을 환영합니다.");
//			}else {
//				System.out.println("password를 잘못입력하셨습니다!");
//			}
//		}else {
//				System.out.println("id를 잘못입력하셨습니다!");
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
		
	
	
	


		//커스텀 함수
	static boolean trues() {
		System.out.println("저는 trues입니다.");
		return true;
	}
	
	static boolean trues2() {
		System.out.println("저는 trues2입니다.");
		return true;
	}
	
	static boolean falses() {
		System.out.println("저는 false입니다..");
		return false;
	}
	
	static boolean falses2() {
		System.out.println("저는 false2입니다..");
		return false;
	}
	static int l_f() {
		System.out.println("l_f입니다.");
		return 100-50; // 타입과 return의 결과값은 항상 일치 해야 한다.
		
	}
	static int r_f() {
		System.out.println("r_f입니다.");
		return 200-150;

	}
}