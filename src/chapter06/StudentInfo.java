package chapter06;

public class StudentInfo {

	// (�������(=�ʵ�)
	int studnetID;
	private String studentName;
	int grade;
	String address;

	// ������

	public StudentInfo() {

	}


	// ������ �����ε�
	public StudentInfo(int studnetID, String studentName, int grade, String address) {
		this.studnetID = studnetID;
		this.setStudentName(studentName);
		this.grade = grade;
		this.address = address;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
