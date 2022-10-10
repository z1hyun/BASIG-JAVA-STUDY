package static변수;

public class CardOrder {

	public static void main(String[] args) {
		
		CardCompany jihyunCard = new CardCompany();
		jihyunCard.setName("최지현");
		System.out.println(jihyunCard.getName()+"의 카드 번호는"+jihyunCard.CardNum);
		

		CardCompany jungmoCard = new CardCompany();
		jungmoCard.setName("구정모");
		System.out.println(jungmoCard.getName()+"의 카드 번호는"+jungmoCard.CardNum);
	}
}
