package test.main;

import test.mypac.Person;

public class MainClass05 {
	public static void main(String[] args) {
		// 생성자를 하나라도 정의하면 default 생성자는 없어진다.
		// default 생성자를 호출하면서 객체생성은 불가하다.
		// new Person();  -> 이거 불가
		
		// Person 객체를 3개 생성해서 참조값을 각각 변수에 담아 보세요.
		Person person1 = new Person(27, 49.5, "해골");
		Person person2 = new Person(28, 73.6, "구라");
		Person person3 = new Person(29, 80.2, "원숭이");
		
		person1.showInfo();
		person2.showInfo();
		person3.showInfo();
	}
}
