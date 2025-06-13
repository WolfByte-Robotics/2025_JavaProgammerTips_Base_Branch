/***************************************************
 * 
 *  Author: Mr. Flowers
 *  Description: Program to Understand Main Method
 *  Date: 6.13.2025
 * 
 ***************************************************/
public class PrintArgs {
	/* The main method is the first code in the 
	 * application to be executed
	 * 
	 * The following Java Application uses a for loop
	 * to display each of its command-lien arguments to the
	 * console window
	 */
	public static void main(String [] args)
	{
		for(int index = 0; index < args.length; index++)
		{
			System.out.println("Arg #" + index + "->" + args[index]);
		}
			
	}
}
