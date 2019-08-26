package array.initialization;

public class Array1 {
static int k=0;
	public static void main(String[] args) {
		int a[];
		a=new int[8];
		for (int i=0;i<a.length;i++)
		{
			a[i]=k;
			k++;
			System.out.println(a[i]);
		}

	}

}
