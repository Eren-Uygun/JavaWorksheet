package Homework_2;

public class Main {

	public static void main(String[] args) {	
		Course course1 = new Course(1,"English Course", 5000,"Adam TestingGround");
		Course course2 = new Course(2,"Spanish Course",6000,"Emmanuel TeachingGround");
		Course course3 = new Course(3,"Russian Course",5500,"Vadim Rurikovich");
		
		Course course4 = new Course(4,"C-Sharp Course",5500,"Ahmed Ahmedov");
		Course course5 = new Course(5,"Java Course",5500,"Jose Indu");
		Course course6 = new Course(6,"Pyton Course",5500,"Alan Hunter");
		
		Category category1 = new Category(1,"Language Course");
		Category category2 = new Category(2, "Programming Course");
		Category category3 = new Category(3,"Art Course");
		Category category4 = new Category(4,"Cook Training");
		

		CourseManager courseManager = new CourseManager();
		
		courseManager.AddCategory(category2);
		courseManager.AddCategory(category1);
	 
		
		courseManager.AddCourse(course1, category1);
		courseManager.AddCourse(course6, category2);
		
		
		Course[] courses = {course1,course2,course3,course4,course5,course6
				
		};
		
		Category[] categories = {
				category1,category2,category3,category4
		};
 		
		System.out.print("\n");
		
		for (Course course : courses) {
			System.out.println(course.id+" "+course.name+ " " +course.instructor+" "+course.price+"$");
			
		}
		
		System.out.print("\n");
		
		for (Category category:categories) {
			System.out.println(category.id+" "+category.name);
			
		}
	
	

	}

}
