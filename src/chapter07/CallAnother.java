package chapter07;

public class CallAnother {

	public static void main(String[] args) {

		Person noName = new Person();

		System.out.println(noName.name);
		System.out.println(noName.age);

		System.out.println("noName�� �ּ�: " + noName);
		System.out.println("noName�� �ּ�: " + noName.returnSelf());

		System.out.println("--------------------------------------- ");

		Person p = new Person();
		System.out.println("P�� �ּ�: " + p);
		System.out.println("P�� �ּ�: " + p.returnSelf());

		System.out.println("--------------------------------------- ");

		Person person = noName.returnSelf();
		System.out.println("person�� �ּ�: " + person);
		System.out.println("noName�� �ּ�: " + noName);

	}

}