package 배열;

import java.util.ArrayList;

public class StudentArray {

	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		
		students[0] = new Student(1001,"최지현");
		students[1] = new Student(1002,"구정모");
		students[2] = new Student(1003,"송형준");
		
//		for(int i = 0; i<students.length; i++) {
//			students[i].showStudentInfo();
//		}
		
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(1001, "구정모"));
		studentList.add(new Student(1002, "최지현"));
		studentList.add(new Student(1003, "송형준"));
		
		for(int i = 0; i < studentList.size(); i++) {
			Student studentss = studentList.get(i);
			studentss.showStudentInfo();
		}
	}
}
