import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TextFieldFrame extends JFrame{
	private JTextField field1, field2, field3;
	private JPasswordField field4;
	
	public TextFieldFrame(){
		super("TextFieldFrame Test");
		
		setLayout(new FlowLayout());
		
		field1 = new JTextField(14);
		add(field1);
		
		field2 = new JTextField("This is an editable text field", 17);
		add(field2);
		
		field3 = new JTextField("This is uneditable text field");
		field3.setEditable(false);
		add(field3);
		
		field4 = new JPasswordField("This is a password field");
		add(field4);
		
		TextFieldHandler handler = new TextFieldHandler();
		field1.addActionListener(handler);
		field2.addActionListener(handler);
		field3.addActionListener(handler);
		field4.addActionListener(handler);
	}
	
	private class TextFieldHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			String string = "";
			if (event.getSource() == field1){
				string = String.format("field1: %s", event.getActionCommand().toString());
			} else if (event.getSource() == field2){
				string = String.format("field2: %s", event.getActionCommand().toString());
			} else if (event.getSource() == field3){
				string = String.format("field3: %s", event.getActionCommand().toString());
			} else if (event.getSource() == field4){
				string = String.format("field4: %s", event.getActionCommand().toString());
			} 
			JOptionPane.showMessageDialog(TextFieldFrame.this, string);
			
		}
		
	}

}
