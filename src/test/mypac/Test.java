package test.mypac;

public class Test {

	public String msg;
	
	public static int age;
	public static double weight;
	public static String name;
	
	public static void showInfo(){
		System.out.println(Test.age);
		System.out.println(Test.weight);
		System.out.println(Test.name);
		
		// static 멤버 메소드 안에서는 static 멤버들만 접근 가능하다.
		// System.out.println(this.msg); 이건 성립 불가
	}
}
