package chapter06;

public class TeamMain {

	public static void main(String[] args) {

		TeamGroup team = new TeamGroup();
		
		//Scanner scan = new Scanner(System.in);

		team.init(); // ���� ���� �Է�
		team.Disp(); // ���� ���� ���

		System.out.println("");
		TeamMember t = new TeamMember();
		t.setName("������");
		System.out.println("���� �̸�: " + t.getName());
		t.setmPhone("010-1234-5678");
		System.out.println("���� ��ȭ��ȣ: " + t.getmPhone());
		t.setsName("������");
		System.out.println("������ ��ȭ��ȣ: " + t.getsName());

		
		//System.out.println("���� �Է�");
		//t.gender = scan.nextLine();
		
		//System.out.println(t.gender);
		
		
	}

}
