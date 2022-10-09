package switch문법;

public class swichCase {

	public static void main(String[] args) {

		int rank = 1;
		char medalColor;
		
		switch(rank) {
			
			case 1 :medalColor = 'G';
				 	break;
			case 2 :medalColor = 'S';
					break;
			case 3 :medalColor = 'B';
					break;
			default : medalColor = 'A';
		}
		System.out.println(rank+"등 의 메달 색깔 : "+medalColor+" 입니다.");
		/*
		 * case 문의 break문을 작성하지 않으면 다음케이스문을 거치기 때문에 덮어쓰기가 된다
		 * 그렇기때문에 조건에맞는 수행문을 수행했으면 꼭 swich-case문을 빠져나갈 수 있도록 break;문을 걸어야한다.
		 */	
		
		
	}
}
