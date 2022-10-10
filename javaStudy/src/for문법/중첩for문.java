package for문법;

public class 중첩for문 {

	public static void main(String[] args) {
		
		int dan ;
		int times ;
		
		for(dan = 2; dan<=9; dan++) {
			/*
			 * dan = 2인데 9가 될때까지 2,3,4 ... 9까지 반복한다.
			 */
			for(times=1; times <= 9; times++) {
				System.out.println(dan+"X"+times+"="+dan*times);
			/*
			 * times가 1인데 9가 될때까지 1,2,3 ... 9까지 반복한다.
			 * 9가되면 빠져나와 
			 * 다시 외부 for문을 실행한다.
			 */
			
			}
		}
		System.out.println( ); // 한줄 띄어서 출력한다.
	}
}
