package 싱글톤패턴;

public class Company {

	/*
	 * 생성자가 하나도 없는 클래스는 컴파일러가 자동으로 디폴트 생성자를 만들어주는데.
	 * 그경우 디폴트생성자는 항상 public이다.
	 * 
	 * 생성자가 public이면 외부클래스에서 인스턴스를 여러개 생성할 수 있습니다.
	 * 싱글톤 패턴에서는 생성자를 반드시 명시적으로 만들고 접근제어자를 private으로 지정해야한다.
	 * 그러면 생성자가 있으므로 컴파일러가 디폴트 생성자를 만들지않고,
	 * 접근 제어가ㅏ private이므로 외부 클래스에서 마음대로 company 인스턴스를 생성할 수 없게된다.
	 * 
	 * Company 클래스 내부에서만 이 클래스생성을 제어할 수 있다.
	 * 
	 */

	//2단계
	private static Company instance = new Company();
	/*2단계
	 * 외부 인스턴스를 생성할 수 없도록 만들었다. 
	 * 하지만 우리가 프로그램에서 사용할 인스턴스 하나는 필요하기때문에
	 * Company클래스 내부에서 하나를 생성해야한다. 그래야
	 * 그 인스턴스가 프로그램 전체에서 사용할 유일한 인스턴스가 된다.
	 * 그것도 private로 선언하여 외부에서 이 인스턴스에 접근하지 못하도록 제한해야한다.
	 */
	
	public static Company getInstance() {	//인스턴스를 외에서 참조할 수 있도록 public get()메소드 구현
		if(instance == null) {
			instance = new Company();
		}
		return instance; // 유일하게 생성된 인스턴스를 반환한다.
	}
	
	
	
	//1단계
	private Company() {
		
	}
	

	
	
}
