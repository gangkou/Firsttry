package Util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class GameUtil {
	
 public static Image getImages(String path) {
	 Image img =null;
	 try {
		 img =ImageIO.read(new File(path));
	 }catch(IOException e){
		 e.printStackTrace();
	 }
//	 URL u =GameUtil.class.getClass().getResource(path);
//	 try {
//		img = ImageIO.read(u);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}	 
	 return img;
	 
	 }
 }



