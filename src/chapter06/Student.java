package chapter06;

public class Student {

	public static final int studentID = 1000;
	public String studentName;
	int grade;
	String address;

	// ������
	public Student() {

	}

	// ������ �����ε�
	public Student(String studentName, String address) {

		this.studentName = studentName;
		this.address = address;

	}
	// �޼���
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// ����� �޼���
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}


}
