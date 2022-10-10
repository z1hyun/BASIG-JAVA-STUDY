package this예약어;

class ThisExmaple {
	
	int day;
	int month;
	int year;

	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}



public class ThisExmaple{
	public static void main(String[] args) {
		ThisExmaple bDay = new ThisExmaple();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
	}
}