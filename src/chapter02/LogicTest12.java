package chapter02;

public class LogicTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 20;

		System.out.println("------------AND------------");
		boolean flag1 = (num1 > 10) && (num2 > 20);
		System.out.println("false && flase : " + flag1);
		System.out.println("------------------------");

		boolean flag2 = (num1 > 10) && (num2 > 0);
		System.out.println("flase && true : " + flag2);
		System.out.println("------------------------");

		boolean flag3 = (num1 > 0) && (num2 > 20);
		System.out.println("true && flase : " + flag3);
		System.out.println("------------------------");

		boolean flag4 = (num1 > 0) && (num2 > 0);
		System.out.println("true && true : " + flag4);

		System.out.println("------------OR------------");
		boolean flag5 = (num1 > 10) || (num2 > 20);
		System.out.println("false && flase : " + flag5);
		System.out.println("------------------------");

		boolean flag6 = (num1 > 10) || (num2 > 00);
		System.out.println("false && true : " + flag6);
		System.out.println("------------------------");

		boolean flag7 = (num1 > 0) || (num2 > 20);
		System.out.println("true && flase : " + flag7);
		System.out.println("------------------------");

		boolean flag8 = (num1 > 0) || (num2 > 0);
		System.out.println("true && true : " + flag8);
		System.out.println("------------------------");

		// num1과 num2는 같지 않다
		boolean flag = (num1 == num2);
		System.out.println(flag);

		flag = !(num1 > 0); // !는 결과값의 반대값 flase
		System.out.println(flag);

	}

}
