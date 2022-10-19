package 배열응용프로그램;

public class 아스키코드배열 {

	public static void main(String[] args) {
		
		char[] alphabets = new char[26] ;
		char asc = 'A';
	
		for(int i=0; i<alphabets.length; i++) {
			
			alphabets[i] = asc.ToUpperCase();
			asc++;
			System.out.println(alphabets[i]);
		}
		for(int i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i]+","+(int)alphabets[i]);
		}
	}
}
