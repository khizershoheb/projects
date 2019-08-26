package check.customer.details.in.bank;

public class Main {
	public static void main(String[]a) {
		int count=0;
		Customer[] arrObj= new Customer[5];
				arrObj[0]=new Customer(1,"asif","kothagudem",123,321,"paytm");
				arrObj[1]=new Customer(2,"asif","kothagudem",963,369,"paytm");
						arrObj[2]=new Customer(3,"pavan","karimnagar",789,987,"sbi");
						arrObj[3]=new Customer(4,"pratik","nirmal",741,147,"hdfc");
						arrObj[4]=new Customer(5,"joe","kohagudem",852,258,"canada");		
	
boolean x=CustomerUtil.checkCustomrExistence(arrObj, "asif");
System.out.println(x);
if(x==true) {
count=CustomerUtil.getNoAccounts(arrObj, "asif");
System.out.println(count);
}

if(count>1) {
	int z= CustomerUtil.knowCustomerid(arrObj,"asif",7);
	System.out.println(z);
int status=CustomerUtil.getCustomerid(arrObj,5,8);

if(status==1)
	System.out.println("customer id updated");


int[] k=CustomerUtil.getaccountnumbers(arrObj, "asif");
for(int i=0;i<k.length;i++)
{
	if(k[i]!=0)
System.out.println(k[i]);
}
}
}
}