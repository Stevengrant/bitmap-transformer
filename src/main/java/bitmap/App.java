/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap;

import java.awt.image.BufferedImage;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    //For this assignment you will be building a bitmap (.bmp) transformer CLI
    //It will read a bitmap in from disk
    //run one or more color or raster transforms
    //and then write it out to a new file.
    //This project will require manipulating binary data
    //Your solution should be composed of small tested methods that solve specific problems


//    The CLI should be architected using best modularization practices.
//    The CLI should contain a Bitmap class, and reading in a file should create a new Bitmap instance.
//    The CLI should require at least three arguments: input-file-path, output-file-path, transfrom-name.
//    The CLI should support a minimum of three transforms, each of which is an instance method in the Bitmap class.
//    The CLI should log useful Error messages if used incorrectly.
//    The CLI should log a success message on completion.



    public static void main(String[] args) {
        String inPath = args[0];
        String outPath = args[1];
        String transform = args[2];
        System.out.println(inPath + outPath + transform);
        BitMap map = new BitMap();
//        BufferedImage image  = map.getBmpImage("/Users/stegrnt/cf/401/bitmap/src/main/resources/coffee.bmp");
//        int[] imageDementions = map.getDementions(image);
        map.invertColor(inPath, outPath);


    }
}
