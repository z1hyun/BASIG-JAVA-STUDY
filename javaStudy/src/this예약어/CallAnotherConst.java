package this예약어;


  class Person{
	String name;
	int age;


  Person(){
	  this("이름없음",1); // this를 사용해 바로 밑에있는 Person(String , int)생성자 호출
  }

  Person(String name, int age){
	  this.name = name;
	  this.age = age;
   }
 }
  
  public class CallAnotherConst {
	  public static void main(String[] args) {
		Person noName = new Person();
		
		System.out.println(noName.name);
		System.out.println(noName.age);
	}
}
