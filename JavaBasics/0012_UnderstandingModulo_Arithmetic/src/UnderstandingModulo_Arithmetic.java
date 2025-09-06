 /*******************************************************
  *  
  *  Author: Mr. Flowers
  *  Description: Understanding Modulo Arithmetic
  *  Date: 9.05.2025
  * 
  ******************************************************/
public class UnderstandingModulo_Arithmetic {
	public static void main(String [] args)
	{
		int integer_part, remainder;
		
		// If you perform a division operation using integer operands,
		// Java will return an integer result and will drop the fractional remainder
	
		integer_part = 10 / 3;  // result is a 3;
		System.out.println("The result truncated as an integer: " + integer_part);
		
		// To determine the remainder of an integer division, you use the 
		// modulus operator %
		
		remainder = 10 % 3; 	// result in a 1
		System.out.println("The result as a remainder: " + remainder);
		
	}
}
