package chapter06;

public class TeamGroup {

	// �ɹ� ����
	private TeamMember[] member = new TeamMember[5];

	// �⺻ ������
	

	// �ʱ�ȭ �޼���
	public void init() {

		member[0] = new TeamMember("�����", "���л�"); // �����ε� ������
		member[1] = new TeamMember("������", "���л�"); // �⺻ ������
		member[2] = new TeamMember("���ڼ�", "���л�"); // �⺻ ������
		member[3] = new TeamMember("������", "���л�"); // �⺻ ������
		member[4] = new TeamMember("�����", "���л�"); // �⺻ ������

	}

	// ��� �޼���
	public void Disp() {
		for (int i = 0; i < member.length; i++) {
			System.out.print("����: " + (member[i].getName()));
			System.out.println(", ����: " + (member[i].getGender()));
		}
	}

}
