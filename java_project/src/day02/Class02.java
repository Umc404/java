package day02;

public class Class02 {
	// 생성자 : 객체를 생성하기 위해 객체의 초기화를 담당
	// Car c = new Car();  => 클래스 객체명 = new 생성자();
	// 생성자는 여러개 만들 수 있음. (생성자 오버로딩)
	// 생성자명은 클래스명과 동일
	// 생성자가 하나도 없는 경우는 기본 생성자를 자동으로 생성 => Car()
	// 생성자를 하나라도 생성하면 기본 생성자는 주지 않음.
	// 생성자를 사용자 지정으로 생성하려면 기본생성자도 같이 생성해야 함.
	// 생성자 오버로딩 조건 (매개변수 개수가 달라야 함 || 매개변수 타입이 달라야 함.)
	// 생성자 호출 가능. (생성자 내에서만)
	// this : 내 클래스의 요소라는 것을 나타내는 키워드
	// super : 부모 클래스의 요소라는 것을 나타내는 키워드
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car c = new Car(); // 생성자 호출은 단 한번 객체 생성시만 가능.
//		c.CarStatus(); // console 실행
		// 시동 on
//		c.setPower("on");
		// 엑셀 20 씩
//		c.setSpeed(20);
//		c.setSpeed(20);
//		c.setSpeed(20);
//		c.CarStatus(); // console 실행
		// 브레이크 20씩
//		c.setSpeed(-20);
//		c.setSpeed(-20);
//		c.setSpeed(-20);
//		c.setPower("off");
//		c.CarStatus(); // console 실행
		// power 잘못입력 시
//		c.setPower("킵니다.");
//		c.CarStatus();
		
		Car c1 = new Car("BMW");
		c1.CarStatus();
		Car c2 = new Car("BMW","gray");
		c2.CarStatus();
		Car c3 = new Car("BMW","gray","2024");
		c3.CarStatus();
	}

}

// Car 클래스 생성.
// 멤버변수 : name, color, year, power, speed => private 선언(getter / setter 생성)
// 차 정보 소나타(블랙/2024) 출력 메서드
// power : 시동 상태 나타내는 메서드 (true / false)
// speed : 속도 up / down 메서드
class Car {
	private String name = "소나타";
	private String color = "블랙";
	private String year = "2024";
	private boolean power = false;
	private int speed = 0;
	
	// 멤버변수 => 생성자 => 메서드 => getter / setter
	// 생성자 위치
	// 객체를 생성할 때 초기값 지정
	// 생성자의 접근제한자는 반드시 public 이어야 함.
	// 생성자명은 클래스명과 반드시 같아야 함.
	// 생성자는 메서드와 달리 return 타입이 없음.
	public Car() {} // 기본생성자
	public Car(String name) {
		this.name = name;
	}
	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	// 불가능 : 오버로딩 조건에 충족이 안됨.
//	public Car(String name, String year) {
//		this.name = name;
//		this.year = year;
//	}
	public Car(String name, String color, String year) {
		this(name, color); // 선언된 생성자 호출(상단 생성자(name, color)). 호출은 무조건 첫줄
//		this.name = name;
//		this.color = color;
		this.year = year;
	}
	
	
	public Car(String name, String color, String year, boolean power, int speed) {
		super();
		this.name = name;
		this.color = color;
		this.year = year;
		this.power = power;
		this.speed = speed;
	}
	public void CarStatus() {
		System.out.println("차 종류 : " + name);
		System.out.println("색상 : " + color);
		System.out.println("연식 : " + year);
		System.out.println("시동 : " + power);
		System.out.println("속도 : " + speed);
	}
	public boolean getPower() {
		return this.power;
	}
	public void setPower(String a) { // on off 입력
		if(a == "on") {
			this.power = true;
		}else if(a == "off"){
			this.power = false;
		}else {
			System.out.println("차 파워가 나갔습니다. 카센터 콜하세요.");
		}
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int b) {
		speed += b;
	}
}