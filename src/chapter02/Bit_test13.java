package chapter02;

public class Bit_test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 5; // 0101
		int num2 = 10; // 1010
		
		//Bit OR(|) 연산 : 하나라도 1이면 1로 결과값 반환
		int result = num1 | num2;
		System.out.println(result);
		
		//Bit AND(&) 연산 : 모두 1이면 1로 결과값 반환
		result = num1 & num2;
		System.out.println(result);
		
		//Bit XOR(^) 연산 : 0과 1이여야만 1로 결과값 반환
		result = num1 ^ num2;
		System.out.println(result);

	}

}
