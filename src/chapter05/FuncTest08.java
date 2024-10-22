package chapter05;

public class FuncTest08 {
	
	public static void main(String[] args) {

		int num = 10;
		System.out.println("Before: " + num);
		changeValue(num);
		System.out.println("After: " + num);
	}
	
	public static void changeValue(int value) {
		
		value = 20;
		System.out.println("After: " + value);
		
	}


}
