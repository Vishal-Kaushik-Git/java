import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class basicgui {
    public static void main(String[] args) {

        JFrame frame= new JFrame();
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setTitle("Basic Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        ImageIcon IG = new ImageIcon("insta.webp");
        frame.setIconImage(IG.getImage());
    }
}