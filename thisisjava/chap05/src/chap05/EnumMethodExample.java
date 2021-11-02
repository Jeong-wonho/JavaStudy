package chap05;

public class EnumMethodExample {

	public static void main(String[] args) {
		// 열거 객체는 열거 상수의 문자열을 내부 데이터로 가지고 이ㅅ다. 
		// 열거 객체에서 사용할 수 있는 이유는 모든 열거 타입은 컴파일 시에 enum클래스를 
		// 상속하게 되어있기 때문이다.
		
		// 열거 객체가 가지고 있는 문자열을 리턴한다.
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println("name: " + name);
		
		//ordinal() 메소드
		//전체 열거 객체중에 몇번째 객체인지 알려주는 메서드
		int ordinal = today.ordinal();
		System.out.println("ordinal: " + ordinal);
		
		//compareTo() 메소드
		//매개값으로 주어진 열거 객체를 기준으로
		//전후로 몇번째 위치하는 지를 비교한다.
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println("result1: " + result1);
		System.out.println("result2: " +result2);
		
		//valueOf()메서드
		//매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴한다.
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			System.out.println("Weekday: " + weekDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요");
			} else {
				System.out.println("평일 이군요");
			}
			
			//values()메서드
			//모든 열거 객체들을 배열로 만들어 리턴한다.
			Week[] days = Week.values();
			for(Week day : days) {
				System.out.println(day);
			}
		}
	}

}
