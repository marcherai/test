package chapter01;

public class BinaryTest02 {

	public static void main(String[] args) {
		// 맨앞의 코드가 0이면 양수, 양수면 음수 
		int num1 = 0B00000000000000000000000000000101; // +5 
		// 십진수로 계산하면 4294967290이지만 음수이므로 1의 보수로 계산 , 1의 보수 계산법 : 0이 1로 , 1이 0으로 바뀜
		// 0B00000000000000000000000000000101 + 1 -> 2의보수
		int num2 = 0B11111111111111111111111111111010; // 1의 보수로 계산-6
		int num3 = 0B11111111111111111111111111111011; // 2의 보수 -5
		
		System.out.println("num1 :" +num1);
		System.out.println("num1의 1의 보수 :" +num2);
		System.out.println("num1의 2의 보수 :" +num3);
		System.out.println("num1+num3 :" +(num1+num3));  
		
		
		

	}

}
