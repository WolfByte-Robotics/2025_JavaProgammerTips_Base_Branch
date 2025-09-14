/************************************************************************************************
 * 
 * Author: Mr. Flowers
 * Date: 9/13/25
 * 
 * Description:
 * This Java program demonstrates how to call native functions from a Windows DLL 
 * using the Java Native Access (JNA) library. By loading the DLL file and defining a 
 * Java interface that maps to its exported functions, the program enables seamless integration
 * between Java and native code. It highlights the use of Native.loadLibrary() and correct path 
 * configuration to access the DLL.
 *
 * Basically a “Hello World” for OpenCV + Java:
 *
 ************************************************************************************************/

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class HelloCV {
    public static void main(String[] args){
    	
    		//Loads the OpenCV native DLL into memory.
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);   
            
            // Creates a 3×3 identity matrix (like numpy.eye(3) in Python).
            // Mat.eye() fills ones on the diagonal and zeros elsewhere.
            // CvType.CV_8UC1 means: 8-bit unsigned integers (8U) and 1 channel (grayscale).
            Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
            
            // Returns the contents of the matrix as a string and dumps it
            System.out.println("mat = " + mat.dump());
    }
} 