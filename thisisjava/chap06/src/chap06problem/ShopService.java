package chap06problem;

public class ShopService {
	private static ShopService shop = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return shop;
	}
}
