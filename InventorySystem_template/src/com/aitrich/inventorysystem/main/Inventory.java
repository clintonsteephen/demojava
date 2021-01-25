package com.aitrich.inventorysystem.main;

import com.aitrich.inventorysystem.data.CustomerDataAccessObject;
import com.aitrich.inventorysystem.data.DataAccessObject;
import com.aitrich.inventorysystem.data.FileDataAccessObject;
import com.aitrich.inventorysystem.data.ItemDataAccessObject;
import com.aitrich.inventorysystem.domain.Customer;
import com.aitrich.inventorysystem.domain.Item;
import com.aitrich.inventorysystem.read.CustomerRead;
import com.aitrich.inventorysystem.read.ItemRead;
import com.aitrich.inventorysystem.services.CustomerService;
import com.aitrich.inventorysystem.services.ItemService;

public class Inventory {
	public static void main(String[] args)  {
		
		
		CustomerRead custread =new CustomerRead();
		/*custread.buildCustomer();*/
		Customer cust1=custread.buildCustomer();
		FileDataAccessObject obj1=new CustomerDataAccessObject("Files\\customerfile.txt");
		//DataAccessObject dao= obj1;
		CustomerService obj =new CustomerService(obj1);
		obj.addCustomer(cust1);
		
		
		ItemRead itemreadobj =new ItemRead();
		Item item1=itemreadobj.buildItem();
		FileDataAccessObject obj2=new ItemDataAccessObject("Files\\itemfile.txt");
		ItemService obj11= new ItemService(obj2);
		obj11.addItem(item1);
		
		CustomerService csobj =new CustomerService(null);
		
			csobj.showCustomer();
			ItemService itobj=new ItemService(null);
			itobj.showItem();
		
	
		 
	}
}
