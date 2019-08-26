package Cityandage;

import java.util.Scanner;

public class Solution{
  public static void main(String a[]){
    Student e1=new Student(15,"aaa","mumbai");
    Student e2=new Student(15,"bbb","mumbai");
    Student e3=new Student(15,"ccc","mumbai");
   
    Student f1=new Student();
    Student f2=new Student();
    Student f3=new Student();
      
Scanner sc=new Scanner(System.in);

f1.age=sc.nextDouble();
sc.nextLine();
f1.name=sc.nextLine();
f1.city=sc.nextLine();

f2.age=sc.nextDouble();
sc.nextLine();
f2.name=sc.nextLine();
f2.city=sc.nextLine();

f3.age=sc.nextDouble();
sc.nextLine();
f3.name=sc.nextLine();
f3.city=sc.nextLine();    


System.out.println(e1.age+e1.name+e1.city);
System.out.println(e2.age+e2.name+e2.city);
System.out.println(e3.age+e3.name+e3.city);
studentCountWithSameCityAndAge(e1,e2,e3);
studentCountWithSameCityAndAge(f1,f2,f3);
  }
public static void studentCountWithSameCityAndAge(Student e1,Student e2,Student e3){
   
    
     if((e1.age==e2.age&&e2.age==e3.age)&&(e1.city.equals(e2.city)&&e2.city.equals(e3.city))) {
    System.out.print("3");
     }
    else if((e1.age==e2.age&&e1.city.equals(e2.city))||(e1.age==e3.age&&e1.city.equals(e3.city))||(e2.age==e3.age&&e2.city.equals(e3.city))) {
     System.out.print("2"); }
     
    else {
    System.out.print("0");
    }  
}}

 
    