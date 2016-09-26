package in.ac.kletech.Customer;

public abstract class Customer {
	private int iCustomerID;
	private String iCustomerName;
	private long lPhoneNo;
	public float fBillAmt;

	public int getiCustomerID() {
		return iCustomerID;
	}

	public String getiCustomerName() {
		return iCustomerName;
	}

	public long getlPhoneNo() {
		return lPhoneNo;
	}

	public float getfBillAmt() {
		return fBillAmt;
	}

	public Customer(int iCustomerID, String iCustomerName, long lPhoneNo, float fBillAmt) {
		this.iCustomerID = iCustomerID;
		this.iCustomerName = iCustomerName;
		this.lPhoneNo = lPhoneNo;
		this.fBillAmt = fBillAmt;
	}
	abstract void computeBillAmt();
	public void display(){
		System.out.println("The Customer ID:"+iCustomerID);
		System.out.println("The Customer Name:"+iCustomerName);
		System.out.println("The customer phone no:"+lPhoneNo );
	
		
	}
	
}
class RegularCustomer extends Customer
{
		private float discount;
	    
      	public float getDiscount() {
			return discount;
		}	
		public RegularCustomer(int iCustomerID, String iCustomerName, long lPhoneNo, float fBillAmt, float discount) {
			super(iCustomerID, iCustomerName, lPhoneNo, fBillAmt);
			this.discount = discount;
		}
		void computeBillAmt() 
		{
			fBillAmt=(float) (fBillAmt-((float)fBillAmt*0.05));
			display();
			System.out.println("The customer total bill:"+fBillAmt);
        }
}
 class PrivilegedCustomer extends Customer
{
    private String membercardtype;

	public String getMembercardtype() {
		return membercardtype;
	}

	public PrivilegedCustomer(int iCustomerID, String iCustomerName, long lPhoneNo, float fBillAmt,
			String membercardtype) {
		super(iCustomerID, iCustomerName, lPhoneNo, fBillAmt);
		this.membercardtype = membercardtype;
	}
	void computeBillAmt() 
	{
		if(membercardtype.equals("GOLD")){
		fBillAmt=(float) (fBillAmt-((float)fBillAmt*0.5));
		display();
		System.out.println("The customer total bill:"+fBillAmt);
		}
		else if(membercardtype.equals("PLATINUM")){
			fBillAmt=(float) (fBillAmt-((float)fBillAmt*0.25));
			display();
			System.out.println("The customer total bill:"+fBillAmt);
		}
			else if(membercardtype.equals("SILVER")){
				fBillAmt=(float) (fBillAmt-((float)fBillAmt*0.125));
				display();
				System.out.println("The customer total bill:"+fBillAmt);
				
			}
		}
	
    }
    