package oh.why;

public class a {
	int count;
	b b;
	public a() {
		System.out.println("a클래스입니다.");
	}
	
	public a(int count) {
		
		b b = new b(count);
		this.count = count;
		b.number = this.count;
		System.out.println("acount클래스입니다.");
	}
}
