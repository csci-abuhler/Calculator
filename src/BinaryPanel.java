import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BinaryPanel extends JPanel {
	private static JLabel binaryDisplay = new JLabel("");
	private int numberToConvert = -1;

	// constructor
	public BinaryPanel(NumberPanel numberPanel) {
		numberToConvert = Integer.parseInt(numberPanel.getLabel().getText());
		alterDisplay(numberToConvert);
		this.add(binaryDisplay);
	} // constructor

	// Has the display show the binary number
	public static void alterDisplay(int number) {
		String binary = binaryConversion(number);
		binaryDisplay.setText(binary);
	} // alterDisplay

	// Where the decimal to binary conversion occurs
	public static String binaryConversion(int value) {
		boolean isPositive = value > 0;

		if (value == 1) {
			return String.valueOf(value);
		} // if

		String binary = "";
		int remainder = 0;

		while (value != 0) {
			remainder = value % 2;
			binary += remainder;
			value /= 2;
		} // while

		if (isPositive) {
			binary = new StringBuilder(binary).reverse().toString();
		} // if

		return binary;
	} // binaryConversion
} // class
