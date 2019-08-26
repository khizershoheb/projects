
public class ConsMethod {
	
	public ConsMethod(){
		System.out.println("inside default constructor");
	}
	public ConsMethod(int a){
		System.out.println("inside papametre constructor");
	}
void sample() {
	System.out.println("inside method");
}
	public static void main(String[] args) {
		
ConsMethod p=new ConsMethod();
ConsMethod q=new ConsMethod(5);
p.sample();
q.sample();

	}

}
