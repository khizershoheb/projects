package student;

public class Results {

	public static void main(String[] args) {
		Student s1=new Student(01,"khizer",89f,'\u0000');
		Student s2=new Student(02,"shoheb",64f,'\u0000');
		Student s3=new Student(01,"mohd",45f,'\u0000');
		System.out.println(s1.getid()+" "+s1.getgrade());
		results(s1); 
		results(s2);
		results(s3);
		System.out.println(s1.getname()+" " +s1.getgrade()+" "+ s2.getname() +" "+s2.getgrade() +" "+s3.getname() +" "+s3.getgrade());
	}
	public static void results(Student s) {
		if(s.getscore()>=85)
			s.setgrade('A');
		
	    else if(s.getscore()>=70)
		s.setgrade('B');
		
		else if(s.getscore()>=55)
			s.setgrade('C');
			
		else
			s.setgrade('F');
	}
	}

