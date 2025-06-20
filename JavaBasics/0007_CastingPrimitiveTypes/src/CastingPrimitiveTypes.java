 /*******************************************************
  *  
  *  Author: Mr. Flowers
  *  Description: How to Cast Primitive Types
  *  Date: 6.19.2025
  * 
  ******************************************************/
public class CastingPrimitiveTypes {

	/* Casting a value is the process of converting a value of one type 
	* to a value of another type.
	*/
	
	public static void main(String [] args)
	{
		/* Casting a value is the process of converting a value of one type 
		 * to a value of another type. Generally you do not need to to use
		 * any explicitly casting notation when you assign a smaller type primitive to 
		 * a large type primitive
		 */
		int some_integer;
		byte some_byte = 100;
		
		some_integer = some_byte;
		
		/* To perform explicit casting, you simply group the type of the
		 * target variable within parenthesis such as (float)
		 */
		
		float result;
		double starting_value = 0.123456789;
		
		result = (float) starting_value;
		
	}
}
