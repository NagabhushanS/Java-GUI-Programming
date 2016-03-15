import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class ButtonFrame extends JFrame{
	private JButton button1, button2;
	
	public ButtonFrame(){
		super("ButtonFrame Test");
		
		setLayout(new FlowLayout());
		
		button1 = new JButton("Plain Button");
		add(button1);
		
		button2 = new JButton("Fancy Button", new ImageIcon("icon.png"));
		button2.setRolloverIcon(new ImageIcon("icon3.png"));
		add(button2);
		
		ButtonHandler handler = new ButtonHandler();
		button1.addActionListener(handler);
		button2.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			String s = "";
			if (event.getSource() == button1){
				s = "Plain Button";
			} else if (event.getSource() == button2){
				s = "Fancy Button";
			}
			JOptionPane.showMessageDialog(ButtonFrame.this, s);
			
		}
		
	}

}
