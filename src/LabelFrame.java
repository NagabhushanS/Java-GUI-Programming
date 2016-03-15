import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class LabelFrame extends JFrame{
	private JLabel label1, label2, label3, label4;
	
	public LabelFrame(){
		super("LabelFrame Test");
		
		setLayout(new FlowLayout());
		
		label1 = new JLabel("This is label 1");
		label1.setToolTipText("Label 1");
		add(label1);
		
		label2 = new JLabel("This is label 2");
		label2.setToolTipText("Label2");
		label2.setIcon(new ImageIcon("icon.png"));
		label2.setHorizontalTextPosition(SwingConstants.CENTER);
		label2.setVerticalTextPosition(SwingConstants.TOP);
		add(label2);
		
		label3 = new JLabel("This is label 3", new ImageIcon("icon.png"), SwingConstants.RIGHT);
		label3.setToolTipText("Label 3");
		add(label3);
		
		label4 = new JLabel( "Unicode\u3078\u3087\u3045" +
				"\u3053\u305D\u0021" );
		add(label4);
	}
	
}
