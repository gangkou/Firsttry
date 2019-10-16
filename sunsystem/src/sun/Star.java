package sun;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Util.GameUtil;

public class Star {
	Image img;
	double x,y;
    int width;
    int height;
    
	public void draw(Graphics g) {
		g.drawImage(img, (int)x,(int)y,null );
	}
	public Star() {}
	
	public Star(String imgpath,double x,double y) {
		this.img=GameUtil.getImages(imgpath);
		this.x=x;
		this.y=y;
		this.width=img.getWidth(null);
		this.height=img.getHeight(null);
		
	}
}
