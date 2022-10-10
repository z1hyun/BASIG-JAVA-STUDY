package Class정의;

public class OrderPrint {

	/*
	 * 문제  : 쇼핑몰에 주문이 들어왔다.
	 * 주문번호 : 201803120001
	 * 주문아이디 : abc123
	 * 주문날짜 : 2018년 3월 12일
	 * 주문자이름 : 홍길순
	 * 주문상품번호 : PD0345-12
	 * 배송주소 : 서울시 영등포구 여의도동 20번지
	 * 
	 * 위 주문에 대한 클래스를 만들고 주문내용을 인스턴스로 생성한 후에 위와같은 형식으로 주문내용을 출력해보자
	 */
	
	public static void main(String[] args) {
		
		Order OrderInfo = new Order(); // Order 클래스를 참조하는 참조변수 , 인스턴스 생성
		
		OrderInfo.orderNo = "201803120001";
		OrderInfo.orderId = "abc123";
		OrderInfo.orderDate = "2018년 3월 12일";
		OrderInfo.orderName = "홍길순";
		OrderInfo.productNo = "PD0345-12";
		OrderInfo.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println(OrderInfo.getOrderNo());
		System.out.println(OrderInfo.getOrderId());
		System.out.println(OrderInfo.getOrderDate());
		System.out.println(OrderInfo.getOrderName());
		System.out.println(OrderInfo.getProductNo());
		System.out.println(OrderInfo.getAddress());
		
	}
}
