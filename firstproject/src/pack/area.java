 package pack;

import java.util.Scanner;

public class area {

	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	double a= sc.nextDouble();
	double b= sc.nextDouble();
	double c= sc.nextDouble();
	double e= sc.nextDouble();
	mul(a,b,c,e);
	}
public static void mul(double a, double b, double c, double e)
{
	double openarea=a*b-c*e;
System.out.println(+openarea);
}
}
