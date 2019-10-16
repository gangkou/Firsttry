package Util;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyFrame extends Frame {
	private Image iBuffer;  
	private Graphics gBuffer;  
	public void update(Graphics scr)  
	 {  
	  if(iBuffer==null)  
	     {  
	        iBuffer=createImage(this.getSize().width,this.getSize().height);  
	        gBuffer=iBuffer.getGraphics();  
	     }  
	        gBuffer.setColor(getBackground());  
	        gBuffer.fillRect(0,0,this.getSize().width,this.getSize().height);  
	        paint(gBuffer);  
	        scr.drawImage(iBuffer,0,0,this);  
	 }  
	
	
	
	  public void launchFrame() {
		 
			setSize(Constant.gamewidth,Constant.gameheight);
			setLocation(0,0);
			setVisible(true);
			
			new paintrun().start();
			
			addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	
			});  
			}
	  
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
//	    	private Image offScreenImage;
//	    	public void update(Graphics g) {
//	    		//1.得到缓冲图象
//	    		if(this.offScreenImage==null){
//	    		this.offScreenImage = this.run(Constant.gamewidth,Constant.gameheight);
//	    		}
//	    		//2.得到缓冲图象的画笔
//	    		Graphics gOffScreen = this.offScreenImage.getGraphics();
//	    		//3.绘制缓冲图象
//	    		Color c = gOffScreen.getColor();
//	    		gOffScreen.setColor(Color.black);
//	    		gOffScreen.fillRect(0, 0, Constant.gamewidth,Constant.gameheight);
//	    		gOffScreen.setColor(c);
//	    		//4.调用paint(),将缓冲图象的画笔传入
//	    		paint(gOffScreen);
//	    		//5.再将此缓冲图像一次性绘到代表屏幕的Graphics对象，即该方法传入的“g”上
//	    		g.drawImage(offScreenImage, 0, 0, null);
//	    		}
	 
	    }

}
