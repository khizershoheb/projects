package cosliest;

public class Books2 {
	String libraryname;
	String adress;
	Books[] list;
	

	public Books2(String libraryname, String adress, Books[] list) {
		this.libraryname = libraryname;
		this.adress = adress;
		this.list = list;
	}
	 void cosliest(Books2 check){
		 String m="l";
	
		for(int i=0;i<1;i++) {
			for(int j=i+1;j<list.length;j++) {
				if(list[i].cost>=list[j].cost) {
					m=list[i].name;
				}
				else {
					m=list[j].name;
				}
			
			}}
		
	System.out.println("coslier book is"+ m);
	}
	public static void main(String[] args) {
		Books b1=new Books(20,"khizer");
		Books b2=new Books(30,"shoheb");
		Books b4=new Books(40,"asif");
		Books[] b3= {b1,b2,b4};
		Books2 l1=new Books2("gyaan","warangal",b3);
		l1.cosliest(l1);

	}


}