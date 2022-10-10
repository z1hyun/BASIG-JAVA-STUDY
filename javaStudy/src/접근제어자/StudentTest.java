package 접근제어자;

public class StudentTest {
	
	public static void main(String[] args) {
		Student studentLee = new Student();
	//	studentLee.studentName = "이상원"; <- 오류발생 . 원인 : 접근제어자가private으로 바뀌면서 외부클래스의 접근이 허용X
		
		studentLee.setStudentName("이상원");//setter를 이용해 접근가능
		System.out.println(studentLee.getStudentName());
		
		//그냥접근을 하려면 public으로 사용해야하지만 private에 접근을 하기위해선 get,set을 사용하면 된다.
		
		/*
		 * 정보은닉 : 클래스 내부에서 사용할 변수나 메소드를 private으로 선언해서 외부에서 접근하지 못하도록 하는 것
		 */
	}
}
