package swingExamples;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frameObj = new JFrame();    
	        
	     // creating the buttons  
	    JButton b1 = new JButton("1");    
	    JButton b2 = new JButton("2");    
	    JButton b3 = new JButton("3");    
	    JButton b4 = new JButton("4");    
	    JButton b5 = new JButton("5");    
	    
	         
	    // adding the buttons to frame        
	    frameObj.add(b1); frameObj.add(b2); frameObj.add(b3); frameObj.add(b4);      
	    frameObj.add(b5);    
	       
	    // parameterized constructor is used  
	    // where alignment is left   
	    // horizontal gap is 20 units and vertical gap is 25 units.  
	    frameObj.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 25));    
	        
	      
	    frameObj.setSize(300, 300);    
	    frameObj.setVisible(true); 
	    frameObj.setDefaultCloseOperation(frameObj.EXIT_ON_CLOSE);
	}

}
