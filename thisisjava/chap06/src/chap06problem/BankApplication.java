package chap06problem;

import java.util.Iterator;
import java.util.Scanner;

public class BankApplication {
	private static Bank[] bankArray = new Bank[100];
	private static Scanner scanner = new Scanner(System.in);
	
		public static void main(String[] args) {
			boolean run = true;
			while(run) {
				System.out.println("--------------------------------------------");
				System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5.종료");
				System.out.println("--------------------------------------------");
				System.out.println("선택> ");
				
				int selectNo = scanner.nextInt();
				
				if (selectNo == 1) {
					createAccount();
				}else if(selectNo == 2) {
					accountList();
				}else if(selectNo == 3) {
					deposit();
				}else if(selectNo == 4) {
					withdraw();
				}else if(selectNo == 5) {
					run =  false;
				}
			}
			System.out.println("프로그램 종료");
		}
		
		//계좌생성하기
		private static void createAccount() {
			System.out.println("-------------");
			System.out.println("계좌생성");
			System.out.println("-------------");
			
			System.out.print("계좌번호: ");
			String ano = scanner.next();
			
			System.out.print("계좌주: ");
			String owner = scanner.next();
			
			System.out.print("초기 가입 금액: ");
			int balance = scanner.nextInt();
			
			Bank bank = new Bank(ano, owner, balance);
			
			for (int i = 0; i < bankArray.length; i++) {
				if(bankArray[i] == null) {
					bankArray[i] = bank;
					System.out.println("결과: 계좌가 생성되었습니다.");
					break;
				}
			}
		}
		
		//계좌목록보기
		private static void accountList() {
			System.out.println("-------------");
			System.out.println("계좌목록");
			System.out.println("-------------");
			
			for(Bank b : bankArray) {
				if(b == null)break;
				System.out.println(b.getAno() + "\t"+ b.getOwner() + "\t" + b.getBalance() );
			}
			
		}
		
		//예금하기
		private static void deposit() {
			System.out.println("-------------");
			System.out.println("예금");
			System.out.println("-------------");
			
			System.out.println("계좌번호:");
			String ano = scanner.next();
			
			System.out.println("예금액:");
			int balance  = scanner.nextInt();
			Bank bank = findBank(ano);
			
			if(bank == null) {
				System.out.println("결과 : 계좌가 존재하지 않습니다.");
				return;
			}
			
			bank.setBalance(bank.getBalance() + balance);
			System.out.println("결과: 예금이 성공되었습니다.");
			
		}
		
		//출금하기
		private static void withdraw() {
			System.out.println("-------------");
			System.out.println("출금");
			System.out.println("-------------");
			
			System.out.println("계좌번호:");
			String ano = scanner.next();
			
			System.out.println("출금액:");
			int balance  = scanner.nextInt();
			Bank bank = findBank(ano);
			
			if(bank == null) {
				System.out.println("결과 : 계좌가 존재하지 않습니다.");
				return;
			}
			
			if(bank.getBalance() < balance) {
				System.out.println("잔액부족");
				return;
			}
			
			bank.setBalance(bank.getBalance() - balance);
			System.out.println("결과: 출금이 성공되었습니다. 남은 잔액은"+ bank.getBalance());
		}
		
		//Account 배열에서 ano와 동일한 Account객체 찾기
		private static Bank findBank(String ano) {
			Bank bank = null;
			for (int i = 0; i < bankArray.length; i++) {
				if(bankArray[i] != null) {
					if(bankArray[i].getAno().equals(ano)) {
						bank = bankArray[i];
						break;
					}
				}
			}
			return bank;
			
		}
}
