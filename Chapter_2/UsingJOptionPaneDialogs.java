import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog(null, "Enter Name:");
            if (name == null) {
                JOptionPane.showMessageDialog(
                    null,
                    "You did not put any name.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
                continue;
             }

            int confirm = JOptionPane.showConfirmDialog(
                null, "Do you want your name to be shown?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
                
            if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION){
               continue;
            }

            else if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, name,  "Your Name",JOptionPane.INFORMATION_MESSAGE);
                break;           
                 }
                             
           }
    }
}
