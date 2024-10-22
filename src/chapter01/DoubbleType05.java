package chapter01;

public class DoubbleType05 {

	public static void main(String[] args) {
		// 정수: bit->byte(bit 8) ->short->int->long
		// 실수: float(4byte) -> double(8byte)
		
		float fnum=3.14f; //4byte ----float은 숫자 뒤에 f표기 
		double dnum=3.14; // 8byte
		
		System.out.println(fnum);
		System.out.println(dnum);
	}

}
