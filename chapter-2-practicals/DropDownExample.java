import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;

 public class DropDownExample{
 public static void main(String[] args){
 
 JFrame myForm = new JFrame();
 myForm.setSize(400,400);
 myForm.setDefaultCloseOperation(2);
 myForm.setLayout(null);

 JLabel myLabel = new JLabel();
 myLabel.setSize(200,30);
 myLabel.setLocation(10,10);
 myLabel.setText("Select county");
 
 String myCountries[] = {"Somalia", "Saudi", "Falastiin", "Masar"};

 JComboBox<String> myCountry = new JComboBox<>(myCountries);
 myCountry.setSize(200,30);
 myCountry.setLocation(10,40);

myForm.add(myCountry);
myForm.add(myLabel);
myForm.setVisible(true);
}
} 
 
 


