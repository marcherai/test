package chapter06;

public class BuyCoffee {

	public static void main(String[] args) {
		//�� 2�� ���� (Kim 12000, Park 10000)
		
		Customer Kim = new Customer("Kim", 12000);
		Customer Park = new Customer("Park", 10000);
		
		//ī��(���� ���� Ŀ��)
		Cafe cafe = new Cafe("���� ���� Ŀ��");
		
		//ī�� ���(���̳��� Ŀ�� kim  4000/pak 4500 )
		
		Kim.visitCafe(cafe, 4500);
		Park.visitCafe(cafe, 4000);
		
		cafe.showInfo();
		
		Kim.showInfo();
		Park.showInfo();
		
		
		
	}

}
