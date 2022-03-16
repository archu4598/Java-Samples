package com.learning.pavi;

public class Books {
	public int pageNumber;
	public String bookName;
	
	public void read() {
		System.out.println("Book Name "+ bookName + " pageNumber"+ pageNumber);
	}

	public static void main(String[] args) {
		
		Books ramayanam = new Books();
	    Books mahabaratham = new Books();
	    
	    
	    ramayanam.pageNumber = 2;
	    ramayanam.bookName = "ramayana";
	    mahabaratham.pageNumber = 3;
//	    mahabaratham.bookName = "Mahabaratham";
	    ramayanam.bookName = "ram";
	    
	    ramayanam.read();
	    mahabaratham.read();
	}
	
}
