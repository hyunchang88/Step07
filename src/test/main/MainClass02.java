package test.main;

import test.mypac.AttackUnit;

public class MainClass02 {
	public static void main(String[] args) {
		// AttackUnit 객체를 생성해서 attack() 메소드를 호출해 보세요.
		new AttackUnit().attack();
		new AttackUnit(100).attack();
		
		AttackUnit a = new AttackUnit();
		a.attack();
		a.attack();
		
	}
}
