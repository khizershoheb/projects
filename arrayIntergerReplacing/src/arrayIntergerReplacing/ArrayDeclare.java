package arrayIntergerReplacing;

public class ArrayDeclare {

	public static void main(String[] args) {
		int[] numbers=new int[] {10,20,30,40,50};
		int position=ArrayOperations.isElementFound(numbers);
		if(position>=0) {
	System.out.println("30 is found at"+(position+1));
	ArrayOperations obj=new ArrayOperations();
	obj.elementReplace(position,numbers);
	for(int i=0;i<numbers.length;i++)
	System.out.println(numbers[i]);
	}
		else
			System.out.println("not found");
	}}
