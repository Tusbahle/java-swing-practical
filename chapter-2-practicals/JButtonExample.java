import javax.swing.JFrame;
import javax.swing.JButton;
public class JButtonExample{
    public static void main(String[] args){
        JFrame myForm = new JFrame();
            myForm.setSize(300, 300);
            myForm.setDefaultCloseOperation(2);
            myForm.setLayout(null);

         JButton myButton = new JButton("Click me");
            // myButton.setBounds(100, 115, 100, 30);
            myButton.setLocation(100, 115);
            myButton.setSize(100,30);

            myForm.getContentPane().add(myButton);

            myForm.setVisible(true);
    }
}