import javax.swing.JFrame;

public class ButtonFrameTest {
	public static void main(String[] args){
		ButtonFrame myFrame = new ButtonFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(200, 200);
		myFrame.setVisible(true);
	}

}
