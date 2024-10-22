package chapter06;

public class CarMain {

	public static void main(String[] args) {

		Car mycar = new Car(); // 객체 생성

		System.out.println("제작회사:" + mycar.company);
		System.out.println("모델명:" + mycar.model);
		System.out.println("색상:" + mycar.color);
		System.out.println("최고속도:" + mycar.maxSpeed);
		System.out.println("현재속도:" + mycar.speed);

		mycar.speed = 60;
		System.out.println("변갱된 현재속도:" + mycar.speed);

		mycar.company = "르노";
		System.out.println("변갱된 제작회사:" + mycar.company);
	}

}
