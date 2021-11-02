package chap05;

public class EnumMethodExample {

	public static void main(String[] args) {
		// ���� ��ü�� ���� ����� ���ڿ��� ���� �����ͷ� ������ �̤���. 
		// ���� ��ü���� ����� �� �ִ� ������ ��� ���� Ÿ���� ������ �ÿ� enumŬ������ 
		// ����ϰ� �Ǿ��ֱ� �����̴�.
		
		// ���� ��ü�� ������ �ִ� ���ڿ��� �����Ѵ�.
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println("name: " + name);
		
		//ordinal() �޼ҵ�
		//��ü ���� ��ü�߿� ���° ��ü���� �˷��ִ� �޼���
		int ordinal = today.ordinal();
		System.out.println("ordinal: " + ordinal);
		
		//compareTo() �޼ҵ�
		//�Ű������� �־��� ���� ��ü�� ��������
		//���ķ� ���° ��ġ�ϴ� ���� ���Ѵ�.
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println("result1: " + result1);
		System.out.println("result2: " +result2);
		
		//valueOf()�޼���
		//�Ű������� �־����� ���ڿ��� ������ ���ڿ��� ������ ���� ��ü�� �����Ѵ�.
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			System.out.println("Weekday: " + weekDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("�ָ� �̱���");
			} else {
				System.out.println("���� �̱���");
			}
			
			//values()�޼���
			//��� ���� ��ü���� �迭�� ����� �����Ѵ�.
			Week[] days = Week.values();
			for(Week day : days) {
				System.out.println(day);
			}
		}
	}

}
