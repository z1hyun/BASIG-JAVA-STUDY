package 배열;

public class CharArray {

	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;//아스키 값으로 각 요소에 저장
		}
		
		for(int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i]+" , "+(int)alphabets[i]);
		}//아스키코드문자와 숫자로변환한 값을 동시에 출력
		
		char test = 'B';
		System.out.println((int)test);
		//아스키코드값을 int형으로 변환하기
	}
}
