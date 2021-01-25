package com.aitrich.inventorysystem.domain;



public class Customer {
	
	private int customerid;
	private String customername;
	private String customeraddress;
	private String customeremail;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	    this.customerid= 0;
		this.customername = null;
		this.customeraddress = null;
		this.customeremail=null;
		
	}
	
	
	public Customer(int customerid, String customername,
			String customeraddress, String customeremail) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customeraddress = customeraddress;
		this.customeremail = customeremail;
		
	}
	public int getCustomerId() {
		return customerid;
	}
	
	public String getCustomerName() {
		return customername;
	}
	
	
	public String getCustomerAddress() {
		return customeraddress;
	}
	public String getCustomeremail() {
		return customeremail;
	}
	
	
public void setCustomerId(int customerid) {
		
		this.customerid = customerid;
	}
    public void setCustomerName(String customername) {
		
		this.customername = customername;
	}
    
    public void setCustomerAddress(String customeraddress) {
		
		this.customeraddress = customeraddress;
	}
    
    public void setCustomeremail(String customeremail) {
		
		this.customeremail = customeremail;
	}
    @Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", customeraddress=" + customeraddress
				+ ", customeremail=" + customeremail+" ]";
	}

	 
}
