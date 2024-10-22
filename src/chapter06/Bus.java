package chapter06;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;

	// 생성자 오버로딩
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// 매서드
	public void take(int money) { // 승객이 낸 돈
		this.money += money; // 버스 수익
		passengerCount++; // 승객의 수 증가
	}

	public void showInfo() {
		System.out.println(busNumber + "번의 버스 승객은 " + passengerCount + "명이고, 수입은" + money + "원 입니다.");
	}

}
