import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame{
	private JComboBox box;
	private JLabel label;
	private static final String[] names = {"Icon 1", "Icon 2", "Icon 3", "Icon 4", "Icon 5", "Icon 6", "Icon 7", "Icon 8", "Icon 9"};

	public ComboBoxFrame(){
		super("ComboBoxFrame Test");
		
		setLayout(new FlowLayout());
		
		box = new JComboBox(names);
		box.setMaximumRowCount(3);
		add(box);
		box.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent event) {
				if(event.getStateChange() == ItemEvent.SELECTED){
					
				}
			}
		});
		
	}

}
