package swingExamples;
import javax.swing.*;
import java.awt.*;
public class BorderLayoutExample {    
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("This is BorderLayoutExample");    
        
	     // creating buttons  
	    JButton b1 = new JButton("N"); // the button will be labeled as NORTH   
	    JButton b2 = new JButton("S"); // the button will be labeled as SOUTH  
	    JButton b3 = new JButton("E"); // the button will be labeled as EAST  
	    JButton b4 = new JButton("W"); // the button will be labeled as WEST  
	    JButton b5 = new JButton("C"); // the button will be labeled as CENTER  
	        
	    f.add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction    
	    f.add(b2, BorderLayout.SOUTH);  // b2 will be placed in the South Direction    
	    f.add(b3, BorderLayout.EAST);  // b2 will be placed in the East Direction    
	    f.add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction    
	    f.add(b5, BorderLayout.CENTER);  // b2 will be placed in the Center    
	        
	  //  f.setSize(300, 300);    
	    f.setVisible(true);    
	   f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);	
	}

}
