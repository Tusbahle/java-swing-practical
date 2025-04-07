import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
public class FlowLayoutExample{
    public static void main(String args[]){
        JFrame myForm = new JFrame();
        myForm.setDefaultCloseOperation(2);
        myForm.setSize(300,300);
        myForm.setLayout(new FlowLayout(FlowLayout.RIGHT));
        myForm.add(new JButton("Button 1"));
        myForm.add(new JButton("Button 3"));
        myForm.add(new JButton("Button 2"));
        myForm.add(new JButton("Button 4"));
        myForm.setVisible(true);
    }
}