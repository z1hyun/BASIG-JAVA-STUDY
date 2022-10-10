package static변수;

public class CardCompany {

	public static int serialnum = 10;
	int CardNum ;
	String name;
	
	
	public CardCompany() {
		serialnum ++;
		CardNum = serialnum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
