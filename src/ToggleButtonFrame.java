import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class ToggleButtonFrame extends JFrame{
	private JCheckBox bold, italic;
	private JRadioButton ten, twenty;
	private ButtonGroup group;
	private JLabel label;
	
	public ToggleButtonFrame(){
		super("ToggleButtonFrame Test");
		
		setLayout(new FlowLayout());
		
		bold = new JCheckBox("Bold");
		add(bold);
		
		italic = new JCheckBox("Italic");
		add(italic);
		
		ten = new JRadioButton("Ten");
		add(ten);
		
		twenty = new JRadioButton("Twenty");
		add(twenty);
		
		group = new ButtonGroup();
		group.add(ten);
		group.add(twenty);
		
		label = new JLabel("Label");
		label.setFont(new Font("Comic Sans Ms", Font.PLAIN, 10));
		add(label);
		
		ToggleButtonHandler1 handler1= new ToggleButtonHandler1();
		ToggleButtonHandler2 handler2= new ToggleButtonHandler2();
		bold.addItemListener(handler1);
		italic.addItemListener(handler1);
		ten.addItemListener(handler2);
		twenty.addItemListener(handler2);
		
	}
	
	private class ToggleButtonHandler1 implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent event) {
			Font font = null;
			if(bold.isSelected() && italic.isSelected()){
				font = new Font("Comic Sans MS", Font.BOLD + Font.ITALIC, 10);
			} else if(bold.isSelected()){
				font = new Font("Comic Sans MS", Font.BOLD, 10);
			} else if(italic.isSelected()){
				font = new Font("Comic Sans MS", Font.ITALIC, 10);
			} else {
				font = new Font("Comic Sans MS", Font.PLAIN, 10);
			}
			label.setFont(font);
			
		}
		
	}
	
	private class ToggleButtonHandler2 implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent event) {
			Font font = null;
			if(ten.isSelected()){
				font = new Font("Comic Sans MS", label.getFont().getStyle(), 10);
			} else if(twenty.isSelected()){
				font = new Font("Comic Sans MS", label.getFont().getStyle(), 20);
			}
			label.setFont(font);
			 
			
		}
		
	}
	

}
