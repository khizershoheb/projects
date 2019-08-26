package setgetproject;

public class initial {
	private static int x;
	private  String y;
	initial(int k){
		System.out.println("contructor");
	}
public static void getx(int a)
{
x=a;
}
public void gety(String b)
{
	y=b;
}
public int setx()
{
 return x;
}
public String sety()
{
	return y;
}
}
