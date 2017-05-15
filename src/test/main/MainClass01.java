package test.main;

import test.mypac.Car;

public class MainClass01 {
	public static void main(String[] args) {
		// Car 클래스의 default 생성자 (Constructor) 호출해서 객체 생성.
		new Car();  // Constructor call 	O
					// Method call			X
		new Car().drive(); // new Car()이라는 id값을 이용해서 drive라는 메소드를 호출함.
		Car a = new Car();
		a.drive();
		a.drive();
	}
}
