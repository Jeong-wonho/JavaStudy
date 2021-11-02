package chap08;

public interface ChildInterface3 extends ParentInterface {
	@Override
	public void method2(); // 추상 메서드로 재선언, static 생략
	public void method3();
}
