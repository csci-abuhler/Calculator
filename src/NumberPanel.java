import javax.swing.JLabel;
import javax.swing.JPanel;

// panel for displaying the numbers
@SuppressWarnings("serial")
public class NumberPanel extends JPanel {
	private JLabel numberDisplay = new JLabel("0");

	// constructor
	public NumberPanel() {
		this.add(numberDisplay);
	} // constructor

	// returns the label
	public JLabel getLabel() {
		return numberDisplay;
	} // getter

	// adds the numbers pressed to the display
	public void changeDisplay(String input) {
		if (numberDisplay.getText().equals("") || numberDisplay.getText().equals("0")) {
			numberDisplay.setText(input);
		} else {
			numberDisplay.setText(numberDisplay.getText() + input);
		} // if
		checkDisplays();
	} // change number

	// Causes the displays to go blank when switching numbers
	public void checkDisplays() {
		if (!numberDisplay.getText().equals("")) {
			BinaryPanel.alterDisplay(Integer.parseInt(numberDisplay.getText()));
		} else {
			BinaryPanel.alterDisplay(0);
		} // if
	} // check displays

	// allows the backspace button to function properly
	public void backspace() {
		// backspace does not allow for more backspacing when the string length
		// is zero
		if (numberDisplay.getText().length() > 0) {
			numberDisplay.setText(numberDisplay.getText().substring(0, numberDisplay.getText().length() - 1));
		} // if
		checkDisplays();
	} // backspace
} // class
