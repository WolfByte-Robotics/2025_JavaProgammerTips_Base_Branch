

public class UnderstandingLiterals {

	public static void String(String [] args)
	{
		/* Literals correspond to a specific value in your java program
		 * If you type 7 (the literal number 7) in Java, Java will treat
		 * the number as a integer
		 */
		
		int x1 = 16;
		long x2 = 16L;
		int x3 = 30000000;

		int my_octal = 0007;
		int my_hex = 0x000A;
		
		byte flag_bits = 23;
		byte data_table[] = { 32, 16, 8, 4 };
		
		short age =25;
		short height = 6, weight = 229;
		
		long atom_count = 9290388834903003L;
		
		
		float PI = 3.1415f;
		float intensity_percentage;
		
		double stellar_distance = 383989388333433f;
		
		char my_char = 'a';
		char unicode_unialpha = 'a';
		
		System.out.println("Test" + unicode_unialpha);
		
		String city = "Chicago";
		String comma = ", ";
		String state = "Illinois";
		String location = city + comma + state;
		String address = location + " " + ", 60607";
		
	}
		
}
