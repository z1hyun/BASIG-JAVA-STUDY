package static변수;

public class StudentTest2 {

	public static void main(String[] args) {
		
		Student1 student1 = new Student1();
		student1.setStudentName("최지현");
		System.out.println(student1.seriaNum);
		System.out.println("학번 : "+student1.studentId);;
		
		
		Student1 student2 = new Student1();
		student2.setStudentName("구정모");
		System.out.println(student2.seriaNum);
		System.out.println("학번 : "+student2.studentId);
	}
}
