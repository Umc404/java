package day03;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t = new Tv();
		
		t.power();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.chUp();
		t.setCh(18);
		t.chUp();
		t.setMute();
		t.setMute();
		
	}

}
class Tv {
	private String brand;
	private boolean power, mute;
	private int ch, vol;
	private int lastVol;
	
	// 생성자
	public Tv() {
		this.brand = "Samsung";
		this.vol = 3;
	};
	public Tv(String brand) {
		this.brand = brand;
	}
	public Tv(String brand, boolean power) {
		this.brand = brand;
		this.power = power;
	}
	public Tv(String brand, boolean power, int ch) {
		this(brand, power);
		this.ch = ch;
	}
	public Tv(String brand, boolean power, int ch, int vol) {
		this(brand, power,ch);
		this.vol = vol;
	}
	public Tv(String brand, boolean power, int ch, int vol, boolean mute) {
		this(brand, power,ch,vol);
		this.mute = mute;
	}
	
	// 메서드
	public void power() {
		this.power = !this.power;
		if(power) {
			System.out.println("Tv가 켜졌습니다.");
			System.out.println(brand+" / Ch : "+ch+" / Vol : " + vol);
		} else {
			System.out.println("Tv가 꺼졌습니다.");
		}
	}
	public void chUp() {
		if(power) { 
			if(ch >= 20) {
				ch = 0;
				System.out.println("현재 채널 : " + ch);
			}
			else {
				ch++;
				System.out.println("현재 채널 : " + ch);
			}
		} else {
			System.out.println("Tv부터 켜주세요.");
		}
		
	}
	public void chDown() {
		if(power) {
			if(ch <= 0 ) {
				ch = 20;
				System.out.println("현재 채널 : " + ch);
			}
			else {
				ch--;
				System.out.println("현재 채널 : " + ch);
			}
		} else {
			System.out.println("Tv부터 켜주세요.");
		}
	}
	public void volUp() {
		if(power) {
			if(vol >= 10) {
				vol = 10;
				System.out.println("현재 볼륨 : " + vol);
			}
			else {
				vol++;
				System.out.println("현재 볼륨 : " + vol);
			}
		} else {
			System.out.println("Tv부터 켜주세요.");
		}
	}
	public void volDown() {
		if(power) {
			if(vol <= 0) {
				vol = 0;
				System.out.println("현재 볼륨 : " + vol);
			}
			else {
				vol--;
				System.out.println("현재 볼륨 : " + vol);
			}
		} else {
			System.out.println("Tv부터 켜주세요.");
		}
	}
	public void setMute() {
		this.mute = !this.mute;
		if(power) {
			if(mute) {
				lastVol = vol;
				vol = 0;
				System.out.println("뮤트 On. 현재 볼륨 : " + vol);
			}
			else {
				vol = lastVol;
				System.out.println("뮤트 Off. 현재 볼륨 : " + vol);
			}
		} else {
			System.out.println("Tv부터 켜주세요.");
		}
	}
	
	// getter / setter
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public boolean isMute() {
		return mute;
	}
	public void setMute(boolean mute) {
		this.mute = mute;
	}
	
	
}
// tv 클래스 생성
/* 멤버변수 : brand, power, ch, vol
 * 브랜드(삼성, LG), 전원, 채널, 소리볼륨
 * 메서드 :
 * power()
 * chUp() / chDown() : 1씩 증가 20까지 있음. 넘어가면 다시 0번으로 돌아가는 순환구조.
 * volUp() volDown() : 1씩 증가 1씩 감소 10까지 있음. 넘으면 그대로 10. 0이면 '음소거' 출력
 * mute()
 * 
 * */

// final : 변경할 수 없는 값을 지정. 대문자를 쓰는 것을 원칙으로 함.
// get은 가능하나 set은 불가능.


