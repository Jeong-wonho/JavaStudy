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
			if (file.isFile() && file.canWrite()) { // 경로가 file인지 &파일이 수정가능한지
				System.out.println("회원가입을 위한 ID 와 비밀번호를 입력하세요");
				System.out.println("ID 입력:");
				filewriter.append(scan.nextLine());
				filewriter.append("\t");
				System.out.println("비밀번호 입력:");
				filewriter.append(scan.nextLine());
				filewriter.append("\r");
				System.out.println("회원가입이 완료되었습니다.");
			}
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
