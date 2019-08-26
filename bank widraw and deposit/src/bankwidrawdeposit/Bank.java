package bankwidrawdeposit;

public class Bank {
	static int counter=0;
	static String Bankname="ABCD";
	
 int accountid;
 float accountbal;
  Bank() {
	 System.out.println("indside constructor");
	 System.out.println(counter);
 }
 
public Bank(float accountbal){
	 counter=counter+1;
	accountid=counter;
	 this.accountbal=accountbal;
 }
 public void depositAmount(int depositAmount) {
	 accountbal=accountbal+depositAmount;
 }
public void withdrawAmount(int withdrawAmount) {
	accountbal=accountbal-withdrawAmount;
}
 void display() {
	 System.out.println(accountid);
	 System.out.println(accountbal);
	 System.out.println(Bankname);
 }

 }
