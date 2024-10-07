package day06;

/* Silver 고객(할인 X) / Gold 고객(할인) / VIP 고객(할인)
 * - Silver 고객
 *   => 제품을 구매할 때 0% 할인 / 보너스 포인트 1% 적립
 * - Gold 고객
 *   => 제품을 구매할 때 10% 할인 / 보너스 포인트 2% 적립
 * - VIP 고객
 *   => 제품을 구매할 때 10% 할인 / 보너스 포인트 5% 적립
 *   => 전담 상담사
 *   
 *   Customer / GoldCustomer / VIPCustmer 클래스 생성
 *   GoldCustomer / VIPCustmer => Customer 클래스 상속
 */

public class CustomerMain {
	public static void main(String[] args) {
		
		Customer cuList[] = new Customer[10];
		
		Customer cu1 = new Customer("testid","testname");
		Customer cu2 = new Customer("cu4433","스티브");
		Customer cu3 = new GoldCustomer("cu1546","홍길동");
		Customer cu4 = new VIPCustomer("cua0113","유비빔", "BAEK");
		
		int cnt=0;
		cuList[cnt] = cu1;
		cnt++;
		cuList[cnt] = cu2;
		cnt++;
		cuList[cnt] = cu3;
		cnt++;
		cuList[cnt] = cu4;
		cnt++;
		cuList[cnt] = new GoldCustomer("cu6652","라이너스");
		cnt++;
		cuList[cnt] = new VIPCustomer("cua7651","니나브","LOA");
		cnt++;
		cuList[cnt] = new VIPCustomer("cua7452","qaws","1111");
		cnt++;
		cuList[cnt] = new VIPCustomer("cua1255","qwer","2222");
		cnt++;
		cuList[cnt] = new VIPCustomer("cua5768","asdf","3333");
		cnt++;
		cuList[cnt] = new VIPCustomer("cua4573","zxcv","1111");
		cnt++;
		
		
		System.out.println("---------- 할인율 포인트 계산 1 ----------");
		int price1 = 10000;
		
		for(int i=0; i<cnt; i++) {
//			cuList[i].customerInfo();
			System.out.println(cuList[i].getName() + " " + cuList[i].getCustomerGrade());
			cuList[i].saleCalc(price1);
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		}
		System.out.println("---------- 할인율 포인트 계산 2 ----------");
		int price2 = 35000;
		for(int i=0; i<cnt; i++) {
//			cuList[i].customerInfo();
			System.out.println(cuList[i].getName() + " " + cuList[i].getCustomerGrade());
			cuList[i].saleCalc(price2);
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		}
		System.out.println("################ 회원 정보 리스트 ################");
		for(int i=0; i<cnt; i++) {
			cuList[i].customerInfo();
			System.out.println();
		}

		// 다운캐스팅 : 부모의 공유되는 멤버변수나 메서드가 아닌
		// 자식 고유의 멤버변수나 메서드를 호출하고자 할 경우 사용
		// 다운 캐스팅시 반드시 명시적으로 형변환 해야함.
		
		// agentID = 1111 => 3333 변경
		
		for(int i=0; i<cnt; i++) {
			Customer c = cuList[i];
			if(c instanceof VIPCustomer) {
				VIPCustomer vip = (VIPCustomer)c;
				if(vip.getAgentID().equals("1111")) {
					vip.setAgentID("3333");
				}
			}
		}
		// 위 for문과 같은 뜻.
//		for(int i=0; i<cnt; i++) {
//			if(cuList[i] instanceof VIPCustomer) {
//				if(((VIPCustomer) cuList[i]).getAgentID().equals("1111")) {
//					((VIPCustomer) cuList[i]).setAgentID("3333");
//				}
//			}
//		}
		
//		for(int i=0; i<cnt; i++) {
//			cuList[i].customerInfo();
//			System.out.println();
//		}
	}
}
