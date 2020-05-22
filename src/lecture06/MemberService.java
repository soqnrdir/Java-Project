package lecture06;

public class MemberService {
	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) { //문자열 비교할때는 무조건 equals를 써야함.
		return true;
		}else {
				
		}
	
		return false; //아니면 false
	
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다."); //id만 개개값으로 제공.
		
	}
}
