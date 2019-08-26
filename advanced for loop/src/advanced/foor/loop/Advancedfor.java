package advanced.foor.loop;

import java.util.Scanner;

public class Advancedfor {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int percentage[]=new int[m];
for (int i=0;i<m;i++) {
	percentage[i]=sc.nextInt();
}
int i=1;
int per[]=percentage;
for(int rollno:per) {
	System.out.println(i++);
	System.out.println(+rollno);
	if(rollno<35)
		System.out.println("F");
	else if(rollno<60)
		System.out.println("B");
	else
		System.out.println("A");
		
}
	}

}
