package bitmap;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;

public class BitMap {
    BufferedImage image;

    private BufferedImage getBmpImage(String targetFilePath)   {
    BufferedImage img = null;
    try {
        img = ImageIO.read(new File(targetFilePath));
    }  catch (IOException e) {
        e.printStackTrace();
    }
    return img;
    }

    private int[] getDementions(BufferedImage image){
        int[]res = new int[2];
        res[0] = image.getHeight();
        res[1] = image.getWidth();
        return res;
    }
    private BufferedImage changeColorMultiplication(BufferedImage image, int height, int width, int mutator){
    for(int y = 0; y< height; y++){
        for(int x = 0; x < width; x++){
            int pixel = image.getRGB(x,y);
            image.setRGB(x,y,pixel * mutator);
            System.out.println("In Change color");
            System.out.println(pixel);
        }
    }
    return image;
    }
    private void saveImage(BufferedImage image, String path)  {
//        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
//        writer.write(image);

        try {
            ImageIO.write(image,"bmp", new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void invertColor(String path){
        BufferedImage img =getBmpImage(path);
        int[] dimentions = getDementions(img);
        img = changeColorMultiplication(img,dimentions[0],dimentions[1], -1);
        saveImage(img, path);
        //save image


    }
}
