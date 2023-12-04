import java.awt.FlowLayout;

import javax.swing.JButton;

import javax.swing.JFrame;

public class learn2 {
  public static void main(String args[]) {
	JFrame f = new JFrame();
	f.setSize(600, 600);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	f.setLayout(new FlowLayout(FlowLayout.LEADING));
	
	f.add(new JButton("1"));
	f.add(new JButton("2"));
	f.add(new JButton("3"));
	f.add(new JButton("4"));
	f.add(new JButton("5"));
	f.add(new JButton("6"));
	f.add(new JButton("7"));
	f.add(new JButton("8"));
	f.add(new JButton("9"));
	
	
	f.setVisible(true);
}
}
