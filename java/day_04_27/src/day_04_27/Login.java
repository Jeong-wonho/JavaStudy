package day_04_27;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pass = 0;
		System.out.println("Login�� ���� ID�� pw�� �Է��ϼ���");
		System.out.println("ID �Է�");
		String Id = scan.nextLine();
		System.out.println("��й�ȣ �Է�");
		String pw = scan.nextLine();
		
		File file = new File("D:\\JAVA_JWH\\Work\\day_04_27\\Text\\MemberDB.txt");
		try {
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			try {
				while ((line = bufReader.readLine()) != null) {
					System.out.println(line.indexOf(Id) + "\t" + line.indexOf(pw));
					int passId = line.indexOf(Id);
					int passPw = line.indexOf(pw);
					if (passId != -1 && passPw != -1) {
						System.out.println("�α��� ����");
						pass = 1;}
					if(pass == 0) {
						System.out.println("�α��� ����");}
						bufReader.close();
					}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
