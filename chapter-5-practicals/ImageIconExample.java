import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
public class ImageIconExample{
    public static void main(String args[]){
        JFrame myForm = new JFrame();
        myForm.setDefaultCloseOperation(2);
        ImageIcon myIcon = new ImageIcon("bg.png");
        JLabel myImage = new JLabel(myIcon);

        myForm.add(myImage);

        myForm.setSize(1280,720);
        myForm.setUndecorated(true);
        myForm.setLocationRelativeTo(null);

        myForm.setVisible(true);
    }
}
