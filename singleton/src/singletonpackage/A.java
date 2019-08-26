package singletonpackage;

public class A {
	static int c=4;
	private A() {
		
	}
	public void display() {
		System.out.println("it is successfull");
	}
	public static A K() {	
		
		if(c==4)
			System.out.println("creating object");;
		
			return new A();
	}
	}


