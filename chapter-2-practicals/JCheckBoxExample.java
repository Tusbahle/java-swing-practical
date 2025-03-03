 import javax.swing.JCheckBox;
 import javax.swing.JFrame;
 import javax.swing.JLabel;

public class JCheckBoxExample{
 public static void main(String[] args){

 JFrame myForm = new JFrame();
 myForm.setSize(400,400);
 myForm.setDefaultCloseOperation(2);
 myForm.setLayout(null);

 JCheckBox myOption = new JCheckBox("Agree");
 myOption.setBounds(10,40,200,30);
 JLabel myLabel = new JLabel("Select agree");
 myLabel.setBounds(10,10, 200, 30);

 myForm.add(myOption);
 myForm.add(myLabel);
	
 myForm.setVisible(true);
}
}

 