package Homework_3;

public class InstructorManager extends UserManager {
	
	public void attachCourse(Instructor instructor) {
	for (int i=0;i<instructor.getCourses().length;i++) {
		System.out.println(instructor.courses[i]);
		
	}
	System.out.println("Kurslar listelendi");
	}
	
	

}
