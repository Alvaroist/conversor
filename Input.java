import javax.swing.*;

public class Input extends JFrame{
	private JLabel textlabel;
	private JTextField textfield;
	private JButton okbutton, cancelbutton;
	
	public Input(){
        setLayout(null);
		setTitle("Input");
		textlabel = new JLabel("Type the quantity to convert");
     	textlabel.setBounds(15,10,120,30);
     	add(textlabel);

     	textfield = new JTextField();
     	textfield.setBounds(100,50,150,30);
       	add(textfield);
			
     	okbutton = new JButton("OK");
     	okbutton.setBounds(45,130,100,30);
     	add(okbutton);
     		
     	cancelbutton = new JButton("Cancel");
     	cancelbutton.setBounds(185,130,100,30);
     	add(cancelbutton);
   	}

 public static void main (String args[]){
	
 }
}