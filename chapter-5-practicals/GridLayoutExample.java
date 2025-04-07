import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt. GridLayout;
public class GridLayoutExample{
    public static void main(String args[]){
        JFrame myForm = new JFrame();
        myForm.setDefaultCloseOperation(2);
        myForm.setSize(300,300);
        myForm.setLayout(new  GridLayout(5,4, 30, 0));
        myForm.add(new JButton("Button 1"));
        myForm.add(new JButton("Button 3"));
        myForm.add(new JButton("Button 2"));
        myForm.add(new JButton("Button 4"));
        myForm.add(new JButton("Button 5"));
        myForm.add(new JButton("Button 6"));
        myForm.add(new JButton("Button 7"));
        myForm.add(new JButton("Button 8"));
        myForm.add(new JButton("Button 9"));
        myForm.add(new JButton("Button 10"));
        myForm.add(new JButton("Button 11"));
        myForm.setVisible(true);
    }
}
