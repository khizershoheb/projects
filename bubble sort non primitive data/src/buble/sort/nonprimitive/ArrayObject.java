package buble.sort.nonprimitive;

public class ArrayObject {
	public static void main(String[] args) {
	Student[] arrobj1=new Student[3];
	arrobj1[0]= new Student(01,"khizer",82);
	arrobj1[1]= new Student(02,"khier",58.3);
	arrobj1[2]= new Student(03,"kzer",58.44);
	arrobj1=Student.sorted(arrobj1);
	for(int i=0;i<arrobj1.length;i++) {
		System.out.println(arrobj1[i].getName() +" "+arrobj1[i].getMarks() );	}
	}
}
