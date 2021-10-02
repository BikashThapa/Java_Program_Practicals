package swingExamples;

import java.awt.*;

import javax.swing.*;

public class BoxLayoutExample extends JFrame{
	Button buttons[];
	BoxLayoutExample(){
		// TODO Auto-generated method stub     
				  buttons = new Button [5];    
			      
				   for (int i = 0;i<5;i++) {    
				      buttons[i] = new Button ("Button " + (i + 1));    
				      // adding the buttons so that it can be displayed  
				      add(buttons[i]);    
				    }    
				  // the buttons will be placed horizontally  
				setLayout (new BoxLayout(this, getDefaultCloseOperation()));    
				setSize(400,400);    
				setVisible(true);  
				
	}
	public static void main(String[] args) {
		new BoxLayoutExample();
	}

}
