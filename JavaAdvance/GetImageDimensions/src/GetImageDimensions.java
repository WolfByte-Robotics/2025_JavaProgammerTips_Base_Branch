/************************************************************************************************
 * 
 * Author: Mr. Flowers
 * Date: 9/13/25
 * 
 * Description:
 * This program demonstrates how to use OpenCV in Java to read and analyze an image file. It first 
 * loads the OpenCV native library to access its image processing functions. The program then attempts 
 * to load a specified image from disk and checks if the image was successfully opened. If successful, 
 * it prints the image’s dimensions (width and height in pixels); otherwise, it displays an error message.
 *
 * In short: this program checks if an image exists and then outputs its resolution (width × height).
 *
 ************************************************************************************************/

import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;

public class GetImageDimensions {
	
	  // It loads the OpenCV native library so Java can use OpenCV functions.
	  static { System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }

	    public static void main(String[] args) {
	    	
	    	//It attempts to read the specified image (2024-WolfByte-Robotics-Logo.png) from the given file path.
	        Mat img = Imgcodecs.imread("C:\\WolfByte_DevEnv\\2025_JavaProgammerTips_Base_Branch\\JavaAdvance\\GetImageDimensions\\assets\\images\\2024-WolfByte-Robotics-Logo.png");
	    
	        if (img.empty()) {   // If the image cannot be loaded, it prints an error message.
	            System.out.println("Could not load image!");
	        } 
	        else {              //If the image is successfully loaded, it prints the image’s width and height in pixels.
	            System.out.println("Image loaded: " + img.width() + "x" + img.height());
	        }
	    }
}
