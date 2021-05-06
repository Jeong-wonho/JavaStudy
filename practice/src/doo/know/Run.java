package doo.know;

import java.util.Scanner;

public class Run {
	/*
	 * 1.최대 10명의 학생 정보를 기록할 수 있게 배열을 할당 2.학생 정보가 한명씩 추가 될 때마다 카운트함 => while()문 사용함
	 * 계속 추가할 것인지 물어보고, 대소문자 관계없이 y이면 계속 객체 추가, 키보드로 값 입력 받아 기록함 3. 키보드로 3명의 학생 정보를
	 * 출력받아, 각 객체에 저장함 4. 현재 입력된 학생들의 평균을 구하여 출력함 5.현재 기록된 학생들의 모든 정보를 출력함 필드는 학년,
	 * 반, 이름, 국어점수, 영어점수, 수학점수
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Student []st = new Student[10];
		int count = 0;
		int []sum = new int[st.length];
		char answer = 'Y';
		while(answer == 'Y')
		{
			System.out.println("정보를 입력해주세요, 학년, 반, 이름, 국어, 영어, 수학점수");
			st[count] = new Student(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			sum[count] = st[count].getKor_score() + st[count].getEng_score() + st[count].getMath_score();
			count++;
			System.out.println("정보를 더 입력하시겠어요? yes or not");
			answer = sc.next().toUpperCase().charAt(0);
		}
		
		for (int i = 0; i < count; i++) {
			System.out.println((i+1)+"번째 학생의 평균은"+sum[i]/3);
		}
		for (int i = 0; i < count; i++) {
			System.out.println((i+1)+"번째 학생의 정보는" + st[i].toString());
		}
		
	}

}
