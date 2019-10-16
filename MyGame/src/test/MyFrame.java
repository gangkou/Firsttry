package test;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import test.GameFrame.paintrun;

public class MyFrame extends Frame {
	
	
	
	  public void launchFrame() {
		 
			setSize(Constant.gameheight,Constant.gameheight);
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
					Thread.sleep(40);   //1s=1000ms “ª√Î25÷°
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	    			
	    		}
	    	}
	    }

}
