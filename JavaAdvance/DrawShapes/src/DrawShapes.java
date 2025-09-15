/************************************************************************************************
 * 
 * Author: Mr. Flowers
 * Date: 9/15/25
 * 
 * Description:
 * This program demonstrates how to draw shapes on an image using OpenCV in Java. It loads an 
 * image, then overlays a red rectangle, a green circle, and a blue line using the Imgproc drawing 
 * functions. Lastly, it saves the modified image to a new file.
 *
 ************************************************************************************************/

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class DrawShapes {
    static { System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }

    public static void main(String[] args) {
        // Load the original image
        String inputPath = "C:\\WolfByte_DevEnv\\2025_JavaProgammerTips_Base_Branch\\JavaAdvance\\DrawShapes\\assets\\images\\whatever-robot.jpg";
        String outputPath = "C:\\WolfByte_DevEnv\\2025_JavaProgammerTips_Base_Branch\\JavaAdvance\\DrawShapes\\assets\\images\\whatever-robot-drawn.jpg";

        Mat image = Imgcodecs.imread(inputPath);

        if (image.empty()) {
            System.out.println("Could not load image!");
            return;
        }

        // Draw a red rectangle (BGR format: Blue=0, Green=0, Red=255)
        Point topLeft = new Point(50, 50);
        Point bottomRight = new Point(200, 200);
        Imgproc.rectangle(image, topLeft, bottomRight, new Scalar(0, 0, 255), 3);

        // Draw a green circle
        Point center = new Point(300, 150);
        int radius = 50;
        Imgproc.circle(image, center, radius, new Scalar(0, 255, 0), 2);

        // Draw a blue line
        Point start = new Point(100, 300);
        Point end = new Point(400, 300);
        Imgproc.line(image, start, end, new Scalar(255, 0, 0), 4);

        // Save the modified image
        Imgcodecs.imwrite(outputPath, image);

        System.out.println("Shapes drawn and saved to: " + outputPath);
    }
}
