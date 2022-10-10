package Method정의;

public class 함수호출후값반환하기 {
	
	/*
	 * 두 정수를 더한 후 결과값을 돌려주는 함수를 만들고 사용해보자.
	 */
	
	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 50;
		
		int sum = add(num1,num2);
		System.out.println(num1+"+"+num2+"="+sum+"입니다.");
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
		
	/*
	 * 함수를 호출할때 사용하는 변수이름과 함수에서 사용하는 변수는 서로 다른 변수이므로
	 * 이름이 같아도 되고 달라도 상관없습니다.
	 */
		
	}
}
