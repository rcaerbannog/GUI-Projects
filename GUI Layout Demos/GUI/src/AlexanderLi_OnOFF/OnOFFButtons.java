package AlexanderLi_OnOFF;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * <h1>OnOFF Buttons (example 4)</h1>
 * @author 333818292
 * @version 1.0, 2019-03-08
 */
public class OnOFFButtons implements ActionListener {
	JButton onButton = new JButton("On");
	JButton offButton = new JButton("Off");
	JFrame frame = new JFrame("OnOFFButtons");
	
	/**
	 * Class Constructor
	 */
	public OnOFFButtons() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		onButton.addActionListener(this);
		offButton.addActionListener(this);
		frame.setLayout(new FlowLayout());
		frame.add(onButton);
		frame.add(offButton);
		frame.setSize(200, 100);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setVisible(true);
	}

	/**
	 * Implementation of ActionLister's actionPerformed() method
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == onButton)
			frame.getContentPane().setBackground(Color.WHITE);
		else
			frame.getContentPane().setBackground(Color.BLACK);
	}

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		new OnOFFButtons();
	}

}
