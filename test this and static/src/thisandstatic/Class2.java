package thisandstatic;

public class Class2 {
public static void main(String[] a) {
Class1 b = new Class1();
Class1 c = new Class1();
Class1 d = new Class1();
Class1 e = new Class1();
b.method();
b.k=5;
c.method();
d.method();
e.method();
System.out.println(e.k);
}}