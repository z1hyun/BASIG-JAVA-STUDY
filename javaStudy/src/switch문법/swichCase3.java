package switch문법;

public class swichCase3 {
	
	/*
	 * swich-case 문에 문자열 사용하기.
	 * 자바 7부터는 swich-case문에 정수값 뿐 아닌 문자열도 사용할 수 있다.
	 * 이전에는 이게 안되서
	 * if(meadl.equals("Gold")) <- 이런식으로 equals 문을 사용했다함.
	 * 
	 */
	public static void main(String[] args) {
		
		String medal = "Gold";
		
		switch(medal) {
		
		case "Gold" : 
			System.out.println("금메달입니다.");
			break;
		
		case "Silver" :
			System.out.println("은메달입니다.");
			break;
		
		case "Bronze" :
			System.out.println("동메달입니다.");
			break;
		
		default:
			System.out.println("메달이 없습니다.");
			break;
			
		}
	}
}
