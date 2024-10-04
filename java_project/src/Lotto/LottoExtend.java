package Lotto;

// Lotto 에서 상속받고, 보너스번호 여기서 선언
// 그 후 비교하고 몇개 맞췄는지 tryList[] 에 값 set
// super. tryArr 가져와서 비교

public class LottoExtend extends Lotto{
	// Lotto 클래스를 상속받아 보너스 처리만 하면 됨.
	private int bonus;
	
	public LottoExtend() {}

	@Override
	protected void randomLotto() {
		// 기존 numbers 6자리 배열 채우기는 이미 완성
		// 기존 번호에 중복없이 보너스 번호 생성
		super.randomLotto();
		while(true) {
			int r = random();
			if(!isContain(r)) {
				bonus = r;
				break;
			}
		}
	}

	@Override
	protected void init() {
		super.init();
		bonus = 0;
	}

	@Override
	protected void insertNumbers(int[] arr) {
		// 가져온 번호가 7자리일 경우;
		super.insertNumbers(arr); // 6자리만 넣기
		this.bonus = arr[numbers.length]; // 6번지 채우고 나머지는 버리기
	}
	protected void insertNumbers(int[] arr, int bonus) {
		// 가져온 번호는 6자리, 보너스를 별도로 가져오는 경우
		super.insertNumbers(arr);
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString()+"["+bonus+"]";
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
}
