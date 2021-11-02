package chap09;

public class Outter {
	String field = "Outter-field";

	void method() {
		System.out.println("Outter-method");
	}

	class Nested {
		String field = "Nested-field";

		void method() {
			System.out.println("Nested-method");
		}

		void print() {
			System.out.println("이것은 중첩:" + this.field);
			this.method();
			System.out.println("이것은 바깥" + Outter.this.field);
			Outter.this.method();
		}
	}
}
