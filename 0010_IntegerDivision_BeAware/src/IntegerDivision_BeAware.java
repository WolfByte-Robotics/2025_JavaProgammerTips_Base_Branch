 /*******************************************************
  *  
  *  Author: Mr. Flowers
  *  Description: Be Aware of Integer Division
  *  Date: 8.28.2025
  * 
  ******************************************************/
public class IntegerDivision_BeAware {

	public static void main (String [] args)
	{
		float answer_1;
		
		// if you perform a division operation with 
		// integer operands, the result is an integer
		answer_1 = 10 / 3; // result is 3.0
		System.out.println(answer_1);
		
		float answer_2;
		
		// To return a floating point value from a division operation,
		// you must make sure the operands are type float or double
		answer_2 = 10f / 4f; // result in a 2.5
		System.out.println(answer_2);
		
		
	}
}
