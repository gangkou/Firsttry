package sun;

import java.awt.Graphics;
import java.awt.Image;

import Util.Constant;
import Util.GameUtil;
import Util.MyFrame;

/**
 * 太阳系主窗口
 * @author 小米饭
 *
 */
public class solar extends MyFrame {
	
	
	 
	Image bg =GameUtil.getImages("D:/下载/eclipse-jee-2019-09-R-win32-x86_64/sunsystem/src/images/bg.png");
    
	Star s = new Star("D:/下载/eclipse-jee-2019-09-R-win32-x86_64/sunsystem/src/images/hh.png",Constant.gamewidth/2-120,Constant.gameheight/2-170);
	planet o =new planet("D:/下载/eclipse-jee-2019-09-R-win32-x86_64/sunsystem/src/images/o.png",300,300,0.02,s);
	planet p=new planet("D:/下载/eclipse-jee-2019-09-R-win32-x86_64/sunsystem/src/images/w.png",250,200,0.03,s);
	planet a=new planet("D:/下载/eclipse-jee-2019-09-R-win32-x86_64/sunsystem/src/images/t.png",300,200,0.015,s);
	planet d=new planet("D:/下载/eclipse-jee-2019-09-R-win32-x86_64/sunsystem/src/images/f.png",250,200,0.01,s);
	planet e=new planet("D:/下载/eclipse-jee-2019-09-R-win32-x86_64/sunsystem/src/images/v.png",350,300,0.01,s);
	planet r=new planet("D:/下载/eclipse-jee-2019-09-R-win32-x86_64/sunsystem/src/images/s.png",200,300,0.035,s);
	planet t=new planet("D:/下载/eclipse-jee-2019-09-R-win32-x86_64/sunsystem/src/images/e.png",300,200,0.005,s);
	
	public void paint(Graphics g) {
	   g.drawImage(bg, 0, 0,null);
	   s.draw(g);
	   o.draw(g);
	   p.draw(g);
	   a.draw(g);
	   d.draw(g);
	   e.draw(g);
	   r.draw(g);
	   t.draw(g);
	   
   }
	
	public static void main(String[] args) {
		new solar().launchFrame();
	}
}
