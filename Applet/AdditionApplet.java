package Applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public  class AdditionApplet extends Applet implements ActionListener {
	Float num1,num2,sub;
	TextField t1 = new TextField(5);
	TextField t2 = new TextField(5);
	Label l1 = new Label("Value 1: ");
	Label l2 = new Label("Value 2: ");
	Button b = new Button("Subtract");
	public void init() {
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		b.addActionListener(this);
	}
	public void paint(Graphics g) {
		g.drawString("sum = "+sub,20,70);
	}
	
	public void actionPerformed(ActionEvent e) {
		num1 = Float.parseFloat(t1.getText());
		num2 = Float.parseFloat(t2.getText());
		sub = num1 - num2;
		repaint();
		
	}
}

// <applet code ="AdditionApplet.class" width = "150" height ="200"></applet>

