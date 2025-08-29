 /*******************************************************
  *  
  *  Author: Mr. Flowers
  *  Description: Chaining Multiple Assignment Operators
  *  Date: 8.28.2025
  * 
  ******************************************************/
public class ChainingMultipleAssignmentOperators {
	
	public static void main(String [] args)
	{
		int a, b, c, d;
		
		long x, y;
		
		// Java evaluates the right hand side of the expression
		// first. Consequently, you can chain a series of 
		// expression together
		x = y = a = b = c = d = 5;
		
		System.out.println(x);
		
	}
}
