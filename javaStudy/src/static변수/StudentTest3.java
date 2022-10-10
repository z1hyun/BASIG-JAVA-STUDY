package static변수;

public class StudentTest3 {
	public static void main(String[] args) {
		
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(Student1.seriaNum); //seriaNum 변수를 직접 클래스 이름으로 참조
		System.out.println(studentLee.studentName+" 학번 : "+studentLee.studentId);
		
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(Student1.seriaNum); //seriaNum 변수를 직접 클래스 이름으로 참조
		System.out.println(studentSon.studentName+" 학번 :"+studentSon.studentId);
		
		/*
		 * static변수는 인스턴스가 생성되지않아도 사용할수 있다.
		 * 정적변수 , 스타틱변수 , 클래스변수 모두 같은거임
		 */
	}
}
