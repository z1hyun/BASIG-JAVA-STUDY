package Class정의;

public class StudentTest1 {
	
	public static void main(String[] args) {
		
		Student student1 = new Student(); // 첫번째 학생 생성
		student1.studentName = "최지현"; // 첫번째 학생 이름넣기   /*멤버변수사용*/
		System.out.println(student1.getStudentName()); /*메소드 사용*/
	
		Student student2 = new Student(); // 두번째 학생 생성
		student2.studentName = "구정모"; // 두번째 학생 이름넣기
		System.out.println(student2.getStudentName());
		
		/*
		 * 같은 생성자를 두번 사용해서 서로 다른 변수 이름의 클래스를 두개 생성함
		 * (서로 다른 인스턴스가 생성됨)
		 */
		
		
	}
}
