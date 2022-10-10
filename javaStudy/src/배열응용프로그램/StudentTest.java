package 배열응용프로그램;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student(1001, "최지현");
		student1.addSubject("국어", 100);
		student1.addSubject("수학", 50);
		
		Student student2 = new Student(1002, "구정모");
		student2.addSubject("영어", 30);
		student2.addSubject("한국사", 80);
		student2.addSubject("국어", 70);
	
	
	
		student1.showStudentInfo();
		System.out.println("======================");
		student2.showStudentInfo();
	}
}
