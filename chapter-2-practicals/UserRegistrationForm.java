import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class UserRegistrationForm{
public static void main(String[] args){
 JFrame userForm = new JFrame("User registration");
 userForm.setSize(500,700);
 userForm.setDefaultCloseOperation(2);
 userForm.setLayout(null);
 
 JLabel fullnameLabel = new JLabel("Enter fullname");
   fullnameLabel.setBounds(10,10,200,30);
  JTextField fullnameField = new JTextField();
  fullnameField.setBounds(10,40,200,30);

 JLabel passwordLabel = new JLabel("Enter password");
  passwordLabel.setBounds(250,10,200,30);
  JPasswordField passwordField = new JPasswordField();
  passwordField.setBounds(250,40,200,30);


userForm.add(fullnameLabel);
userForm.add(fullnameField);
userForm.add(passwordLabel);
userForm.add(passwordField);

userForm.setVisible(true);
}
}




