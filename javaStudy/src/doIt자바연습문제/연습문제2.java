package doIt자바연습문제;

public class 연습문제2 {

	/*
	 * continue문을 사용해서 구구단 짝수단만 출력하도록 해보자.
	 */
	public static void main(String[] args) {
		
		int dan;
		int val;
		
		for(dan = 2; dan<=9; dan++) {
			for(val = 1; val<=9; val++) {
				
				if(dan % 2 == 0)//만약 dan을 나눴을때 0이면 짝수임. 
					continue; // 짝수일 경우 continue실행해서 이후 수행문 실행안하고 증감식 사용
				System.out.println(dan+"X"+val+"="+dan*val);
			}
		}
	}
}
