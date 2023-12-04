import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LearnGui extends JFrame implements ActionListener{
	JButton btn;
    LearnGui(){
      	 ImageIcon ig = new ImageIcon("Gui\\Images\\btn.jpg");
    	 btn = new JButton();
    	 btn.setBounds(100,100,200,200);
    	 
    	 btn.setIcon(ig);
    	
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setLayout(null);
    	this.setSize(600, 600);
    
    	this.add(btn);	
    	
    	btn.setFocusable(false);
  
    	btn.addActionListener(this);
    	
    	this.setVisible(true);
    	
    }
    @Override
    public void actionPerformed(ActionEvent e){
    	if(e.getSource() == btn) {
    		System.out.println("Button Clicked");
    	}
    }
    
    public static void main(String args[]) { 
    	new LearnGui();
    }
}