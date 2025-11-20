package labrarySimulation;
/*
 * Project Phase #2
 * * Group Members:
 * 1. Ahmed Abdullah Al-Musallam - ID: 446104786
 * 2. Abdullah Khalil Abu Nadi  - ID:  446103718
 * 3. Mohammed Saad Al-Rajhi    - ID: 446104643
 * * GitHub Repository: https://github.com/ANGAL123256/labrarySimulation
 */
public class Member {
	
	
	private int id;
	private String name;
    private int borrowedCount;
	private int numViewBorrowed;
	private int numBorrows;
	private int numReturns;
	private double sessionFees;
	public static double TotalRevenue;
	public static int TotalViewBorrowed;
	public static int TotalBorrows;
	public static int TotalReturns;
	
	
	

	public  Member(int id ,String name,int borrowedCount) {
		this.id=id;
		this.name= name;
		this.borrowedCount=borrowedCount;
		
		
	}
	
	private boolean canBorrow() {
		return borrowedCount<5; 
	}
	private boolean canReturn() {
		return borrowedCount>1;
	}
	public void viewBorrowedCount() {
		numViewBorrowed++;
		TotalViewBorrowed++;
        System.out.println("Books currently borrowed: " + borrowedCount);  	
	}
	
    public boolean borrowOne() {
    	
    	if(!canBorrow()) {
    		System.out.println("You can't borrow more than 5 book.");
    	return false;
    	}
    	numBorrows++;
    	borrowedCount++;
    	TotalBorrows++;
    	sessionFees+=0.5;
    	TotalRevenue+=0.5;
    	
    	System.out.printf("Book borrowed successfully. Fee: %.2f\\n\"",0.5);
    	
    	return true;
    	
    }
    public boolean returnOne() {  
        if (!canReturn()) {  
            System.out.println("You have no books to return. ");  
            return false;  
        } 
        
        numReturns++;  
        
        borrowedCount--;  
        TotalReturns++;  
        System.out.println("Book returned successfully. ");  
        return true;  
    }  
	
    
    public void displayStatistics() {
    	
    	System.out.println("Session Summary for "+name+". ID: "+id+" .");
    	System.out.println("Books Returned "+numReturns);
    	System.out.println("Books Borrowed "+numBorrows);
    	System.out.println("Times View Borrowed Count used "+numViewBorrowed) ;
    	System.out.printf("Fees Incurred (this session): %.2f\n", sessionFees);

    }
	
    public void reset() {  
          
        this.numBorrows = 0;  
        this.numViewBorrowed = 0;
        this.numReturns = 0;  
        this.sessionFees = 0.0;  
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBorrowedCount() {
		return borrowedCount;
	}

	public void setBorrowedCount(int borrowedCount) {
		this.borrowedCount = borrowedCount;
	}

	public double getSessionFees() {
		return sessionFees;
	}

	public void setSessionFees(double sessionFees) {
		this.sessionFees = sessionFees;
	}  
	
	
}
