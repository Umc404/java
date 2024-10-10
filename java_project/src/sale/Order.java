package sale;

public class Order extends Menu{
	private int orderNum, productCnt, cost;
	
	public Order() {}
	
	public Order(String proID, String name, int price, int productCnt, int cost) {
		super(proID, name, price);
		this.productCnt = productCnt;
		this.cost = price * productCnt;
		// TODO Auto-generated constructor stub
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public int getProductCnt() {
		return productCnt;
	}

	public void setProductCnt(int productCnt) {
		this.productCnt = productCnt;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
