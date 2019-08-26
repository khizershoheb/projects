package arrayIntergerReplacing;

public class ArrayOperations {
public static int isElementFound(int[] a){
int i;
int c=0;
for(i=0;i<a.length;i++) {
	
	if(a[i]==30) {
	 c=i;
	 break;
	}
	else 
		c=-1;
}	
		return c;
}
public int elementReplace(int position, int[] number) {
	number[position]=35;
	return 0;
}
}
