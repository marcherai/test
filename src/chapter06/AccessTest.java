package chapter06;

public class AccessTest {

	// 맵버변수 = 필드

	private int aa; // 현재 클레스에세만 사용 가능
	public int bb; // 접근 지정자 공용(다른 클래스에서도 사용가능)
	int cc; // public 생략

	// 디폴트 생성자

	// 메서드
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void Disp() {
		System.out.println("aa값: " + aa + " bb값: " + bb + " cc값: " + cc);
	}

	public static void main(String[] args) {

		AccessTest obj = new AccessTest();

		// aa 초기화 방법
		//obj.aa = 10 ;
		//System.out.println("aa = 10 ->"+obj.aa);
		obj.setAa(20);
		System.out.println("setAa(20) -> "+obj.aa);
		
		System.out.println("===============");
		obj.bb = 20;
		System.out.println("bb = 20 -> "+obj.bb);
		obj.setBb(30);
		System.out.println("setBb(30) -> "+obj.bb);
		
		System.out.println("===============");
		obj.cc = 30;
		System.out.println("bb = 30 -> "+obj.cc);
		obj.setCc(40);
		System.out.println("setBb(40) -> "+obj.cc);
		
		obj.Disp();
		
	}

}
