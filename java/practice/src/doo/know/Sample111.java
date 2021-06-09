package doo.know;

import java.util.Scanner;

public class Sample111 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		int money = (int)(Math.random() + 500) * 10; //10원~4950원
		int[] coin = {500, 100, 50, 10};

		System.out.println("거스름돈 : " + money + "원");
		for(int i = 0; i < coin.length; i++){
			System.out.println(coin[i] + "원 : " + money/coin[i] + "개");
		    	money = money % coin[i];
		}
		
	}
}
