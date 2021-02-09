import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

// Driver class for the calculator 
public class Driver {
	private final static int WIDTH = 400;
	private final static int HEIGHT = 600;

	// creates and shows the gui
	public static void createAndShowGUI() {
		JFrame frame = new JFrame("CALCULATOR");
		frame.setSize(new Dimension(WIDTH, HEIGHT));

		// main panel for the other panels
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 1));

		// panel for the displays to be added
		JPanel displayPanel = new JPanel();
		displayPanel.setLayout(new GridLayout(2, 1));

		// panel to display the decimal numbers
		NumberPanel numberPanel = new NumberPanel();

		// panel for the buttons to be added
		ButtonPanel buttonPanel = new ButtonPanel(numberPanel);

		// panel to display the binary digits
		BinaryPanel binaryPanel = new BinaryPanel(numberPanel);

		// add everything together
		displayPanel.add(binaryPanel);
		displayPanel.add(numberPanel);
		panel.add(displayPanel);
		panel.add(buttonPanel);
		frame.add(panel);

		// add ability to close frame and center screen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		centerOfScreen(frame);
	} // create and show gui

	// centers the frame on the screen
	public static void centerOfScreen(JFrame frame) {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
		frame.setResizable(false);
		frame.setVisible(true);
	} // center of screen

	// the main method
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			} // run
		}); // Runnable
	} // main
} // Driver class
