package com.aitrich.inventorysystem.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.aitrich.inventorysystem.domain.Customer;

public abstract class FileDataAccessObject implements DataAccessObject{
	FileWriter fw;
	FileReader fr;
	BufferedWriter writeToFile;
	BufferedReader readFromFile;
	BufferedReader read;
	private String persistenceFilePath;
	
	Object[] data;
	
	public FileDataAccessObject(String persistenceFilePath) {
		super();
		this.persistenceFilePath = persistenceFilePath;
	}
	public String getPersistenceFilePath() {
		return persistenceFilePath;
	}
	public void setPersistenceFilePath(String persistenceFilePath) {
		this.persistenceFilePath = persistenceFilePath;
	}
	
	@Override
	public void insert(Object object) {
		
		
		try
		{
		
		 System.out.println(object);
		
		 String two = objectToCSVRecord(object);
		 //file write 
		 
		  // Creates a FileWriter
	      FileWriter file = new FileWriter(persistenceFilePath);

	      // Creates a BufferedWriter
	      BufferedWriter output = new BufferedWriter(file);

	      // Writes the string to the file
	      output.write(two);

	      // Closes the writer 
	      output.close();
	    }
                     
	    catch (Exception e)
	    {
	      e.getStackTrace();
	    }
		
		
}	 

		
	
	@Override
	public Object[] findAll() {
		
		
		int j=0;
		//read all records from file
		
		File file = new File(persistenceFilePath); 
		  try{
			  
			 
			  
			  BufferedReader br = new BufferedReader(new FileReader(file)); 
			  String st; 
			  Object data[]=new Object [50];  //creating array of objects
			  while ((st = br.readLine()) != null) 
			  {
				 Object obj= csvRecordToObject(st);
				 
				data[j]=obj;
				 j++;
				 
				 System.out.println( "hello" +obj);
			    
			    
			  }
			  
		  }
		 catch(Exception Ae){
			 
			 Ae.printStackTrace();
			 
		 }
		  
		  return data;
		  
		  
	}

	protected abstract String objectToCSVRecord(Object object);

	protected abstract Object csvRecordToObject(String cvsRecord);
}
