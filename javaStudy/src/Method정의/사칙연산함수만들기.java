package Method정의;

public class 사칙연산함수만들기 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		
		int sum = plus(num1,num2);
		System.out.println("덧셈 : "+sum);
		int minus = minus(num1,num2);
		System.out.println("뺄셈 : "+minus);
		int multi = multi(num1,num2);
		System.out.println("곱셈 : "+multi);
		int dive = dive(num1,num2);
		System.out.println("나눗셈 : "+dive);
	}

	public static int plus(int num1, int num2) {
		int result = num1+num2;
		return result;
	}
	
	public static int minus(int num1, int num2) {
		int result = num1-num2;
		return result;
	}
	
	public static int multi(int num1, int num2) {
		int result = num1*num2;
		return result;
	}
	
	public static int dive(int num1, int num2) {
		int result = num1/num2;
		return result;
	}
}
