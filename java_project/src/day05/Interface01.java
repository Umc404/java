package day05;

// 인터페이스 : 기능 소개와 같음. => '이 페이지는 이것들을 구현했습니다.' 를 표시.
interface Power{
	abstract void turnOn(); // 인터페이스 내 추상클래스 선언해도 안해도 됨.
	void turnOff();
}

interface Remocon{
	void volUp();
	void volDown();
}

// 상속 + 구현
// class Tv extends A implements B, C {}

class Tv implements Power, Remocon {
	private boolean power;
	private int vol;
	private int ch;
	
	@Override
	public void turnOn() {
		// 전원 키기
		power = true;
		System.out.println("전원이 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		// 전원 끄기
		power = false;
		System.out.println("전원이 꺼졌습니다.");
	}
	
	@Override
	public void volUp() {
		vol++;
		System.out.println("vol : "+ vol);
	}
	
	@Override
	public void volDown() {
		vol--;
		System.out.println("vol : "+ vol);
	}
	
	public void chUp() {
		ch++;
		System.out.println("ch : "+ ch);
	}
	public void chDown() {
		ch--;
		System.out.println("ch : "+ ch);
	}
}


public class Interface01 {

	public static void main(String[] args) {
		
		Tv t = new Tv();
		t.turnOn();
		
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volDown();
		t.volDown();
		
		t.chUp();
		t.chUp();
		t.chDown();
		t.chUp();
		t.chUp();
		t.chDown();
		t.chDown();
		
		t.turnOff();
		/* 인터페이스 : 추상메서드와 상수(final)로만 이루어진 것.
		 * 추상메서드 : 메서드의 선언부만 있고, 구현부가 없는 메서드
		 * 추상메서드가 포함되어있는 추상클래스/인터페이스 => 반드시 구현해야 객체를 생성할 수 있음.
		 * 
		 * 인터페이스 키워드 : interface
		 * - 추상클래스 : 대부분 상속을 하기 위해 사용.
		 * - 인터페이스 : 메뉴얼화 / 상속을 하기 위해 사용.
		 * - 기능요약서 라고 함.
		 * - 상속키워드 : extends / 구현키워드 : implements
		 * - 인터페이스는 멤버변수가 없음. 그러므로 메서드 정리를 해야함.
		 * 
		 * - 상속 : 다중상속 불가능
		 * - 구현 : 다중구현 가능
		 * - 상속 + 구현 동시에 가능
		 */
		
	}

}
