package 배열;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		double[] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			
			//전체 길이만큼 배열이 반복되는데 3,4번째 인덱스에는 값이 없기때문에 0.0이 출력된다.
		}
		
		double[] data2 = new double[5];
		int size = 0;
		
		data2[0] = 10.0; size++; //값을 저장한 후 size 변수 값 증가
		data2[1] = 20.0; size++;
		data2[2] = 30.0; size++;
		
		for(int i = 0; i<size; i++) {
			System.out.println(data[i]);
		}
		
	}
}
