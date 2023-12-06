import javax.swing.JOptionPane;

public class fuck {
            fuck(){
  int response = JOptionPane.showConfirmDialog(null, "Are You Gay! ", "GenderCheck", JOptionPane.YES_OPTION);
   if(response == JOptionPane.NO_OPTION) {
   	  JOptionPane.showMessageDialog(null, "Shame", null, JOptionPane.INFORMATION_MESSAGE);
   }else if(response == JOptionPane.YES_OPTION) {
      JOptionPane.showMessageDialog(null, "Welcome to Muslim Community", null, JOptionPane.INFORMATION_MESSAGE);
     }
     }
           
}
