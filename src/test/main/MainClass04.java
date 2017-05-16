package test.main;

import test.mypac.Computer;
import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.Memory;

public class MainClass04 {
	public static void main(String[] args) {
		// default 생성자가 없을때 Computer 호출
		new Computer(new Cpu(),new Memory(),new HardDisk());
		
		Cpu a = new Cpu();
		Memory b = new Memory();
		HardDisk c = new HardDisk();
		// 변수에 담긴 값을 이용해서 Computer 객체를 생성해 보세요.
		Computer com1 = new Computer(a,b,c);
		
		// 경우에 따라서는 null 값을 전달해서 객체를 생성할수도 있다.
		Computer com2 = new Computer(null, null, null);
		
	}
}
