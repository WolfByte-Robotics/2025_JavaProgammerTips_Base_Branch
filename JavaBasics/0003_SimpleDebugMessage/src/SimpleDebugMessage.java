/******************************************************
 * 
 *  Author: Mr. Flowers
 *  Description: Program to Show Simple Debug Message
 *  Date: 6.14.2025
 * 
 ******************************************************/
public class SimpleDebugMessage {

	/* One way to detect errors in your code is to display
	 * the values of variables at different locations in
	 * your program. To do so, can use System.out.prinln
	 * method. The plus (+) used within println is a
	 * concatenation operator that combines text with values
	 */
	public static void main(String [] arg)
	{
		int x = 5;
		int y = 1;
		System.out.println("Debug: x=" + x + " y=" + y);
	}
}
