import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutAlignmentFrame extends JFrame{
	private JButton north, south, east, west, center;
	
	public BorderLayoutAlignmentFrame(){
		super("BorderLayout Test");
		
		setLayout(new BorderLayout(5, 5));
		
		north = new JButton("North");
		add(north, BorderLayout.NORTH);
		
		south = new JButton("South");
		add(south, BorderLayout.SOUTH);
		
		east = new JButton("East");
		add(east, BorderLayout.EAST);
		
		west = new JButton("West");
		add(west, BorderLayout.WEST);
		
		center = new JButton("Center");
		add(center, BorderLayout.CENTER);
		
		ButtonHandler handler = new ButtonHandler();
		center.addActionListener(handler);
		south.addActionListener(handler);
		north.addActionListener(handler);
		east.addActionListener(handler);
		west.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			String eventString = event.getActionCommand();
			
			switch(eventString){
			case "West":
				west.setVisible(false);
				east.setVisible(true);
				north.setVisible(true);
				center.setVisible(true);
				south.setVisible(true);
				break;
				
			case "East":
				west.setVisible(true);
				east.setVisible(false);
				north.setVisible(true);
				center.setVisible(true);
				south.setVisible(true);
				break;
				
			case "South":
				west.setVisible(true);
				east.setVisible(true);
				north.setVisible(true);
				center.setVisible(true);
				south.setVisible(false);
				break;
				
			case "North":
				west.setVisible(true);
				east.setVisible(true);
				north.setVisible(false);
				center.setVisible(true);
				south.setVisible(true);
				break;
				
			case "Center":
				west.setVisible(true);
				east.setVisible(true);
				north.setVisible(true);
				center.setVisible(false);
				south.setVisible(true);
				break;
			
			}
			
		}
		
	}
}
