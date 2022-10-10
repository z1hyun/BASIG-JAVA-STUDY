package static변수;

public class StudentTest1 {
	
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("최지현");
		
		System.out.println(studentLee.serialNum); //serialNum변수의 초깃값 출력
		studentLee.serialNum++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("구정모");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.serialNum);
	}
}
