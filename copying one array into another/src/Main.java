
public class Main {

	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,4,5};
		int[]b=new int[10];int c=1;
		
		for (int i=0;i<b.length;i++) {
			
			
			if(i>=a.length) {
				b[i]=b[i-1]+1;
			}
			
			else {
				b[i]=a[i];
			}
		}
		for (int i=0;i<10;i++)
		System.out.println(b[i]);
		
	}
	}

