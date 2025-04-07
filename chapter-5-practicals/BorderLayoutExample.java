import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
public class BorderLayoutExample{
    public static void main(String args[]){
        JFrame myForm = new JFrame();
        myForm.setDefaultCloseOperation(2);
        myForm.setSize(300,300);
        myForm.setLayout(new BorderLayout());
        myForm.add(new JButton("Button 1"), BorderLayout.CENTER);
        myForm.add(new JButton("Button 3"), BorderLayout.SOUTH);
        myForm.add(new JButton("Button 2"), BorderLayout.WEST);
        myForm.add(new JButton("Button 4"), BorderLayout.EAST);
        myForm.add(new JButton("Button 5"), BorderLayout.NORTH);
        myForm.setVisible(true);
    }
}
