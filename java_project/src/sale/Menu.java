package sale;

import java.util.Set;

public class Menu {
	protected String proID, name;
	protected int price;
//	List<String, String, Integer> menuInfo = new Set<>();
	
	public Menu() {}
	
	public Menu(String proID, String name, int price) {
		this.proID = proID;
		this.name = name;
		this.price = price;
	}
	
//	public void insertMenu(String proID, String name, int price) {
//		this.proID = proID;
//		this.name = name;
//		this.price = price;
//	}
	
	public void setMenu() {
		
	}

	@Override
	public String toString() {
		return "제품번호 : " + proID + ", 이름 : " + name + ", 가격 : " + price;
	}

	public String getProID() {
		return proID;
	}

	public void setProID(String proID) {
		this.proID = proID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
