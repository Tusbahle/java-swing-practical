import javax.swing.JFrame;
import javax.swing.JPasswordField;
public class JPasswordFeidlExample{
    public static void main(String options[]){
        JFrame myForm = new JFrame();
        myForm.setDefaultCloseOperation(2);
        myForm.setSize(200, 300);
        JPasswordField myPassword = new JPasswordField();
        myPassword.setText("Save button 1");
        myForm.add(myPassword);
        myForm.setVisible(true);
    }
}