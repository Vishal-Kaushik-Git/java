import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class trigger extends JFrame implements ActionListener{
	JButton btn;
       trigger(){
    	 btn = new JButton();
    	 
    	 btn.setText("Click here!");
    	 this.setSize(200,200);
    	 btn.setBounds(0, 0, 100, 50);
    	 this.add(btn);
    	 this.setLayout(null);
    	 btn.addActionListener(this);
    	 this.setVisible(true);    	     	 
     }
     @Override
     public void actionPerformed(ActionEvent e) {
    	 if(e.getSource() == btn) {
    		fuck f = new fuck();
    		this.dispose();
    	 }
   }
     public static void main(String args[]){
    	 new trigger();
     }
}

