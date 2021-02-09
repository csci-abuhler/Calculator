import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

// class to manage the button panel
@SuppressWarnings("serial")
public class ButtonPanel extends JPanel {
	private JButton one = new JButton("1");
	private JButton two = new JButton("2");
	private JButton three = new JButton("3");
	private JButton four = new JButton("4");
	private JButton five = new JButton("5");
	private JButton six = new JButton("6");
	private JButton seven = new JButton("7");
	private JButton eight = new JButton("8");
	private JButton nine = new JButton("9");
	private JButton zero = new JButton("0");
	private JButton equals = new JButton("=");
	private JButton add = new JButton("+");
	private JButton subtract = new JButton("-");
	private JButton multiply = new JButton("*");
	private JButton backspace = new JButton("<");
	private JButton divide = new JButton("/");

	private int previous = -1;
	private int choice = 0;

	public ButtonPanel(NumberPanel numberPanel) {
		this.setLayout(new GridLayout(4, 4));

		// action listeners for each number button from zero to nine
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numberPanel.changeDisplay("0");
			} // action performed
		}); // add action listener for zero button

		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numberPanel.changeDisplay("1");
			} // action performed
		}); // add action listener for one button

		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numberPanel.changeDisplay("2");
			} // action performed
		}); // add action listener for two button

		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numberPanel.changeDisplay("3");
			} // action performed
		}); // add action listener for three button

		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numberPanel.changeDisplay("4");
			} // action performed
		}); // add action listener for four button

		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numberPanel.changeDisplay("5");
			} // action performed
		}); // add action listener for five button

		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numberPanel.changeDisplay("6");
			} // action performed
		}); // add action listener for six button

		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numberPanel.changeDisplay("7");
			} // action performed
		}); // add action listener for seven button

		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numberPanel.changeDisplay("8");
			} // action performed
		}); // add action listener for eight button

		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numberPanel.changeDisplay("9");
			} // action performed
		}); // add action listener for nine button

		// action listener for the backspace feature
		backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numberPanel.backspace();
			} // action performed
		}); // add action listener for backspace button

		// action listener for the add feature
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				previous = Integer.parseInt(numberPanel.getLabel().getText());
				choice = 1;
				numberPanel.getLabel().setText("0");
				BinaryPanel.alterDisplay(0);
			} // action performed
		}); // add action listener for add button

		// action listener for the multiply feature
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				previous = Integer.parseInt(numberPanel.getLabel().getText());
				choice = 2;
				numberPanel.getLabel().setText("0");
				BinaryPanel.alterDisplay(0);
			} // action performed
		}); // add action listener for multiply button

		// action listener for the subtract feature
		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				previous = Integer.parseInt(numberPanel.getLabel().getText());
				choice = 3;
				numberPanel.getLabel().setText("0");
				BinaryPanel.alterDisplay(0);
			} // action performed
		}); // add action listener for subtract button

		// action listener for the divide feature
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				previous = Integer.parseInt(numberPanel.getLabel().getText());
				choice = 4;
				numberPanel.getLabel().setText("0");
				BinaryPanel.alterDisplay(0);
			} // action performed
		}); // add action listener for divide button

		// action listener for the equals feature
		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = 0;
				if (choice == 1) {
					result = previous + Integer.parseInt(numberPanel.getLabel().getText());
				} else if (choice == 2) {
					result = previous * Integer.parseInt(numberPanel.getLabel().getText());
				} else if (choice == 3) {
					result = previous - Integer.parseInt(numberPanel.getLabel().getText());
				} else if (choice == 4) {
					result = previous / Integer.parseInt(numberPanel.getLabel().getText());
				} // if
				choice = 0;

				BinaryPanel.alterDisplay(result);
				numberPanel.getLabel().setText(String.valueOf(result));
			} // action performed
		}); // add action listener for equals button

		// add items to panel
		this.add(one);
		this.add(two);
		this.add(three);
		this.add(add);
		this.add(four);
		this.add(five);
		this.add(six);
		this.add(subtract);
		this.add(seven);
		this.add(eight);
		this.add(nine);
		this.add(multiply);
		this.add(backspace);
		this.add(zero);
		this.add(equals);
		this.add(divide);
	} // constructor
} // number panel