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
 * ���Դ�������������ˮƽ�����˶���ʵ��̨����Ϸ
 * @author С�׷�
 *
 */

public class GameFrame3 extends Frame {//GUI��̣�AWT,swing
	
  Image img =GameUtil.getImages("D:/����/eclipse-jee-2019-09-R-win32-x86_64/MyGame/src/images/IMG_20180604_113020.jpg");
	
	
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
    private double  degree=3.14/3; //[0,2pi]
    private double speed =5;
    public void paint(Graphics g) {
   	    g.drawImage(img,(int)x,(int)y,null);
//   	    if(speed>0) 
//   	    {speed-=0.05;}
//   	    else 
//   	    {speed=0;}
   	    
         x+=speed*Math.cos(degree);
         y+=speed*Math.sin (degree);
         
         if(y>250||y<30) {
        	 degree =-degree;
         }
         if(x<0||x>1100) {
        	 degree=Math.PI-degree;
         }
    }
    
    /**
         * ����һ���ػ����ڣ���һ���ڲ���
     * @author С�׷�
     *
     */
    class paintrun extends Thread{
    	public void run() {
    		while(true) {
    		repaint();
    		try {
				Thread.sleep(40);   //1s=1000ms һ��25֡
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    			
    		}
    	}
    }
    
    
    public static void main(String[] args) {
		GameFrame3 gf =new GameFrame3();		
		gf.launchFrame();		
	}
}
