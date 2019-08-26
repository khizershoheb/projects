package buble.sort.nonprimitive;

public class Arrayobject2 {
	static String a[]= {"a","b"};
	public static void main(String[] args) {
		Student s1=new Student(04,"poi",87);
		Student s2=new Student(05,"uyt",89);
		Student s3=new Student(06,"rew",55);
		Student[] arrobj={s1,s2,s3};
		Student[] arrobj2=Student.sorted(arrobj);
		for(int i=0;i<arrobj2.length;i++) {
			System.out.println(arrobj2[i].getName()+" "+arrobj2[i].getMarks() );	}
		
	ArrayObject.main(a);



	}}

