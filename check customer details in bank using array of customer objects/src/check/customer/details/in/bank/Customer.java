package check.customer.details.in.bank;

public class Customer {
private int customerId;
private String customerName;
private String customerAddress;
private int contactNumber;
private int accountNumber;
private String accountType;
public Customer(int customerId, String customerName, String customerAddress, int contactNumber, int accountNumber,
		String accountType) {
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerAddress = customerAddress;
	this.contactNumber = contactNumber;
	this.accountNumber = accountNumber;
	this.accountType = accountType;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
public int getContactNumber() {
	return contactNumber;
}
public void setContactNumber(int contactNumber) {
	this.contactNumber = contactNumber;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}

}
