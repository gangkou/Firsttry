package test;

import java.awt.Color;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 测试窗口物体沿水平、竖直方向运动
 * @author 小米饭
 *
 */

public class GameFrame2 extends Frame {//GUI编程：AWT,swing
	
  Image img =GameUtil.getImages("D:/下载/eclipse-jee-2019-09-R-win32-x86_64/MyGame/src/images/IMG_20180604_113020.jpg");
	
	
    public void launchFrame() {
	setSize(2000,2000);
	setLocation(0,0);
	setVisible(true);
	
	new paintrun().start();
	
	addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}	
	});  
	}
    
    private double x=300,y=200;
    private boolean left;
    private boolean up;
    public void paint(Graphics g) {
   	    g.drawImage(img,(int)x,(int)y,null);
//   	    if(left) {
//   	    x-=3;}
//   	    else {x+=3;}
//   	    if(x>2000-900) 
//   	    {
//   	    	left=true;
//   	    }
//   	    if(x<0) 
//   	    {
//   	    	left=false;  	    	
//   	    }

   	    if(up) {
   	    	y-=3;
   	    }else {
   	    	y+=3;
   	    }
   	    if(y>200) {
   	    	up=true;  	    	
   	    }
   	    if(y<30) {
   	    	up=false;   	    	
   	    }
    }
    
    /**
         * 定义一个重画窗口，是一个内部类
     * @author 小米饭
     *
     */
    class paintrun extends Thread{
    	public void run() {
    		while(true) {
    		repaint();
    		try {
				Thread.sleep(40);   //1s=1000ms 一秒25帧
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    			
    		}
    	}
    }
    
    
    public static void main(String[] args) {
		GameFrame2 gf =new GameFrame2();		
		gf.launchFrame();		
	}
}
