 /*******************************************************
  *  
  *  Author: Mr. Flowers
  *  Description: Program Showing How to Use Data Literals
  *  Date: 6.19.2025
  * 
  ******************************************************/

public class UnderstandingLiterals {

	/* Literals correspond to a specific value in your java program
	 * If you type 7 (the literal number 7) in Java, Java will treat
	 * the number as a integer
	 */
	
	public static void main(String [] args)
	{

		/*Integer literals come in several forms. If you type the value 16 in you program,
		 * Java will treat it as an in. However because the number 16 can fit within a type
		 * byte or short, you can force Java to treat it as a type other than int by 
		 * appending a special character to the value. If your number is larger than what an 
		 * int can hold, Java automatically assumes that it is a long type
		 */
		
		int x1 = 16;       // Compiler assumes 16 is an int
		long x2 = 16L;     // Code forces compiler to treat 16 as a long
		int x3 = 30000000; // Compiler assumes 30000000 is a long

		/* To specify a hexadecimal number, precede the value with a leading 0x. 
		 * To specify an octal number, precede the value with a leading 0
		 */
		
		int my_octal = 0007;   //assigns an int an octal value
		int my_hex = 0x000A;   // assigns an int a hex value
		
		/* A byte is a primitive Java data type that uses eight bits to represent a number
		 * ranging from -128 to 127.
		 */
		
		byte flag_bits = 23;      // First variable can store one value of size byte   
		byte data_table[] = { 32, 16, 8, 4 };  // The second variable can store four values of size byte
		
		/* A short is a primitive Java data type that uses two bytes to represent a number
		 * ranging from -32768 to 32767.
		 */
		
		short age =25;
		short height = 6, weight = 229;
		
		/* A long is a primitive Java data type that uses eight bytes to to represent a 
		 * single-precision floating-point number -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		 */
		
		long atom_count = 9290388834903003L;
		
		/* A long is a primitive Java data type that uses four bytes to to represent a 
		 * single-precision floating-point number +/-3.4028234E+38 to +/11.402239846E-45
		 */
		float PI = 3.1415f;
		float intensity_percentage;
		
		/* A double is a primitive Java data type that uses eight bytes to to represent a 
		 * single-precision floating-point number +/-1.797693134866231570E+308 to +/-4.94065645841246544E-324
		 */
		double stellar_distance = 383989388333433f;
		
		
		/* The type char is a primitive Java type that uses two bytes to store a Unicode character. 
		 *  You you represent characters literials using a single quote
		 */
		char my_char = 'a';  
		char unicode_unialpha = '\u0041';  // You can represent a character using escape sequence follow by two bytes
		
		/* A String literal is a combination of characters enclosed by double quotes.
		 * To declare a string use the String type.
		 */
		String city = "Chicago";
		String comma = ", ";
		String state = "Illinois";
		String location = city + comma + state;   // You may use the concatenation operators, +, to join two strings together
		String address = location + " " + ", 60607";
		
		/* The primitive type boolean is used to store true or false.
		 * The boolean type requires only one bit and you cannot cast a boolean to any other type  
		 */
		boolean first_time = false;
		boolean last_time = true;

	}
		
}
