package layoutDemos;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class FlowDemo {

	public FlowDemo(){
		JFrame frame = new JFrame("Flow Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,  100);;
		frame.setLayout(new FlowLayout());;
		frame.add(new JButton("A"));
		frame.add(new JButton("B"));
		frame.add(new JButton("C"));
		frame.add(new JButton("D"));
		frame.add(new JButton("E"));
		frame.setVisible(true);;
	}

}
