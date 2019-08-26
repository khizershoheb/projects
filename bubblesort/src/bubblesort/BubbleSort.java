package bubblesort;

public class BubbleSort {
	static int j=1;
	public static void main(String[] args) {
		 
		int[] a=new int[] {60,80,55,78,26,48,90};
	        a=bubblesort(a);
for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
	}
public static int[] bubblesort(int[] a) {
	for(int i=0;i<=a.length-2;i++) {
		for(int j=i+1;j<=a.length-1;j++)
		if(a[i]>a[j]) {
			int temp;
			temp=a[j];
			a[j]=a[i];
			a[i]=temp;
		
		}
	}
	return a;
}
	}
		


