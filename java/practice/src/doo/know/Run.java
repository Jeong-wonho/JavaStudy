package doo.know;

import java.util.Scanner;

public class Run {
	/*
	 * 1.�ִ� 10���� �л� ������ ����� �� �ְ� �迭�� �Ҵ� 2.�л� ������ �Ѹ� �߰� �� ������ ī��Ʈ�� => while()�� �����
	 * ��� �߰��� ������ �����, ��ҹ��� ������� y�̸� ��� ��ü �߰�, Ű����� �� �Է� �޾� ����� 3. Ű����� 3���� �л� ������
	 * ��¹޾�, �� ��ü�� ������ 4. ���� �Էµ� �л����� ����� ���Ͽ� ����� 5.���� ��ϵ� �л����� ��� ������ ����� �ʵ�� �г�,
	 * ��, �̸�, ��������, ��������, ��������
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Student []st = new Student[10];
		int count = 0;
		int []sum = new int[st.length];
		char answer = 'Y';
		while(answer == 'Y')
		{
			System.out.println("������ �Է����ּ���, �г�, ��, �̸�, ����, ����, ��������");
			st[count] = new Student(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			sum[count] = st[count].getKor_score() + st[count].getEng_score() + st[count].getMath_score();
			count++;
			System.out.println("������ �� �Է��Ͻðھ��? yes or not");
			answer = sc.next().toUpperCase().charAt(0);
		}
		
		for (int i = 0; i < count; i++) {
			System.out.println((i+1)+"��° �л��� �����"+sum[i]/3);
		}
		for (int i = 0; i < count; i++) {
			System.out.println((i+1)+"��° �л��� ������" + st[i].toString());
		}
		
	}

}
