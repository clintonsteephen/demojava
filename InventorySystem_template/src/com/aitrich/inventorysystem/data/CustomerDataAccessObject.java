package com.aitrich.inventorysystem.data;

import com.aitrich.inventorysystem.domain.Customer;



public class CustomerDataAccessObject extends FileDataAccessObject{
	
	
	StringBuilder sb=new StringBuilder();
	public CustomerDataAccessObject(String persistenceFilePath) {
		super(persistenceFilePath);
	}
	
	Customer customer  =new Customer();
	
	@Override
	protected String objectToCSVRecord(Object object) {
		//convert object to customer and make a csv record 
		StringBuilder str = new StringBuilder();
		str.append(((Customer) object).getCustomerId());
		str.append(",");
		str.append(((Customer) object).getCustomerName());
		str.append(",");
		str.append(((Customer) object).getCustomerAddress());
		str.append(",");
		str.append(((Customer) object).getCustomeremail());
    	String one=str.toString();
    	return one;
	}
	@Override
	protected Object csvRecordToObject(String cvsRecord) {
		
		 String[] arrOfStr = cvsRecord.split(",");
		 customer.setCustomerId(Integer.parseInt(arrOfStr[0]));
		 customer.setCustomerName(arrOfStr[1]);
		 customer.setCustomerAddress(arrOfStr[2]);
		 customer.setCustomeremail(arrOfStr[3]);
		 
		 // FileDataAccessObject objstr=new CustomerDataAccessObject(null);
		 
		return customer;
	}
}
