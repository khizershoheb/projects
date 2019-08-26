package employee.array;

public class Solution{
	   public static void main(String[] a){
	    Employee e1=new Employee(1,"aaa",22);
	    Employee e2=new Employee(2,"bbb",33);
	    Employee e3=new Employee(3,"ccc",55);
	    Employee e4=new Employee(4,"ddd",44);
	    Employee[] e=new Employee[4];
	    e[0]=e1;
	    e[1]=e2;
	    e[2]=e3;
	    e[3]=e4;
	    Employee e5=employeeWithSecondLowestAge(e);
	    System.out.print(e5.getId()+" "+e5.getName()+" "+e5.getAge());
	  }
	 static Employee employeeWithSecondLowestAge(Employee[] e){
		 Employee temp;
		  for(int i=0;i<e.length-1;i++) {
			  for(int j=i+1;j<e.length;j++) {
				  if(e[i].getAge()>e[j].getAge()) {
					  temp=e[i];
					  e[i]=e[j];
					  e[j]=temp;
				  }  
			  }
		  }
		  
	  return e[1];}
	}

