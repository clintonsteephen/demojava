package com.aitrich.inventorysystem.services;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.aitrich.inventorysystem.data.DataAccessObject;
import com.aitrich.inventorysystem.domain.Item;
public class ItemService
{
	private DataAccessObject dao;
	
	
	public ItemService(DataAccessObject dao) {
		super();
		this.dao = dao;
	}

	public void addItem(Item item){
	 	
		dao.insert(item);
		
	}
	
	public Item[] findAllItem() {
		//create a list and add all item list by calling
		
		dao.findAll();
		
		 
		return null;
	}
	public void showItem()
	{
		try{
			  File file = new File("Files\\itemfile.txt"); 
			  
			  BufferedReader br = new BufferedReader(new FileReader(file)); 
			  
			  String st; 
			  while ((st = br.readLine()) != null) 
			  {
			 
				  // System.out.println(st); 
			  
			  
			  String[] arrOfStr = st.split(",");
			 // customer.setCustomerName(arrOfStr[1]);
			  
			  int price=Integer.parseInt(arrOfStr[2]);
			  System.out.println(price);
			  
			  if(price>150)
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
