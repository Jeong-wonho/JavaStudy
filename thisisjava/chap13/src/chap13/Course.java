package chap13;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		// TODO Auto-generated constructor stub
		this.name = name;
		students = (T[])(new Object[capacity]);
		// 타입 파라미터로 배열을 생성하려면 new T[n] 형태로 배열을 생성할 수 없고, (T[])(new Object[n])으로 생성해야 한다.
			}
		
		public String getName() { return name; }
		public T[] getStudents() { return students;}
		public void add(T t) {
			for (int i = 0; i < students.length; i++) {
				if(students[i] == null) {
					students[i] = t;
					break;
			}
		}
	}
}
