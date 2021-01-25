package com.aitrich.inventorysystem.services;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.aitrich.inventorysystem.data.CustomerDataAccessObject;
import com.aitrich.inventorysystem.data.DataAccessObject;
import com.aitrich.inventorysystem.data.FileDataAccessObject;
import com.aitrich.inventorysystem.domain.Customer;
import com.aitrich.inventorysystem.domain.Item;
import com.aitrich.inventorysystem.read.CustomerRead;



public class CustomerService 

{
	Customer customer  =new Customer();
	/*// FileDataAccessObject obj1=new CustomerDataAccessObject(null);
	CustomerDataAccessObject obj3=new CustomerDataAccessObject(null);
*/
	private DataAccessObject dao;

	public CustomerService(DataAccessObject dao) {
		super();
		this.dao = dao;
	}

	 
public void addCustomer(Customer customer){
	
	dao.insert(customer);
	
	
	System.out.println(customer);
	 	
	}
	 
	 
	public Customer[] findAllCustomers() 
	{
		//create a list and add all customer list by calling
		 
		dao.findAll();
	
		return null;
	}
	
	// method to list customer name start with s
	public void showCustomer() 
		  { 
		  try{
		  File file = new File("Files\\customerfile.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		  {
		 
			  // System.out.println(st); 
		  
		  
		  String[] arrOfStr = st.split(",");
		 // customer.setCustomerName(arrOfStr[1]);
		  
		  if(arrOfStr[1].startsWith("s"))
		  {
			  System.out.println(arrOfStr[1]);
		  }
		  }
			 
		  }
		  catch (Exception e){
			 System.out.print(""); 
		  }
		  finally
	        { 
	            System.out.println(""); 
	        } 
	
		
	}
}

