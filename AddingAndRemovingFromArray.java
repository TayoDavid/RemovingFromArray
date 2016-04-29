import java.util.ArrayList;

public class AddingAndRemovingFromArray {

	public static void main(String[] args) {
		Course course1 = new Course("Data Structure");
		Course course2 = new Course("Database Systems");

		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");

		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");

		System.out.println("Number of students taking " + course1.getCourseName() + " is " + course1.getNumberOfStudents());
		ArrayList<String> student1 = course1.getStudents();
		System.out.println(student1);
		System.out.println();
		System.out.println("Number of students taking " + course2.getCourseName() + " is " + course2.getNumberOfStudents());
		ArrayList<String> student2 = course2.getStudents();
		System.out.println(student2);
		course1.dropStudent("Kim Smith");
		System.out.println();
		System.out.println("Number of students taking " + course1.getCourseName() + " after dropping Kim is " + course1. getNumberOfStudents());
		System.out.println(student1);
	}

}
