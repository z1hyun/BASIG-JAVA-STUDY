package 싱글톤패턴;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		/*
		 * 클래스 이름으로 getInstance()호출하여 참조변수에 대입한다.
		 */
		
		System.out.println(myCompany1 == myCompany2);
		//두 변수가 같은 주소인지 확인한다.
		
	}
}
