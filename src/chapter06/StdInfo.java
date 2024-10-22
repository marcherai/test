package chapter06;

public class StdInfo {

	public String studentName;
	public int grade;
	public int money;

	// 생성자 오버로딩
	public StdInfo(String studentName, int money) {

		this.studentName = studentName;
		this.money = money;

	}

	// 버스
	public void takeBus(Bus bus) {

		bus.take(1400); // 버스 수입과 승객 증가
		this.money -= 1400; // 학생지출
	}

	// 지하철
	public void takeSubway(Subway subway) {

		subway.take(1800); // 지하철 수입과 승객 증가
		this.money -= 1800; // 학생지출
	}

	// 잔액

	public void showInfo() {
		System.out.println(studentName + "님의 남은 잔액은: " + money + "원 입니다.");
	}
}
