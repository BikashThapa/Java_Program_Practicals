package swingExamples;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Addition extends JFrame implements ActionListener{
	JTextField t1,t2;
	JButton b;
	JLabel l;
	
	public Addition() {
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		b = new JButton("Add");
		l = new JLabel("Result");
		add(t1);
		add(t2);
		add(b);
		add(l);
		b.addActionListener(this); // ActionListener is the Interfacce
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		float num1 = Float.parseFloat(t1.getText());
		float num2 = Float.parseFloat(t2.getText());
		float sum = num1 + num2;
		l.setText(sum + " ");
		
	}
}

public class AWTExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add = new Addition();

	}

}
