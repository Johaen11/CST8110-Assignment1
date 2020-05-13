
/* CST8110 - Introduction to Computer Programming
 * Section: 451
 * Semester: 2020S
 * Professor: Piyush Jangam
 * Student ID: 040988707
 * Student Email: gnan0009@algonquinlive.com
 * Assignment 1
 */

// The purpose of this class is to learn about Java algebraic operators,
// variables, and the printf method. 
public class Assignment1 {

    public static void main(String[] args) {
	
	    // Declare a variable of type String named prefix, and assign
	   // it a value of "Student ID:". 
           // i.e. String prefix = "Student ID:"
	             
    	        String prefix = "Student ID:";
	
	    // Declare a variable of type int named studentID.
                    int studentID;
		
        	// Assign the numeric value of your Algonquin Student ID to the 
		// variable studentID after taking out the preceding 0.
	 	//i.e. int studentID = 40000009
		             studentID = 40988707;
		              
		// Declare a variable of type int named idRemainder.
		
		               int idRemainder;
		/* Modulus division returns the remainder of a division operation.
		 * Example: 5 mod 2 = 1
		 * Using the Java modulus division operator ( % ), find the final 
		 * value of the studentID variable.
                 *Use variable studentID as numerator and 10 as denominator for mod function
                 * Assign the result of the above algebra equation to the idRemainder
		 * variable.
		 * i.e. idRemainder = studentID % 10
		 */
		       idRemainder = studentID % 10;
		
		// Using the printf method print your studentID formatted as follows:
		// - left-padded with leading zeros, so that it is 18 digits wide
		// - ending with a newline character
		
    	      System.out.printf("0000000000%s\n", studentID);
		
		
		// Using the printf method print the result of adding the idRemainder
		// variable to your studentID formatted as follows:
		// - right-aligned in a column that is 18 characters wide
		// - ending with a newline character
	         System.out.printf("%18s\n", idRemainder + studentID );
	
	        // Using the printf method print the prefix and the result of 
		// subtracting the idRemainder value from studentID.
		// Ensure there is a space between the prefix and the numeric value.
        		int result = studentID - idRemainder;
        	System.out.printf("%s%10d", prefix, result);
	
	
	} // end method main

} // end class Assignment1
