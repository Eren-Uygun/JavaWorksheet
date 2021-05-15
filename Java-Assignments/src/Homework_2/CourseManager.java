package Homework_2;

public class CourseManager {
	
	public void AddCourse(Course course,Category category) {
		System.out.println(category.name + " " + " Adlı kategoriye " + course.name + " "+" Adlı kurs eklendi.");
	}
	
	public void AddCategory(Category category)
	{
		System.out.println( category.name + " eklendi");
	}
	
	
	
	

}
