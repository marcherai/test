package chapter06;

public class AccessTest {

	// �ʹ����� = �ʵ�

	private int aa; // ���� Ŭ���������� ��� ����
	public int bb; // ���� ������ ����(�ٸ� Ŭ���������� ��밡��)
	int cc; // public ����

	// ����Ʈ ������

	// �޼���
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void Disp() {
		System.out.println("aa��: " + aa + " bb��: " + bb + " cc��: " + cc);
	}

	public static void main(String[] args) {

		AccessTest obj = new AccessTest();

		// aa �ʱ�ȭ ���
		//obj.aa = 10 ;
		//System.out.println("aa = 10 ->"+obj.aa);
		obj.setAa(20);
		System.out.println("setAa(20) -> "+obj.aa);
		
		System.out.println("===============");
		obj.bb = 20;
		System.out.println("bb = 20 -> "+obj.bb);
		obj.setBb(30);
		System.out.println("setBb(30) -> "+obj.bb);
		
		System.out.println("===============");
		obj.cc = 30;
		System.out.println("bb = 30 -> "+obj.cc);
		obj.setCc(40);
		System.out.println("setBb(40) -> "+obj.cc);
		
		obj.Disp();
		
	}

}
