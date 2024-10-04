package Lotto;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		// 로또 프로그램
		/* -- menu --
		 * 1. 사용자 로또 번호 생성(수동) : 사용자가 직접 번호 입력(1~45)
		 * 2. 사용자 로또 번호 생성(자동) : Random
		 * 3. 당첨번호 입력(수동) : 사용자 직접 입력
		 * 4. 당첨 확인 : 가장 마지막에 발행한 당첨번호로 확인
		 * 5. 역대 당첨번호 목록 확인
		 * 6. 종료
		 * 
		 * 로또는 상속을 하여 사용
		 * Lotto class => 사용자의 번호를 저장하는 클래스
		 * LottoExtend class => 당첨번호 class. Lotto를 상속 + 보너스번호
		 * LottoController => 처리
		 * */
		// controller 생성
		LottoController ctrl = new LottoController();
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		do {
			System.out.println("1. 로또번호 생성(수동)");
			System.out.println("2. 로또번호 생성(자동)");
			System.out.println("3. 당첨번호 입력(수동)");
			System.out.println("4. 당첨 확인");
			System.out.println("5. 역대 당첨번호");
			System.out.println("6. 종료");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				ctrl.createLotto(sc);
				break;
			case 2:
				ctrl.createLottoAuto();
				break;
			case 3:
				ctrl.insertLotto(sc);
				break;
			case 4:
				ctrl.checkLotto();
				break;
			case 5:
				ctrl.printLotto();
				break;
			case 6:
				System.out.println("종료");
				break;
			default:
				System.out.println("잘못 입력했습니다.");
			}
		} while(menu != 6);
		
		sc.close();
	}

}
