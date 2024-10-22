package chapter05;

public class FuncTest03 {

	private void display1(String str[]) {

		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
	}

	private static void display2(String str[]) {
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}

	}

	public static void main(String[] args) {

		String str[] = { "Java", "Oracle", "JSP", "HTML5", "CSS", "SpringBoot" };
		
		FuncTest03 obj = new FuncTest03();
		obj.display1(str);
		
		System.out.println();
		
		display2(str);
	}

}
