
public class statictest {
static int i=4;
int  c,d;
 int test() {
	return ++i;
}
 static int add1(int a, int b) {
	 int z=a+b;
	 statictest2.main(null);
	 return z;
 }
 int add2 (int a,int b) {
	int z=add1(c=a,d=b); 
	 return z;
 }
}
