package chapter03.switchtest;

public class SwitchCase06 {

	public static void main(String[] args) {

		int time = (int) (Math.random() * 10) + 9;
		System.out.println("[����ð�: " + time + "��]");
		System.out.print("���� : ");
		switch (time) {
		case 9: {

			System.out.print("������ ��å");
			break;
		}
		case 10: {

			System.out.print("�����ϱ�");
			break;
		}
		case 11: {

			System.out.print("���� �غ�");
			break;
		}
		case 12: {

			System.out.print("���� �Ļ�");
			break;
		}
		case 13: {

			System.out.print("TV����");
			break;
		}
		case 14: {

			System.out.print("���");
			break;
		}
		case 15: {

			System.out.print("�뷡�氡��");
			break;
		}
		case 16: {

			System.out.print("��ȭ����");
			break;
		}
		case 17: {

			System.out.print("ī�䰡��");
			break;
		}
		case 18: {

			System.out.print("�Ļ��ϱ�");
			break;
		}

		default:
			System.out.print("�۶�����");
		}
	}

}
