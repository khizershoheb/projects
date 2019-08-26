package emailiddomaincheck;

public class Soluton {
public static void main(String[] a) {
	Customer e1=new Customer();
	Customer e2=new Customer();
e1.a="lmnxyz000@gmal.com";
e2.a="khizershoheb01@gmail.com";
checkEmail(e1.a,e2.a,"gmail");
}
static void checkEmail(String a, String b, String c) {
int index1=a.indexOf("@");
int length1=a.length();
int length2=b.length();
int index2=b.indexOf("@");
String comp1=a.substring(index1,length1);
String comp2=b.substring(index2,length2);
String comp3="@"+c+".com";
if(comp1.equals(comp3) && comp2.equals(comp3)) {
	System.out.println(true);
	}
else {
	System.out.println(false);
}
}
}
