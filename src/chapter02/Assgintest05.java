package chapter02;

public class Assgintest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 전위연산
		System.out.println("===전위연산===");
		int gameScore = 150;

		// int lastScore = gameScore + 1;
		// lastScore1 =gameScore+1
		int lastScore1 = ++gameScore; // ++gameScore => gameScore += 1;
		System.out.println(gameScore); // 151
		System.out.println(lastScore1); // 151
		System.out.println("-----------------");
		int lastScore2 = --gameScore; // lastScore2 = gameScore-1
		System.out.println(gameScore); // 150
		System.out.println(lastScore2); // 150

		// 후위연산
		System.out.println("===후위연산===");
		// lastScore3 = gameScore | gameScore++ => gameScore += 1;
		int lastScore3 = gameScore++;
		System.out.println(lastScore3); // 150
		System.out.println(gameScore); // 151
		System.out.println("-----------------");
		int lastScore4 = gameScore--;
		System.out.println(lastScore4); // 151
		System.out.println(gameScore); // 150

	}

}
