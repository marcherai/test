package chapter02;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 534���� å(books)�� �л�(students) 30���� �Ȱ��� ������ ������ ��,
		// �л��� ��� ������, ���������� � ������ ���غ���

//		int students = 30;
//		int books = 534;
//
//		System.out.println("������ å�� ���� :" + (double) (books / students));
//		System.out.println("���� å�� ���� :" + (double) (books % students));

		int students = 30;
		int books = 534;

		int booksperStudents = (books / students);
		System.out.println(booksperStudents);
		int bookLeft = (books % students);
		System.out.println(bookLeft);

	}

}
