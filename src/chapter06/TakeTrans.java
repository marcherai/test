package chapter06;

public class TakeTrans {

	public static void main(String[] args) {

		// �л� �θ��� ��ü ����(studnetJames, studentTom)

		StdInfo studentJames = new StdInfo("James", 15000);
		StdInfo studentTom = new StdInfo("Tom", 12000);

		// ����Ÿ��
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100); // 13600

		Bus bus999 = new Bus(999);
		studentTom.takeBus(bus999); // 10600

		// James ��������
		// ����Ÿ��(999)
		studentJames.showInfo();
		bus100.showInfo();
		System.out.println("========================================");

		studentTom.showInfo();
		bus999.showInfo();
		System.out.println("========================================");

		// ����öŸ��
		Subway subway1 = new Subway("1ȣ��");
		studentJames.takeSubway(subway1); // 11800

		Subway subway4 = new Subway("4ȣ��");
		studentTom.takeSubway(subway4); // 8800

		// James ��������
		// ����öŸ��(1)
		studentJames.showInfo();
		subway1.showInfo();
		System.out.println("========================================");

		studentTom.showInfo();
		subway4.showInfo();

	}

}
