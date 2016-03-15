import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutAlignmentFrame extends JFrame {
	private JButton button1, button2, button3;
	private Container container;
	private FlowLayout layout;

	public LayoutAlignmentFrame() {
		super("LayoutAlignment Test");

		layout = new FlowLayout();
		setLayout(layout);

		container = getContentPane();

		button1 = new JButton("Left");
		add(button1);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				layout.setAlignment(FlowLayout.LEFT);
				layout.layoutContainer(container);

			}
		});

		button2 = new JButton("Center");
		add(button2);
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				layout.setAlignment(FlowLayout.CENTER);
				layout.layoutContainer(container);

			}
		});

		button3 = new JButton("Right");
		add(button3);
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				layout.setAlignment(FlowLayout.RIGHT);
				layout.layoutContainer(container);

			}
		});
	}

}
