package chapter07;

public class Person {

	String name;
	int age;
	
	public Person() {
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Person returnSelf() {
		return this; //�ڱ� �ڽ��� �ּҸ� ��ȯ
	}

}
