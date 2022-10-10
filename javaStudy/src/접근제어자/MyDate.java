package 접근제어자;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public boolean isValid(int day, int month , int year) {

		if(month == 2) {
			if(day<1||day>28) {
				System.out.println("유효하지않은 날짜입니다.");
			}else {
				this.day = day;
				return true;
			}
		}
		
		return false;
		
	}
	
	
}
