import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class JRadioButtonExample{
public static void main(String[] args){
    JFrame myForm = new JFrame("Radio button example");
        myForm.setLayout(null);
        myForm.setSize(400,400);
        myForm.setDefaultCloseOperation(2);

            JLabel myOptionLabel = new JLabel("Please select one option");
                    myOptionLabel.setLocation(10, 0);
                    myOptionLabel.setSize(200, 30);

        JRadioButton option1 = new JRadioButton("Option 1");
        option1.setBounds(10, 40, 200, 30);

        JRadioButton option2 = new JRadioButton("Option 2");
        option2.setBounds(10, 80, 200, 30);

        ButtonGroup myOptionGroup = new ButtonGroup();
        myOptionGroup.add(option1);
        myOptionGroup.add(option2);

        myForm.add(option1);
        myForm.add(option2);
        myForm.add(myOptionLabel);



        myForm.setVisible(true);

}
}