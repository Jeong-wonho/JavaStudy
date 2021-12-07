package chap13;

import java.util.Arrays;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}
	
	public void registerCourseStudent(Course<? extends Student> course) {
		// TODO Auto-generated method stub
		System.out.println(course.getName() + " ������: " + Arrays.deepToString(course.getStudents()));

	}
	
	public static void registerCourseWorker( Course<? super Worker> course) {
		System.out.println(course.getName() + " ������ " + Arrays.toString(course.getStudents()));
	}
	

	
}
