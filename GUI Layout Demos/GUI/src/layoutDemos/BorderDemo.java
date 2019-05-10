package layoutDemos;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class BorderDemo {

	public BorderDemo(){
		JFrame frame = new JFrame("Border Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);;
		frame.setLayout(new BorderLayout());;
		frame.add(new JButton("Center"), BorderLayout.CENTER);
		frame.add(new JButton("WEST"), BorderLayout.WEST);
		frame.add(new JButton("EAST"), BorderLayout.EAST);
		frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		frame.add(new JButton("NORTH"), BorderLayout.NORTH);
		frame.setVisible(true);;
	}

}
