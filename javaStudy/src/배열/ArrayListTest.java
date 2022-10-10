package 배열;

import java.util.ArrayList;

public class ArrayListTest {

	/*
	 * 기존 배열의 단점
	 * 배열은 중간에 있는 요소를 비워둘수 없어서 중간값을 없애게된다면 배열 요소 위치를 변경해야한다.
	 */
	
	/*
	 * ArrayList(배열리스트) 선언하는법
	 * ArrayList<E> 배열 이름 = new ArrayList<E>();
	 */
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>(); //ArrayList선언
	
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가?", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생택쥐페리"));
		
		for(int i=0; i<library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("==========향상된 for문 사용==========");
		for(Book b : library) {
			b.showBookInfo();
		}
		
		
	}
}
