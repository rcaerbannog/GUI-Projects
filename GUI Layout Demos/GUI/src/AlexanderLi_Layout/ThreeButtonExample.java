package AlexanderLi_Layout;
import javax.swing.*;
import java.awt.*;

/**
 * <h1>Three Buttons Example (example 3)</h1>
 * @author Alexander Li
 * @version 1.0, 2019-03-07
 */
public class ThreeButtonExample {
	/**
	 * 
	 */
	public ThreeButtonExample(){
		JFrame frame = new JFrame("3 Buttons");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(240, 90);
		frame.setLayout(new GridLayout(1, 3));
		frame.add(new JButton("A"));
		frame.setVisible(true);
		frame.add(new JButton("B"));
		frame.add(new JButton("C"));
		
		frame.setVisible(true);
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new ThreeButtonExample();

	}
	
	//Interesting notes:
	//frame.setVisible(true) updates the JFrame or other GUI item.
	//Until that happens it will not update, even if something is changed

}
