package bankwidrawdeposit;

public class Jain {
public static void main(String[] a) {
	Bank acc1=new Bank(5500.00f  );
	acc1.depositAmount(1000);
	acc1.withdrawAmount(1500);
	acc1.display();
	Bank acc2 =new Bank(6500.00f);
	acc2.display();

}
}
