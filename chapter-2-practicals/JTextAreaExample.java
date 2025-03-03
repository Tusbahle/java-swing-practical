import javax.swing.JFrame;
import javax.swing.JTextArea;
public class JTextAreaExample{
    public static void main(String args[]){
        JFrame myForm = new JFrame();
        myForm.setDefaultCloseOperation(2);
        myForm.setSize(200, 200);
        JTextArea myComment = new JTextArea();
        myForm.add(myComment);
        myForm.setVisible(true);
    }
}