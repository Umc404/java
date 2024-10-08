package day02;

public class Lotto {

	public static void main(String[] args) {
		/* 로또번호 생성
		 * 
		 */
		int lotto[] = new int[7];
		int user[] = new int[6];
		
		Lotto Lt = new Lotto();
		Lt.setNumber(lotto, lotto.length);
		Lt.setNumber(user, user.length);
		
		int bonus = lotto[lotto.length-1];
		
		// 로또번호 [보너스번호], 내 번호 출력
		System.out.print("로또번호 : ");
		Lt.printArr(lotto, lotto.length-1);
		System.out.println("["+bonus+"]");
		
		System.out.print("내번호 : ");
		Lt.printArr(user, user.length);
		System.out.println("");
		
		
		Lt.ArrCount(lotto, user);
	}
	/* 배열을 매개변수로 받아 1~45까지의 랜덤수를 채워서 생성(중복 불가능 - 메서드 호출로 구현)
	 * 리턴할 필요가 없음. main에 있는 배열을 채우기.
	 */
	// 배열 내 값 생성.
	public void setNumber(int[] arr, int number) {
		for(int i=0; i<number; i++) {
			arr[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
	}
	/* 배열과 값을 주고 같은지 아닌지 확인하는 메서드
	 * 배열에 값이 있으면 true / 없으면 false
	 * 
	 * */
	
	/* 배열(매개변수)의 값을 출력하는 메서드
	 * 1 2 3 4 5 6 [7] 당첨번호 출력방식
	 * 1 2 3 4 5 6 유저번호 출력방식
	 */
	// 배열 출력
	public void printArr(int[] arr, int arrNum) {
		for(int i=0; i<arrNum; i++) {
			System.out.print(arr[i]+" ");
		}
//		System.out.println("");
	}
	/* 등수확인 메서드
	 * -- 당첨기준
	 * user 번호 기준으로
	 * 6개 일치 : 1등
	 * 5개 일치 + 보너스 번호 : 2등
	 * 5개 일치 : 3등
	 * 4개 일치 : 4등
	 * 3개 일치 : 5등
	 * 나머지 나가리
	 */
	// 두 배열을 받아 일치한 개수와 등수 출력.
	public void ArrCount(int[] arr1, int[] arr2) {
		int count = 0;
		int corBonus = 0;
		int bonusNo = arr1[arr1.length-1];
		
		for(int i=0; i<arr1.length-1; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					count++;
					break;
				}
			}
		}
		if(arr2.equals(bonusNo)) {
			corBonus = 1;
		}
		System.out.print(count+"개 일치 : ");
		switch(count) {
		case 6:
			System.out.println("1등");
			break;
		case 5:
			if(corBonus == 1) {
				System.out.println("2등");
			} else {
				System.out.println("3등");
			}
			break;
		case 4:
			System.out.println("4등");
			break;
		case 3:
			System.out.println("5등");
			break;
		default:
			System.out.println("응 나가리");
		}
	}
}
