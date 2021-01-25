package com.aitrich.inventorysystem.domain;

public class Item {
	
	
	private int itemno;
	private String itemname;
	private String unitprice;
	
	
	public Item() {
		// TODO Auto-generated constructor stub
	    this.itemno= 0;
		this.itemname = null;
		this.unitprice = null;
	  }
	
	public Item(int itemno, String itemname,
			String unitprice) {
		super();
		this.itemno = itemno;
		this.itemname = itemname;
		this.unitprice = unitprice;
		
		
	}
	
	public int getItemno() {
		return itemno;
	}
	
	public String getItemName() {
		return itemname;
	}
	
	public String getUnitPrice() {
		return unitprice;
	}
	
public void setItemno(int itemno) {
		
		this.itemno = itemno;
	}

public void setItemName(String itemname) {
	
	this.itemname = itemname;
}
public void setUnitPrice(String unitprice) {
	
	this.unitprice = unitprice;
}
@Override
public String toString() {
	return "Customer [itemno=" + itemno + ", itemname=" + itemname + ", unitprice=" + unitprice +" ]";
}
	
}
