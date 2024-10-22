package chapter07;

public class KoreanMain {

	public static void main(String[] args) {

		Korean korean = new Korean("¹Ú¾¾", "010-1234-5678");

		System.out.println("nation: " + korean.nation);
		System.out.println("nation: " + korean.name);
		System.out.println("nation: " + korean.phone);
		
		System.out.println("---------------------");

		Korean korean2 = new Korean("ÀÌ¾¾", "010-1234-4488");

		System.out.println("nation: " + korean2.nation);
		System.out.println("nation: " + korean2.name);
		System.out.println("nation: " + korean2.phone);

	}

}
