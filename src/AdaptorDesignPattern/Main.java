package AdaptorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		Student college_student = new CollegeStudent("ravi", "verma", "ravi.verma@gmail.com");
		students.add(college_student);
		SchoolStudent schoolStudent = new SchoolStudent("arjun", "singh", "arjun.singh@gmail.com");
		students.add(new SchoolStudentAdaptor(schoolStudent));
		
		for(Student student:students) {
			System.out.println(student.toString());
		}
		
	}
}
