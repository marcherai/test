package chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {
		// ������ �����ε��� �̿��� ��� ���� �ʱ�ȭ(1004, "�鼳", 1 , "�ϻ�")

		StudentInfo studentchoi = new StudentInfo(1004, "�鼳", 1, "�ϻ�");

		System.out.println(studentchoi.address);

		// �⺻ �����ڷ� ��ü ����
		StudentInfo studentLee = new StudentInfo();
		// �������� �ʱ�ȭ
		studentLee.address = "���α�";
		System.out.println(studentLee.address);

		//�⺻ �����ڷ� ��ü ����
		StudentInfo studentKim = new StudentInfo();
		
		// getters and setters
		studentchoi.setStudentName("������");
		String sname = studentchoi.getStudentName();
		System.out.println(sname);

	}

}
