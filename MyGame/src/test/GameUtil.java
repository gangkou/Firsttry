package test;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class GameUtil {
	
 public static Image getImages(String path) {
	 BufferedImage img =null;
	 try {
		 img =ImageIO.read(new File(path));
	 }catch(IOException e){
		 e.printStackTrace();
	 }
	 return img;
	 
	 }
 }



