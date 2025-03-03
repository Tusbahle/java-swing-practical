import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldExample{

public static void main(String lists[]){
	JFrame frame = new JFrame("Jtextfield example");
	frame.setSize(300,300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JTextField username = new JTextField("Cali");
	
	frame.getContentPane().add(username);

	frame.setVisible(true);
	
}
}