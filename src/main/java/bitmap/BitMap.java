package bitmap;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;

public class BitMap {
    BufferedImage image;

    public BufferedImage getBmpImage(String targetFilePath)   {
        System.out.println("Getting file");
    BufferedImage img = null;
    try {
        img = ImageIO.read(new File(targetFilePath));
    }  catch (IOException e) {
        e.printStackTrace();
    }
    return img;
    }

    public int[] getDementions(BufferedImage image){
        System.out.println("Analizing file size.");

        int[]res = new int[2];
        res[0] = image.getHeight();
        res[1] = image.getWidth();
        return res;
    }
    public BufferedImage changeColorMultiplication(BufferedImage image, int height, int width, int mutator){

        for(int y = 0; y< height; y++){
        for(int x = 0; x < width; x++){
            int pixel = image.getRGB(x,y);
            image.setRGB(x,y,pixel * mutator);
        }
    }
    return image;
    }
    public void saveImage(BufferedImage image, String path)  {
        System.out.println("Saving new image.");

//        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
//        writer.write(image);

        try {
            System.out.println("Saving new pic.");

            ImageIO.write(image,"bmp", new File(path));
        } catch (IOException e) {
            System.out.println("Lol no.");

            e.printStackTrace();
        }
        System.out.println("Done.");


    }
    public void invertColor(String inPath, String outPath){
        System.out.println("Flip turning colors upside down.");
        BufferedImage img =getBmpImage(inPath);
        int[] dimentions = getDementions(img);
        img = changeColorMultiplication(img,dimentions[0],dimentions[1], -1);
        saveImage(img, outPath);


    }
}
