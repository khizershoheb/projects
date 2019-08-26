package buble.sort.nonprimitive;

public class Student {
	private int id;
	private String name;
	private double marks;
	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public static Student[] sorted(Student[] arrobj1) {
		Student temp;
		for(int i=0;i<arrobj1.length;i++) {
			for(int j=i+1;j<arrobj1.length;j++) {
				if(arrobj1[i].getMarks()>arrobj1[j].getMarks()) {
					temp=arrobj1[i];
					arrobj1[i]=arrobj1[j];
					arrobj1[j]=temp;
				}	
			}	}	
		return arrobj1;
	}
	

}
