package chapter07;

public class CarMain {

	public static void main(String[] args) {

		// (myCar) 생성하면서 초기화
		Car myCar = new Car("검정", 3000);
		// 멤버변수를 이용하여 색깔 변경
		myCar.color = "화이트";

		// 멤버변수 이용해서 출력
		System.out.println("자동차의 색상은 " + myCar.color + "이고 CC는 " + myCar.cc);

		// 메서드 이용해서 출력
		System.out.println("자동차의 색상은 " + myCar.getColor() + "이고 CC는 " + myCar.getCc());

	}

}
