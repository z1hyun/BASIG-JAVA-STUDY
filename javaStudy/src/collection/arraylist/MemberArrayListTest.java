package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1002,"손민국");
		Member memberPark = new Member(1003,"박서훤");
		Member memberHong = new Member(1004,"홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberLee);
		
		memberArrayList.showAllMember(); //전체회원출력
		
		memberArrayList.removeMember(memberHong.getMemberId()); //홍길동회원삭제
		memberArrayList.showAllMember(); //홍길동회원을 삭제한 후 다시 전체회원 출력
		
		
		
	}
}
