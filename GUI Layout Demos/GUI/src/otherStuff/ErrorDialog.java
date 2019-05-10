package otherStuff;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * The ErrorDialog class creates a JDialog error message for a caught exception.
 * @author Alexander Li
 * @version 2019-03-29
 */
public class ErrorDialog {
	/**
	 * The class constructor creates a new JDialog with the title being the type and cause of the exception.
	 * A custom text message can be displayed for various exceptions. By default the dialog will say that an
	 * error has occurred and print the stack trace. The JDialog is then set as visible.
	 * @param e, the exception that was caught
	 */
	public ErrorDialog(Exception e){
		JDialog errorDialog = new JDialog();
	    errorDialog.setLayout(new FlowLayout());
	    errorDialog.setTitle("Error Exception: " + e);
	    JLabel errorLabel = new JLabel();
	    errorLabel.setHorizontalAlignment(JLabel.CENTER);
	    if (e instanceof NumberFormatException){
	    	errorLabel.setText("<html><body width=180><p>Enter a valid integer.</p></body></html>");
	    }
	    else{
	    	errorLabel.setText("<html><body width=180>An error has occured.<p></p></body></html>");
	    	e.printStackTrace();
	    }
	    
	    JButton closeButton = new JButton("Close");
	    closeButton.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent e){
	        errorDialog.dispose();
	      }
	    });
	    errorDialog.add(errorLabel);
	    errorDialog.add(closeButton);
	    
	    errorDialog.setSize(200,100);
	    errorDialog.setResizable(false);
	    errorDialog.setVisible(true);
	}
}
