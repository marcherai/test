package chapter06;

public class TeamMain {

	public static void main(String[] args) {

		TeamGroup team = new TeamGroup();
		
		//Scanner scan = new Scanner(System.in);

		team.init(); // 팀원 정보 입력
		team.Disp(); // 팀원 정보 출력

		System.out.println("");
		TeamMember t = new TeamMember();
		t.setName("최재현");
		System.out.println("팀장 이름: " + t.getName());
		t.setmPhone("010-1234-5678");
		System.out.println("팀장 전화번호: " + t.getmPhone());
		t.setsName("허정욱");
		System.out.println("부팀장 전화번호: " + t.getsName());

		
		//System.out.println("성별 입력");
		//t.gender = scan.nextLine();
		
		//System.out.println(t.gender);
		
		
	}

}
