 /*******************************************************
  *  
  *  Author: Mr. Flowers
  *  Description: Understanding Java Increments
  *  Date: 9.05.2025
  * 
  ******************************************************/
public class UnderstandingJavaIncrements {
	
	public static void main (String [] args)
	{
		
		int number = 7;
		number = number + 1;  // number is now 8
		System.out.println("Number: " + number);
		number += 1;          // number is now 9
		System.out.println("Number: " + number);

		int count_up = 100;
		count_up++;           // count up is now 101
		System.out.println("Count Up: " + count_up);
		
		float ratio = 100.95f;
		ratio++;              // ratio is now 101.95
		System.out.println("Ratio: " + ratio);
		
		
	}

}
