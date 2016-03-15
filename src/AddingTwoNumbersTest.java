import javax.swing.JOptionPane;

public class AddingTwoNumbersTest {

	public static void main(String[] args) {
		String number1 = JOptionPane.showInputDialog(null, "Enter first number", "Enter number", JOptionPane.QUESTION_MESSAGE);
		String number2 = JOptionPane.showInputDialog("Enter second number");
		
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		
		int sum = n1 + n2;
		
		JOptionPane.showMessageDialog(null, "The sum of the two numbers is " + sum, "Sum of two numbers", JOptionPane.INFORMATION_MESSAGE);
		

	}

}
