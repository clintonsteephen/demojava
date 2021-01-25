package com.aitrich.inventorysystem.data;

import com.aitrich.inventorysystem.domain.Customer;
import com.aitrich.inventorysystem.domain.Item;

public class ItemDataAccessObject extends FileDataAccessObject{
	 
	
	 
	public ItemDataAccessObject(String persistenceFilePath) {
		super(persistenceFilePath);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected String objectToCSVRecord(Object object) {
		//convert objet to customer and make a csv record
		StringBuilder str = new StringBuilder();
		str.append(((Item) object).getItemno());
		str.append(",");
		str.append(((Item) object).getItemName());
		str.append(",");
		str.append(((Item) object).getUnitPrice());
		str.append(",");
    	String one=str.toString();
    	return one;
		
		 
	}
	@Override
	protected Object csvRecordToObject(String cvsRecord) {
		//create a customer object from csvrecord
		 
         String[] arrOfStr = cvsRecord.split(",");
		 Item item =new Item();
		 item.setItemno(Integer.parseInt(arrOfStr[0]));
		 item.setItemName(arrOfStr[1]);
		 item.setUnitPrice(arrOfStr[2]);
		 return item;
		
	}
}
