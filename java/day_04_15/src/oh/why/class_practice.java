package oh.why;

import java.util.Scanner;

public class class_practice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		student_2 student = new student_2();
		
		System.out.println("---ȸ������----");
		System.out.println("�а��Է�:");
		String depart = sc.next();
		student.setName(depart);
		
		System.out.println("�й��Է�:");
		int id = sc.nextInt();
		student.setId(id);
		
		System.out.println("�л��� �а�:" + student.depart + "�й�:" + student.id);
	}

}

class student_2{
	String depart;
	int id;
	
	void setName(String depart) {
		this.depart = depart;
	}
	
	String getName() {
		return this.depart + "�а�";
	}
	
	void setId(int id) {
		this.id = id;
		}
	
	int getId() {
		return this.id;
		}
	}
	
