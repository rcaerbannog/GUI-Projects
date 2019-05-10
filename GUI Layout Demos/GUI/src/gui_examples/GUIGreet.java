package gui_examples;
//import javax.swing.JFrame;
//import javax.swing.JComponent;
//import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;

public class GUIGreet {
	
	public GUIGreet(){
		JFrame frame = new JFrame("Sample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 100);
		frame.add(new Drawing());
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[]Args){
		new GUIGreet();
	}
	
	class Drawing extends JComponent{
		
		public void paint(Graphics g){
			Font largeSerifFont = new Font("Serif", Font.ITALIC+Font.BOLD, 40);
			g.setFont(largeSerifFont);
			g.drawString("Hello, world!", 150, 50);
		}
	}
	
}
