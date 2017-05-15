package test.main;

import test.mypac.Person;

public class MainClass05 {
	public static void main(String[] args) {
		// Person 객체를 3개 생성해서 참조값을 각각 변수에 담아 보세요.
		Person person1 = new Person(27, 49.5, "해골");
		Person person2 = new Person(28, 73.6, "구라");
		Person person3 = new Person(29, 80.2, "원숭이");
		
		person1.showInfo();
		person2.showInfo();
		person3.showInfo();
	}
}
