package day04;

class Animal {
	// 동물의 이름과 종류를 나타내는 클래스
	// 메서드 : 이름과 종류를 출력하는 메서드, 동물의 울음소리를 출력하는 메서드
	private String name;
	private String category;
	
	public Animal() {}
	
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
	// 출력메서드
	public void printInfo() {
		System.out.println("이름 : "+name+" 종류 : "+category);
	}
	public void howl() {
		System.out.println("-- "+name+"의 울음소리 --");
	}
	
	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
// dog, cat animal extends create
// printinfo, howl() : override 추가해서 출력

class Dog extends Animal {
	private String howl;
	// name, category는 상속받아 이미 선언되어있음.
	public Dog() {
		setName("강아지");
		setCategory("개과");
	}
	public void howl() {
		super.howl();
		System.out.println("으르르릉컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹컹");
	}
	// getter / setter
	public String getHowl() {
		return howl;
	}
	public void setHowl(String howl) {
		this.howl = howl;
	}
	
}
class Cat extends Animal {
	private String howl;
	
	public Cat(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}
	public void howl() {
		super.howl();
		System.out.println("왜오옹왜오옹왜오옹왜오옹왜오옹왜오옹왜오옹왜오옹왜오옹왜오옹왜오옹왜오옹왜오옹왜오옹왜오옹왜오옹왜오옹왜오옹왜오옹왜오옹왜오옹왜오옹");
	}
	// getter / setter
	public String getHowl() {
		return howl;
	}
	public void setHowl(String howl) {
		this.howl = howl;
	}
}
class Tiger extends Animal {
	private String howl;
	
	public Tiger(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}
	public void howl() {
		super.howl();
		System.out.println("어흐흐흐으으흥흥흥흥흐으으응");
	}
	// getter / setter
	public String getHowl() {
		return howl;
	}
	public void setHowl(String howl) {
		this.howl = howl;
	}
}
public class Extends02 {

	public static void main(String[] args) {
		// 오버라이딩 : 부모클래스의 메서드를 재정의하며 사용하는 것.
		// - 부모클래스의 메서드와 선언부가 일치해야함. { 구현만 재정의 가능. }
		// - 접근제한자는 더 넓은 범워만 가능, 축소는 안됨.
		
		Dog d = new Dog();
		
		d.printInfo();
		d.howl();
		
		Cat c = new Cat("굉이","고양이과");
		c.printInfo();
		c.howl();
		
		Tiger t = new Tiger("호랭이","고양이과");
		t.printInfo();
		t.howl();
	}

}
