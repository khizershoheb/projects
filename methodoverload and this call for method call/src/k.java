
public class k {
void Add(int a, int b) {
	System.out.println(a+"+"+b);
	System.out.println(a+b);
	double n=this.Add(10, 10.3, 10);
System.out.println(n);	
}
double Add(int a, double b, int c) {
	return c+a+b;
}
k(int a,int b){
	System.out.println(a+b);
}
public static void main(String[] args) {
		k obj=new k(3,4);
	obj.Add(8,13);
	double m=obj.Add(1,1.3,1);
	System.out.println(m);
	}
}
