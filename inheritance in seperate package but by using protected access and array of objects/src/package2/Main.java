package package2;
import package1.*;

public class Main extends Sum{
	public int a,b;

public Main(int a,int b) {
	this.a=a;
	this.b=b;
}

	public static void main(String[] args) {
	Main obj1=new Main(1,2);
	Main obj2=new Main(3,4);
	Main obj3=new Main(5,6);
	Main obj4=new Main(7,8);
	Main[] arr1= {obj1,obj2,obj3,obj4};
	int[] arr2=obj1.add(arr1);
	for (int i=0;i<arr2.length;i++) {
		System.out.println(arr2[i]);
	}

	}
	

}
