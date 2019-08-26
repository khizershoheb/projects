package testforMethodOrContructor;

public class apple {
int a=4;
       apple(int x){
	System.out.println("parameter contructor entry ");
	}	

	public static void main(String[] args) {
apple c= new apple(50);
System.out.println(c.a);
	}

}
