package day_04_27;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemberJoin {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\JAVA_JWH\\Work\\day_04_27\\Text\\MemberDB.txt");
		try {
			FileWriter filewriter = new FileWriter(file, true);
			if (file.isFile() && file.canWrite()) { // ��ΰ� file���� &������ ������������
				System.out.println("ȸ�������� ���� ID �� ��й�ȣ�� �Է��ϼ���");
				System.out.println("ID �Է�:");
				filewriter.append(scan.nextLine());
				filewriter.append("\t");
				System.out.println("��й�ȣ �Է�:");
				filewriter.append(scan.nextLine());
				filewriter.append("\r");
				System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
			}
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
