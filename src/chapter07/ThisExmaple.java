package chapter07;

public class ThisExmaple {

	public static void main(String[] args) {

		// getter & setter
		ThisEx brith1 = new ThisEx();

		brith1.printThis(); // 객체의 주소 변환

		brith1.setYear(2024);
		brith1.setMonth(10);
		brith1.setDay(7);

		System.out.println("생년월일: " + brith1.getYear() + "." + brith1.getMonth() + "." + brith1.getDay());

		// 생성자의 초기화
		ThisEx brith2 = new ThisEx(10, 8, 2024);

		brith2.printThis(); // 객체의 주소 변환

		System.out.println("생년월일: " + brith2.year + "." + brith2.month + "." + brith2.day);

		// getter
		ThisEx brith3 = new ThisEx(10, 9, 2024);

		brith3.printThis(); // 객체의 주소 변환

		System.out.println("생년월일: " + brith3.getYear() + "." + brith3.getMonth() + "." + brith3.getDay());

	}

}
