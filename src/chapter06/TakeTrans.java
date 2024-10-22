package chapter06;

public class TakeTrans {

	public static void main(String[] args) {

		// 학생 두명의 객체 생성(studnetJames, studentTom)

		StdInfo studentJames = new StdInfo("James", 15000);
		StdInfo studentTom = new StdInfo("Tom", 12000);

		// 버스타기
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100); // 13600

		Bus bus999 = new Bus(999);
		studentTom.takeBus(bus999); // 10600

		// James 정보보기
		// 버스타기(999)
		studentJames.showInfo();
		bus100.showInfo();
		System.out.println("========================================");

		studentTom.showInfo();
		bus999.showInfo();
		System.out.println("========================================");

		// 지하철타기
		Subway subway1 = new Subway("1호선");
		studentJames.takeSubway(subway1); // 11800

		Subway subway4 = new Subway("4호선");
		studentTom.takeSubway(subway4); // 8800

		// James 정보보기
		// 지하철타기(1)
		studentJames.showInfo();
		subway1.showInfo();
		System.out.println("========================================");

		studentTom.showInfo();
		subway4.showInfo();

	}

}
