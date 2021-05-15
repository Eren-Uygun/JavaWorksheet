package Homework_3;

public class Main {

	public static void main(String[] args) {
		
		
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		UserManager userManager = new UserManager();
		Student student1 = new Student();
		Student student2 = new Student();
		Instructor instructor1 = new Instructor();
		Instructor instructor2 = new Instructor();
		
		String[] courses = {"Delphi","C#","Java","Python","Php"} ;
		
		student1.setId(1);
		student1.setFirstName("David");
		student1.setLastName("Black");
		student1.setIdentityNumber("11100011100");
		student1.setEmail("DB@mail.com");
		student1.setPassword("12345");
		
		student2.setId(2);
		student2.setFirstName("Green");
		student2.setLastName("Copper");
		student2.setIdentityNumber("32132132111");
		student2.setEmail("GC@mail.com");
		student2.setPassword("24567");
		
		
		
		
		studentManager.addUser(student1);
		studentManager.addUser(student2);
		
		
		instructor1.setId(1);
		instructor1.setFirstName("Gordon");
		instructor1.setLastName("Freeman");
		instructor1.setIdentityNumber("22211122211");
		instructor1.setEmail("GF@mail.com");
		instructor1.setPassword("BlackMesa12345");
		instructor1.setCourses(courses);
		
		instructor2.setId(2);
		instructor2.setFirstName("Gordon");
		instructor2.setLastName("Ramsey");
		instructor2.setIdentityNumber("45454545454");
		instructor2.setEmail("GR@mail.com");
		instructor2.setPassword("ChiefArts12345");
		instructor2.setCourses(courses);
		
		instructorManager.addUser(instructor1);
		instructorManager.addUser(instructor2);

	
		
		
		
		
		
		
		

		

	}
}


