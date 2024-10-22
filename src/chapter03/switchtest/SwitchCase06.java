package chapter03.switchtest;

public class SwitchCase06 {

	public static void main(String[] args) {

		int time = (int) (Math.random() * 10) + 9;
		System.out.println("[현재시간: " + time + "시]");
		System.out.print("할일 : ");
		switch (time) {
		case 9: {

			System.out.print("강아지 산책");
			break;
		}
		case 10: {

			System.out.print("샤워하기");
			break;
		}
		case 11: {

			System.out.print("점심 준비");
			break;
		}
		case 12: {

			System.out.print("점심 식사");
			break;
		}
		case 13: {

			System.out.print("TV보기");
			break;
		}
		case 14: {

			System.out.print("약속");
			break;
		}
		case 15: {

			System.out.print("노래방가기");
			break;
		}
		case 16: {

			System.out.print("영화보기");
			break;
		}
		case 17: {

			System.out.print("카페가기");
			break;
		}
		case 18: {

			System.out.print("식사하기");
			break;
		}

		default:
			System.out.print("멍때리기");
		}
	}

}
