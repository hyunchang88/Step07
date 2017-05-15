package test.mypac;

public class Computer {
	public Cpu cpu;
	public Memory memory;
	public HardDisk hardDisk;
	
	// Cpu, Memory, HardDisk type 데이터를 전달 받는 생성자 정의!
	public Computer(Cpu cpu, Memory memoery, HardDisk hardDisk){
		this.cpu=cpu;
		this.memory=memoery;
		this.hardDisk=hardDisk;
	}
	
	// 생성자를 하나라도 정의 하면 default 생성자는 있다라고 간주되지 않아.
	// 명시적으로 default 생성자를 적어줘야해.
	// default 생성자가 없으면 MainClass 에서 new Computer(); 이렇게 못해
	// MainClass에서
	// new Computer(new Cpu(),new Memory(),new HardDisk()); 이렇게 해 줘야해
	
}
