package program;

import java.util.Arrays;

public class Arraycheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = { 30, 25, 40, 23 }; 
		  
	        int b[] = { 30, 26, 40 }; 
	  
	      
	        boolean result = Arrays.equals(a, b); 
	  
	  
	        if (result == true) { 
	       
	            System.out.println("Two arrays are equal"); 
	        } 
	        else { 
	        
	            System.out.println("Two arrays are not equal"); 
	        } 
	    } 
	
		

	}

}
