package oh.why;

public class a {
	int count;
	b b;
	public a() {
		System.out.println("aŬ�����Դϴ�.");
	}
	
	public a(int count) {
		
		b b = new b(count);
		this.count = count;
		b.number = this.count;
		System.out.println("acountŬ�����Դϴ�.");
	}
}
