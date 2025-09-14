/************************************************************************************************
 * 
 * Author: Mr. Flowers
 * Date: 9/13/25
 * 
 * Description:
 * This program loads a color image from the computer using OpenCV. It then converts the image 
 * to grayscale with the cvtColor function. After processing, the grayscale version is saved to 
 * a new file. If the image fails to load, the program prints an error message instead.
 *
 ************************************************************************************************/

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class ColorImageToGrayScale {
    static { System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }

    public static void main(String[] args) {
      
    	// Load the original image
        String inputPath = "C:\\WolfByte_DevEnv\\2025_JavaProgammerTips_Base_Branch\\JavaAdvance\\ColorImageToGrayScale\\assets\\images\\SICP-Main-Building-Color.jpg";
        
        // Output path for new image
        String outputPath = "C:\\WolfByte_DevEnv\\2025_JavaProgammerTips_Base_Branch\\JavaAdvance\\ColorImageToGrayScale\\assets\\images\\SICP-Main-Building-Color-gray.jpg";

        Mat colorImage = Imgcodecs.imread(inputPath);

        // if image is not found or can not load, prompt user
        if (colorImage.empty()) {
            System.out.println("Could not load image!");
            return;
        }

        // Convert to grayscale
        Mat grayImage = new Mat();
        Imgproc.cvtColor(colorImage, grayImage, Imgproc.COLOR_BGR2GRAY);

        // Save the grayscale image
        Imgcodecs.imwrite(outputPath, grayImage);

        System.out.println("Grayscale image saved to: " + outputPath);
    }
}
