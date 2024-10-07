package day06;
/* customerID : 고객 ID
 * customerName : 고객 이름
 * customerGrade : 고객등급(silver, gold, vip)
 * bonusPoint
 * bonusRatio : 0.01 == 1%
 * 
 * 기본 customerGrade = Silver
 * 
 * 메서드
 * 1. 보너스 적립 계산 메서드
 *   => 구매 금액을 주고 적립 보너스를 계산하여 bonusPoint 누적
 *   => 보너스 적립, 할인여부 체크하여 구매금액을 리턴.
 *   
 * 2. 출력 메서드
 *   => 홍길동님은 VIP 등급이며, 보너스 포인트는 5000점 입니다.
 *      전담 상담사 번호는 1111 입니다. <- vip만 추가(agentID)
 */

import java.util.Arrays;

public class Customer {
	protected String customerID, name, customerGrade;
	protected int bonusPoint;
	protected double discount, bonusRatio;
	
//	protected Customer[] cuList = new Customer[5];
	protected int cnt = 0;
//	
	public Customer() {
//		customerGrade = "Silver";
//		discount = 0;
//		bonusRatio = 0.01;
	}
	public Customer(String customerID, String name) {
		this.customerID = customerID;
		this.name = name;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	public void saleCalc(int sale) {
		int getBonus = (int)(sale * bonusRatio);
		int finalPrice = sale - (int)(sale*discount);
		bonusPoint += getBonus;
		System.out.println("선택한 물품 금액은 "+sale+"이며 최종 구매가격은 "+ finalPrice + "입니다." );
		System.out.println("적립된 포인트는 " + getBonus + "이며 총 보유 포인트는 " + bonusPoint +"입니다.");
	}
	
	public void customerInfo() {
		System.out.println(name + "님은 " + customerGrade + "등급이며, 보유 보너스 포인트는 " + bonusPoint + "점 입니다.");
	}
	
//	@Override
//	public String toString() {
//		return "Customer [customerID=" + customerID + ", name=" + name + ", customerGrade=" + customerGrade
//				+ ", bonusPoint=" + bonusPoint + ", discount=" + discount + ", bonusRatio=" + bonusRatio + ", cuList="
//				+ Arrays.toString(cuList) + ", cnt=" + cnt + "]";
//	}
	
	public void setCustomer(String customerID, String name) {
		this.customerID = customerID;
		this.name = name;
//		this.customerGrade = customerGrade;
//		this.bonusPoint = bonusPoint;
//		this.bonusRatio = bonusRatio;
		
//		Customer info = new Customer();
//		info.setCustomer(customerID, name, bonusPoint, bonusRatio);
//		cuList[cnt] = info;
	}
	
	// getter / setter
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
}

class GoldCustomer extends Customer {
	public GoldCustomer() {
//		super(customerID, name);
//		customerGrade = "Gold";
//		discount = 0.1;
//		bonusRatio = 0.02;
	}
	public GoldCustomer(String customerID, String name) {
		super(customerID, name);
		customerGrade = "Gold";
		discount = 0.1;
		bonusRatio = 0.02;
	}
	public void customerInfo() {
		super.customerInfo();
	}
}

class VIPCustomer extends Customer {
	private String agentID;
	
	public VIPCustomer() {
//		customerGrade = "VIP";
//		discount = 0.1;
//		bonusRatio = 0.05;
	}
	
	public VIPCustomer(String customerID, String name, String agentID) {
		super(customerID, name);
		this.agentID = agentID;
		customerGrade = "VIP";
		discount = 0.1;
		bonusRatio = 0.05;
	}
	public void customerInfo() {
		super.customerInfo();
		System.out.println("담당 상담사 번호는 " + agentID +"입니다.");
	}
	// getter / setter
	public String getAgentID() {
		return agentID;
	}
	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
	
}