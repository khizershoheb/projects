package arrays;
import java.util.Scanner;
public class Twod {

	public static void main(String[] args) {
		int j,i,m,n,k=0;
		
	Scanner input=new Scanner(System.in);
	m=input.nextInt();
	n=input.nextInt();
	int[][] a=new int[m][n];
	for(i=0;i<m;i++)
		for(j=0;j<n;j++) {
			a[i][j]=k;k++;}
	
	for(i=0;i<m;i++) {
		for(j=0;j<n;j++) {
			System.out.println(a[i][j]);}
	System.out.println( );}
	
	

	}

}
