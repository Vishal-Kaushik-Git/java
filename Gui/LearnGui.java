import javax.swing.JButton;
import javax.swing.JFrame;

public class LearnGui extends JFrame{
    LearnGui(){
    	JButton btn = new JButton();
    	btn.setBounds(100,100,50,50);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setLayout(null);
    	this.setSize(600, 600);
    	this.setVisible(true);
    	this.add(btn);
    }
    
    public static void main(String args[]) {
    	new LearnGui();
    }
}
