
public class statictest2 {

	public static void main(String[] args) {
	statictest a=new statictest();
	statictest b=new statictest();
	statictest c=new statictest();
	statictest d=new statictest();
	statictest e=new statictest();
System.out.println(a.test());
System.out.println(b.test());
System.out.println(c.test());
System.out.println(d.test());
System.out.println(e.test());
	System.out.println(statictest.i);
	System.out.println(statictest.add1(50,60));
System.out.println(a.add2(50, 60));

	}

}
