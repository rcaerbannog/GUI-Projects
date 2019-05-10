package AlexanderLi_Envelope;
import javax.swing.*;
import java.awt.*;

/**
 * <h1>Envelope Example (example 1)</h1>
 * @author Alexander Li
 * @version 1.0, 2019-03-06
 */
public class Envelope {
	
	/**
	 * 
	 */
	public Envelope(){
		JFrame envelopeSurface = new JFrame("Envelope");
		envelopeSurface.setSize(400, 200);
		envelopeSurface.add(new Drawing());
		envelopeSurface.setVisible(true);
		envelopeSurface.setLocation(500, 400);	//Sets position of the frame on computer window
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Envelope e = new Envelope();

	}
	
	/**
	 * 
	 * @author 333818292
	 *
	 */
	class Drawing extends JComponent{
		/**
		 * @param g
		 */
		public void paint(Graphics g){
			Font largeFontSerif = new Font("Serif", Font.PLAIN, 14);
			g.setFont(largeFontSerif);
			g.drawString("Alexander Li", 120, 60);
			g.drawString("79 Harrington Cres", 120, 80);
			g.drawString("TORONTO ON M2M 2Y7", 120, 100);
		}
	}

}
