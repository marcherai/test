package chapter02;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 534개의 책(books)을 학생(students) 30명에게 똑같은 갯수로 나눠줄 때,
		// 학생당 몇개씩 가지고, 최종적으로 몇개 남는지 구해보기

//		int students = 30;
//		int books = 534;
//
//		System.out.println("가져간 책의 갯수 :" + (double) (books / students));
//		System.out.println("남은 책의 갯수 :" + (double) (books % students));

		int students = 30;
		int books = 534;

		int booksperStudents = (books / students);
		System.out.println(booksperStudents);
		int bookLeft = (books % students);
		System.out.println(bookLeft);

	}

}
