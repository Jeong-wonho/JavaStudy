package oh.why;

import java.util.Scanner;

public class class_practice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		student_2 student = new student_2();
		
		System.out.println("---회원가입----");
		System.out.println("학과입력:");
		String depart = sc.next();
		student.setName(depart);
		
		System.out.println("학번입력:");
		int id = sc.nextInt();
		student.setId(id);
		
		System.out.println("학생의 학과:" + student.depart + "학번:" + student.id);
	}

}

class student_2{
	String depart;
	int id;
	
	void setName(String depart) {
		this.depart = depart;
	}
	
	String getName() {
		return this.depart + "학과";
	}
	
	void setId(int id) {
		this.id = id;
		}
	
	int getId() {
		return this.id;
		}
	}
	
