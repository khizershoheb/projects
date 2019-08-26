package package1;
import package2.*;


public class Sum{


	protected int[] add(Main[] arr1) {
		int[] arr2=new int[arr1.length];
		for (int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i].a+arr1[i].b;
		}
		return arr2 ;
	}
}
