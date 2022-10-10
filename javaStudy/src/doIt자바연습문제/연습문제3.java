package doIt자바연습문제;

public class 연습문제3 {
	
	/*
	 * 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어보세요.
	 */
	
	public static void main(String[] args) {
		int dan ;
		int val ; 
		
		for(dan=2; dan<=9; dan++) {
			for(val=1; val<=9; val++) {
				if(dan<val)
					break;
				System.out.println("dan : "+dan);
				System.out.println("val : "+val);
				System.out.println(dan+"X"+val+"="+dan*val);
			}
		}
	}
}
