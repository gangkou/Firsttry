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
 * ���Դ���������ˮƽ����ֱ�����˶�
 * @author С�׷�
 *
 */

public class GameFrame2 extends Frame {//GUI��̣�AWT,swing
	
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
		GameFrame2 gf =new GameFrame2();		
		gf.launchFrame();		
	}
}
