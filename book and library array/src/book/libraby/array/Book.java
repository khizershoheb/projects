package book.libraby.array;

public class Book {

	public static void main(String[] args) {
		
		Libraby l1=new Libraby(1,"kjh");
		Libraby l7=new Libraby(1,"kjh");

		Libraby lib[]= new Libraby[]{l1,l7};
	}

}
class Libraby{
	int a;
	String k;
	public Libraby(int a, String k) {
		this.a = a;
		this.k = k;
	}
	}
