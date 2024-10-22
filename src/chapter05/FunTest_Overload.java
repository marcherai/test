package chapter05;

public class FunTest_Overload {

	public void getResult(int i) {
		System.out.println(i +"은(는) int 입니다.");
	}

	public void getResult(char ch) {
		System.out.println(ch +"은(는) ch 입니다.");
	}

	public void getResult(String str) {
		System.out.println(str +"은(는) str 입니다.");
	}

	public void getResult(int i, String str) {
		System.out.println(i +"은(는) int이고 "+str+"은(는) String 입니다.");
	}
	
	

}
