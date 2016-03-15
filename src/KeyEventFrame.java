import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyEventFrame extends JFrame implements KeyListener{
	private JTextArea area;
	
	public KeyEventFrame(){
		super("KeyEventFrame Test");
		
		area = new JTextArea(10, 15);
		area.setText("Enter any key!");
		area.setEnabled(false);
		area.setDisabledTextColor(Color.BLACK);
		add(area, BorderLayout.CENTER);
		addKeyListener(this);
		
	}
	
	// normal key
	@Override
	public void keyPressed(KeyEvent event) {
		String key = KeyEvent.getKeyText(event.getKeyCode());
		area.setText(String.format("User pressed: %s", key));
		System.out.printf("The key is %san action key\n", event.isActionKey() ? "": "not ");
		String modCheck = KeyEvent.getKeyModifiersText(event.getModifiers());
		System.out.printf("The key is %sa modifier key\n", modCheck.equals("") ? "not ": "");
		
	}

	@Override
	public void keyReleased(KeyEvent event) {
		
	}

	//action key
	@Override
	public void keyTyped(KeyEvent event) {
		area.setText(String.format("User typed: %s", event.getKeyChar()));
	}

}
