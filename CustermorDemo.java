package in.ac.kletech.Customer;

public class CustermorDemo {

	public static void main(String[] args) {
		RegularCustomer regularcust1=new RegularCustomer(1, "Akash malla", 9923434233l, 1000, 10);
		regularcust1.computeBillAmt();
		PrivilegedCustomer precust1=new PrivilegedCustomer(2, "Akhil Sachan", 9987946769l,5000, "GOLD");
		precust1.computeBillAmt();
		PrivilegedCustomer precust2=new PrivilegedCustomer(3, "SOMA", 99879463439l,8000, "SILVER");
		precust2.computeBillAmt();
		PrivilegedCustomer precust3=new PrivilegedCustomer(4, "RAM", 99879546439l,8000, "PLATINUM");
		precust3.computeBillAmt();
		
	}

}
