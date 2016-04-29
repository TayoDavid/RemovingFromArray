import java.util.ArrayList;

public class Course {
	// Data fields
	private String courseName;
	private ArrayList<String> students = new ArrayList<String>();
	private int numberOfStudents = 0;

	// Default Constructor
	public Course(String courseName) {
		this.courseName = courseName;
	}
	// This method adds a student to the list
	public void addStudent(String student) {
		students.add(student);
		numberOfStudents++;
	}

	public ArrayList<String> getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		 for (String studnt: students) {
			 if (studnt.equals(student))
				 students.remove(student);
		 }
		 --numberOfStudents;
	}
}
