package chapter05;

public class FunTest_Overload {

	public void getResult(int i) {
		System.out.println(i +"��(��) int �Դϴ�.");
	}

	public void getResult(char ch) {
		System.out.println(ch +"��(��) ch �Դϴ�.");
	}

	public void getResult(String str) {
		System.out.println(str +"��(��) str �Դϴ�.");
	}

	public void getResult(int i, String str) {
		System.out.println(i +"��(��) int�̰� "+str+"��(��) String �Դϴ�.");
	}
	
	

}
