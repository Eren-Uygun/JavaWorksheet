package Homework_3;


public class StudentManager extends UserManager {
	
	public void attachCourse(Student student) {
	for (int i=0;i<student.getCourses().length;i++) {
		System.out.println(student.courses[i]);
		
	}
	
	System.out.println("Kaydınız yapıldı.");
		
	}

}
