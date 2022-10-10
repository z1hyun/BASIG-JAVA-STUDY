package doIt자바연습문제;

public class 연습문제1 {

	/*
	 * operator 값이 +,-,*,/인 경우에 사칙 연산을 수행하는 프로그램을 if-else if문과
	 * switch-case문을 사용해 작성해보세요.
	 */
	
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		char operator = '3';
		
//		if(operator == '+') {
//			System.out.println(num1+num2);
//		}else if(operator == '-') {
//			System.out.println(num1-num2);
//		}else if(operator == '*') {
//			System.out.println(num1*num2);
//		}else if(operator == '/') {
//			System.out.println(num1/num2);
//		}else {
//			System.out.println("operator가 잘못되었습니다.");
//		}
		
		
		switch(operator) {
		case '+' : System.out.println(num1+num2);
			break;
		case '-' : System.out.println(num1-num2);
			break;
		case '*' : System.out.println(num1*num2);
			break;
		case '/' : System.out.println(num1/num2);
			break;
		default  : System.out.println("operator가 잘못되었습니다.");
			break;
		}
	}
}
