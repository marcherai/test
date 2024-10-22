package chapter02;

public class LogicTest10 {
	public static void main(String[] args) {
		// 논리연산
		char a, b;
		boolean c;
		a = 'A';
		b = 'b';

		// || => OR
		// && => and
		c = (true || true) && false;
		System.out.println(c);
		System.out.println("---------");
		
		c= a<b && (a==b); 
		System.out.println(c);
		System.out.println("---------");
		
		c = a<b || (a==b); 
		System.out.println(c);

	}
}
