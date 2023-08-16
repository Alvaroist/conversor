import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Converter extends JFrame implements ActionListener{
   	private JLabel textlabel;
   	private JComboBox list;
   	private JButton okbutton, cancelbutton;
   	public static String texto;
   
   	public Converter(){
     	setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Menu");
     		textlabel = new JLabel("Choose an option:");
     		textlabel.setBounds(15,10,120,30);
     		add(textlabel);

     		list = new JComboBox();
     		list.setBounds(90,50,160,30);
     		list.addItem("Currency converter");
     		list.addItem("Temperature converter");
			add(list);
     
     		okbutton = new JButton("OK");
     		okbutton.setBounds(45,130,100,30);
     		okbutton.addActionListener(this);
     		add(okbutton);
     
     		cancelbutton = new JButton("Cancel");
     		cancelbutton.setBounds(185,130,100,30);
     		cancelbutton.addActionListener(this);
     		add(cancelbutton); 
   		}

    	public void actionPerformed(ActionEvent e){
     		if(e.getSource() == okbutton){
       		texto = list.getSelectedItem().toString();
       		if(texto.equals("Currency converter")){
         		InputCurrency inputmoney = new InputCurrency();
	 			inputmoney.setBounds(0,0,350,230);
         		inputmoney.setVisible(true);
         		inputmoney.setResizable(false);
         		inputmoney.setLocationRelativeTo(null);
         		this.setVisible(false);
       		} else {
	 		InputTemp inputForm = new InputTemp();
	 			inputForm.setBounds(0,0,350,230);
         		inputForm.setVisible(true);
         		inputForm.setResizable(false);
         		inputForm.setLocationRelativeTo(null);
         		this.setVisible(false);
			}	
      		}else if(e.getSource() == cancelbutton){
				System.exit(0);
			}
     	}
 	public static void main(String args[]){
  	  Converter formulario1 = new Converter();
  	  formulario1.setBounds(0,0,350,230);
  	  formulario1.setVisible(true);
  	  formulario1.setResizable(false);
  	  formulario1.setLocationRelativeTo(null);
 	}
}