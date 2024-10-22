package chapter06;

public class BuyCoffee {

	public static void main(String[] args) {
		//고객 2명 생성 (Kim 12000, Park 10000)
		
		Customer Kim = new Customer("Kim", 12000);
		Customer Park = new Customer("Park", 10000);
		
		//카페(힘이 나는 커피)
		Cafe cafe = new Cafe("힘이 나는 커피");
		
		//카페 방분(힘이나는 커피 kim  4000/pak 4500 )
		
		Kim.visitCafe(cafe, 4500);
		Park.visitCafe(cafe, 4000);
		
		cafe.showInfo();
		
		Kim.showInfo();
		Park.showInfo();
		
		
		
	}

}
