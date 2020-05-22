package lecture06;

public class ShopService {
	private static  ShopService instance = new ShopService(); //변수는 private을 앞에 붙인다고 생각한다.
	private ShopService() {
	}
	public static ShopService getInstance() { 
		return instance;
	}
}
