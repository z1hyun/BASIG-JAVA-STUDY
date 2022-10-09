package switch문법;

public class swichCase2 {

	
	/*
	 * 1~12월까지의 달력중 달력의 제일 끝 날짜를 구하는 swich-case문을 작성하려고 한다.
	 * 하지만 case문을 12개 적기에는 1,3,5,7 .... 등 31일로 끝나는 날짜가 겹친다.
	 * 이거를 조금 간략하게 적어봐야한다.
	 */
	
	public static void main(String[] args) {
		
		int month = 2;
		int day = 0 ;
		
		switch(month){
		case 1 : case 3 : case 5: case 7 : case 8 : case 10: case 12: day = 31;
				break;
		case 4 : case 6 : case 9: case 11: day = 30;
				break;
		case 2 : day  = 28;
				break;
		}
		System.out.println(month+"의 마지막 날은"+day+"입니다.");
		
		/*
		 * 케이스문을 동시에 사용하여 코드를 간략하게 줄일 수 있다. , 나 따로 구분하는건 없는듯
		 */
	}
}
