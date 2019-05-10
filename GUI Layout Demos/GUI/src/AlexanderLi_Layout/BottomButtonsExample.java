package AlexanderLi_Layout;
import javax.swing.*;
import java.awt.*;

/**
 * <h1>Bottom Buttons Example (example 2)</h1>
 * @author Alexander Li
 * @version 1.0, 2019-03-07
 */
public class BottomButtonsExample {
	/**
	 * 
	 */
	public BottomButtonsExample(){
		JFrame frame = new JFrame("Bottom Buttons");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLayout(new BorderLayout());
		
		Font largerFont = new Font(Font.SERIF, 32, Font.PLAIN);
		
		JPanel topPane = new JPanel();
		topPane.setLayout(new FlowLayout());
		topPane.add(new JButton("top"));
		frame.add(topPane, BorderLayout.NORTH);
		
		JPanel bottomPane = new JPanel();
		bottomPane.setLayout(new FlowLayout());
		bottomPane.add(new JButton("Yes"));
		bottomPane.add(Box.createHorizontalStrut(20));
		bottomPane.add(new JButton("No"));
		bottomPane.add(Box.createHorizontalStrut(20));
		bottomPane.add(new JButton("??"));
		frame.add(bottomPane, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
	
	/**
	 * 
	 * @param Args
	 */
	public static void main(String[]Args){
		new BottomButtonsExample();
	}
}

//Notes
//To make larger buttons, either change the Button's PreferredSize by button1.setPreferredSize(int x, int y);
//Or set each button's font to be larger