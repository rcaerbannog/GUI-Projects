import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.FlowLayout;
/**
 * The TextTest class creates the content for the application window, 
 * it contains an input method for outlining input and an output
 * method for processing and output.
 * @author Jake Mayer, Alexander Li
 * @version 1 01.28.15
 */ 
public class TextTest extends JPanel
{
  /**
   * Constructor calls the methods, first the input method and then
   * the processing/output method.
   */
  public TextTest()
  {
    inputPrompt();
    outputResult();
  }
   /**
 * The method creates a JLabel to help guide the user's actions.
 * <p>
 * <b>Local variables: </b>
 * <p>
 * <b>enterValue</b> This creates an instance of the JLabel class labeled "Enter a value".
 */ 
  public void inputPrompt()
  {
    JLabel enterValue;
    enterValue = new JLabel("Enter a value");
    enterValue.setFont(new Font("Serif",Font.PLAIN, 16));
    add(enterValue);                   
  }
   /**
 * The method creates a JButton and two JTextFields. The first text field
 * receives the user's input while the secod text field displays the output.
 * When pressed, the JButton will square the text in the input text field,
 * if the input is invalid, an error message will be displayed. All of these
 * are then added to "this" object.
 * <p>
 * <b>Local variables: </b>
 * <p>
 * <b>calculate</b> This creates an instance of the JButton class labeled "Calculate".
 * <p>
 * <b>inputField</b> This creates an instance of the JTextField class.
 * <p>
 * <b>outputField</b> This creates an instance of the JTextField class.
 */ 
  public void outputResult()
  {
    JButton calculate = new JButton("Calculate");
    JTextField inputField = new JTextField(20);
    JTextField outputField = new JTextField(25);
    add(inputField);
    add(outputField);
    add(calculate);
    
    JDialog errorDialog = new JDialog();
    errorDialog.setLayout(new FlowLayout());
    errorDialog.setTitle("Error: NumberFormatException");
    JLabel errorLabel = new JLabel("Enter a valid integer.");
    JButton closeButton = new JButton("Close");
    closeButton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        errorDialog.dispose();
      }
    });
    errorDialog.add(errorLabel);
    errorDialog.add(closeButton);
    
    errorDialog.setSize(150,100);
    errorDialog.setResizable(false);
    errorDialog.setLocationRelativeTo(this);
    
    calculate.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent e)
      { 
        try
        {
          int number = Integer.parseInt(inputField.getText());
          outputField.setText("The square is " + Integer.toString(number*number));
        }
        catch(NumberFormatException ex)
        {
          errorDialog.setVisible(true);
          outputField.setText ("");
          inputField.setText("");
          inputField.requestFocus();
        }
        inputField.setText("");
      }
    }
    );
  }
}