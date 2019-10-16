package sun;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import Util.Constant;
import Util.GameUtil;

public class planet extends Star{
	
	//–––«—ÿÕ÷‘≤‘À∂Ø£¨Õ÷‘≤”–≥§÷·øÌ÷·ÀŸ∂»Ω«∂»     –––«»∆À≠∑…
	double longAxis,shortAxis,speed,degree;
	Star center;
	
	public planet(String imgpath, double longAxis, double shortAxis, double speed, Star center) {
	    this.x=center.x+longAxis;
	    this.y=center.y;
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		this.center = center;
		this.img=GameUtil.getImages(imgpath);
	}
	public void draw(Graphics g) {
		super.draw(g);		
		//—ÿ◊≈Õ÷‘≤πÏº£∑…––
		x=(center.x+center.width/2)+longAxis*Math.cos(degree);
		y=(center.y+center.height/2)+shortAxis*Math.sin(degree);
		degree+=speed;
		drawTrace(g);
	}
	public void drawTrace(Graphics g) {
		//ª≠≥ˆÕ÷‘≤πÏº£
	    double  _x,_y,_width,_height;
		
		_width=longAxis*2;
		_height=shortAxis*2;
		_x=(center.x+center.width/2)-longAxis;
		_y=(center.y+center.height/2)-shortAxis;
		Color c =g.getColor();
		g.setColor(Color.LIGHT_GRAY);
		g.drawOval((int)_x, (int)_y, (int)_width, (int)_height);
		g.setColor(c);
	}
}
