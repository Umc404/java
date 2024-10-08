package day04;

class A{
	private int a,b,c; // A만 사용 가능
	protected int num1; // 상속 가능
	
	public void print() {
		System.out.println("a: "+a+" b: "+b+" c: "+c);
		System.out.println("num1:"+num1);
	}
	
	// getter / setter
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
}
class B extends A {
	private int d,e,f;

	// 오버라이드(override) : 부모의 메서드를 재정의 사용하는 것.
	// super : 부모의 멤버값을 가져올 때 사용하는 키워드
	
	@Override
	public void print() {
		super.print();  // 부모의 print() 메서드를 호출하여 가져오기
		System.out.println("d: "+d+" e: "+e+" f: "+f);
	}
	
	// getter / setter
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
}




public class Extends01 {

	public static void main(String[] args) {
		/* 상속(Inheritance) : 부모의 클래스 멤버 요소를 자식이 물려받는 것.
		 * 멤버 요소 : 멤버변수, 메서드 사용 가능. private은 상속되지 않음. 상속하려면 protected 사용.
		 * 상속받는 부모클래스가 다른 패키지에 있다면, default도 상속 대상이 안됨.
		 * public / protected 접근제한자만 가능.
		 * 
		 * 상속 키워드 : extends
		 * 상속은 1개만 가능. 다중상속을 허용하지 않음.
		 * 
		 * class class명 extends 부모class명 "extends X" {  // 큰따옴표처럼 두번은 되지 않음.
		 * 	// 본인의 멤버변수와 메서드 구현 가능.
		 *	// 본인멤버변수 + 본인메서드 + 부모멤버변수 + 부모메서드 
		 * }
		 */
		A a = new A();
		a.setA(10);
		a.setB(20);
		a.setC(30);
		a.setNum1(100);
		a.print();
		
		B b = new B();
		b.print(); // A class를 상속받으나, 객체의 구조만 상속받아 가져옴. 값은 가져오지 않음. => 다 0.
		b.setA(100);
		b.setB(200);
		b.setC(300);
		b.num1 = 1000; // 접근제한자가 protected라서 직접 접근 가능.
		b.setD(70);
		b.setE(80);
		b.setF(90);
		
		b.print();
		
		
		
	}

}
