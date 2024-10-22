package chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {
		// 생성자 오버로딩을 이용한 멤버 변수 초기화(1004, "백설", 1 , "일산")

		StudentInfo studentchoi = new StudentInfo(1004, "백설", 1, "일산");

		System.out.println(studentchoi.address);

		// 기본 생성자로 객체 생성
		StudentInfo studentLee = new StudentInfo();
		// 직관적인 초기화
		studentLee.address = "종로구";
		System.out.println(studentLee.address);

		//기본 생성자로 객체 생성
		StudentInfo studentKim = new StudentInfo();
		
		// getters and setters
		studentchoi.setStudentName("최재현");
		String sname = studentchoi.getStudentName();
		System.out.println(sname);

	}

}
