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
				System.out.println("1.���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5.����");
				System.out.println("--------------------------------------------");
				System.out.println("����> ");
				
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
			System.out.println("���α׷� ����");
		}
		
		//���»����ϱ�
		private static void createAccount() {
			System.out.println("-------------");
			System.out.println("���»���");
			System.out.println("-------------");
			
			System.out.print("���¹�ȣ: ");
			String ano = scanner.next();
			
			System.out.print("������: ");
			String owner = scanner.next();
			
			System.out.print("�ʱ� ���� �ݾ�: ");
			int balance = scanner.nextInt();
			
			Bank bank = new Bank(ano, owner, balance);
			
			for (int i = 0; i < bankArray.length; i++) {
				if(bankArray[i] == null) {
					bankArray[i] = bank;
					System.out.println("���: ���°� �����Ǿ����ϴ�.");
					break;
				}
			}
		}
		
		//���¸�Ϻ���
		private static void accountList() {
			System.out.println("-------------");
			System.out.println("���¸��");
			System.out.println("-------------");
			
			for(Bank b : bankArray) {
				if(b == null)break;
				System.out.println(b.getAno() + "\t"+ b.getOwner() + "\t" + b.getBalance() );
			}
			
		}
		
		//�����ϱ�
		private static void deposit() {
			System.out.println("-------------");
			System.out.println("����");
			System.out.println("-------------");
			
			System.out.println("���¹�ȣ:");
			String ano = scanner.next();
			
			System.out.println("���ݾ�:");
			int balance  = scanner.nextInt();
			Bank bank = findBank(ano);
			
			if(bank == null) {
				System.out.println("��� : ���°� �������� �ʽ��ϴ�.");
				return;
			}
			
			bank.setBalance(bank.getBalance() + balance);
			System.out.println("���: ������ �����Ǿ����ϴ�.");
			
		}
		
		//����ϱ�
		private static void withdraw() {
			System.out.println("-------------");
			System.out.println("���");
			System.out.println("-------------");
			
			System.out.println("���¹�ȣ:");
			String ano = scanner.next();
			
			System.out.println("��ݾ�:");
			int balance  = scanner.nextInt();
			Bank bank = findBank(ano);
			
			if(bank == null) {
				System.out.println("��� : ���°� �������� �ʽ��ϴ�.");
				return;
			}
			
			if(bank.getBalance() < balance) {
				System.out.println("�ܾ׺���");
				return;
			}
			
			bank.setBalance(bank.getBalance() - balance);
			System.out.println("���: ����� �����Ǿ����ϴ�. ���� �ܾ���"+ bank.getBalance());
		}
		
		//Account �迭���� ano�� ������ Account��ü ã��
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
