package 배열응용프로그램;

import java.util.ArrayList;

public class Student {

	int studentId;
	String studentName;
	ArrayList<Subject> subjectList; //ArrayList선언하기.
	
	
	public Student(int studentID, String studentName) {
		this.studentId = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); //Subject 생성하기
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			System.out.println("학생"+studentName+"의"+s.getName()+"과목성적은"
					+s.getScorePoint()+"입니다.");
		}
		System.out.println("학생 "+studentName+"의 총점은"+total+"입니다.");
	}
}
