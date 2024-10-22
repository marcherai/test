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
		return this; //자기 자신의 주소를 반환
	}

}
