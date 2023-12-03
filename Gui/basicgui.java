import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class basicgui{
    public static void main(String[] args) {
        
            JLabel label = new JLabel();
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();

            frame.setSize(600, 600);
            frame.setTitle("Basic Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            // Load ImageIcon - Check the path
            ImageIcon IG = new ImageIcon("Gui\\Images\\Emoji.png");
            frame.setIconImage(IG.getImage());

            label.setText("Hello World");
            label.setBounds(50, 100, 100, 100);
            label.setForeground(Color.white);
            label.setBackground(Color.black);

            panel.setLayout(null);

            panel.setBackground(Color.BLUE);
            panel.setBounds(0, 0, 300, 300);

            frame.add(panel);
            panel.add(label);

            frame.setVisible(true);
    }
}
