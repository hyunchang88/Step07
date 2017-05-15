package test.main;

import test.mypac.AttackUnit;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		// default 생성자를 호출해서 객체 생성
		AttackUnit unit1 = new AttackUnit();
		// int type 데이터 한개를 전달해서 객체 생성
		AttackUnit unit2 = new AttackUnit(10);
		AttackUnit unit3 = new AttackUnit(999);
		// String type 데이터를 전달해서 객체 생성
		AttackUnit unit4 = new AttackUnit("kim");
		// int type 과 String type 데이터를 전달해서 객체 생성
		AttackUnit unit5 = new AttackUnit(1000,"원숭이");
		int a = 1000;
		String b = "해골";
		AttackUnit unit6 = new AttackUnit(a, b);
	}
}
