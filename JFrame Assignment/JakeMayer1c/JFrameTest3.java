import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Font;
/**
 * The JFrameTest class creates the application window, 
 * menu bar, File menu and the Quit File menu ite. It then adds
 * the menu item to the File menu and the File menu to the
 * menubar. It also ensures that the window will close if the user 
 * clicks the 'x' button.
 *    
 * 
 * @author Jake Mayer
 * @version 1 01.28.15
 */ 
public class JFrameTest3 extends JFrame implements ActionListener{
  /**
 * The class constructor passes a String title when it creates
 * the superclass objcet. It then creates the application window, 
 * menu bar, File and Help menus and the Quit File, Help Help and About Help menu ite. It then adds
 * the menu item to the File, menu and the help/about items to the Help, menu and the File/Help menus to the
 * menubar. It sets the size of the Frame to 400x400, and
 * ensures it will be visible.  It also ensures that the 
 * window will close if the user clicks the 'x' button.
 * <p>
 * <b>Local variables: </b>
 * <p>
 * <b>quitItem </b> This creates an instance of the JMenuItem class called "Quit".
 * <p>
 * <b>helpItem </b> This creates an instance of the JMenuItem class called "Help".
 * <p>
 * <b>aboutItem </b> This creates an instance of the JMenuItem class called "About".
 * <p>
 * <b>fileMenu </b> This creates an instance of the JMenu class called "File".
 * <p>
 * <b>helpMenu </b> This creates an instance of the JMenu class called "Help".
 * <p>
 * <b>myMenus </b> This creates an instance of the JMenuBar class.
 */ 
  public JFrameTest3() { 
    super ("JFrame Test 3");
    
    TextTest t = new TextTest();
    add(t);
    
    JMenuItem quitItem = new JMenuItem ("Quit");
    JMenuItem helpItem = new JMenuItem ("Help");
    JMenuItem aboutItem = new JMenuItem ("About");
    
    JMenu fileMenu = new JMenu ("File");
    JMenu helpMenu = new JMenu ("Help");
    
    fileMenu.add (quitItem);
    helpMenu.add (helpItem);
    helpMenu.add (aboutItem);
    
    JMenuBar myMenus = new JMenuBar ();
    
    myMenus.add (fileMenu);
    myMenus.add (helpMenu);
    
    setJMenuBar (myMenus);
    
    quitItem.addActionListener(this);
    helpItem.addActionListener(this);
    aboutItem.addActionListener(this);
    
    setSize (400, 400);
    setVisible (true);
    
    setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
  }
  
  /**
 * The method creates a JDialog window and sets its size to 100p by 100p with
 * a Flow Layout. It then creates a button on the window that closes the window 
 * when clicked. It then adds the button to the window and makes the window visible.
 * <p>
 * <b>Local variables: </b>
 * <p>
 * <b>myDialog</b> This creates an instance of the JDialog class titled "Help Me".
 * <p>
 * <b>helpButton</b> This creates an instance of the JButton class labeled "Help Me!".
 */ 
  private void helpDialog ()
  {
    JDialog myDialog = new JDialog(this, "Help Me");
    myDialog.setSize(100,100);
    myDialog.setResizable(false);
    myDialog.setLayout(new FlowLayout());
    JLabel helpLabel = new JLabel("Help");
    helpLabel.setFont(new Font("Serif",Font.PLAIN, 16));
    myDialog.add(helpLabel);     
    JButton closeButton = new JButton("Close");
    myDialog.add(closeButton);
    closeButton.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){myDialog.dispose();}});
    myDialog.setLocationRelativeTo(this);
    myDialog.setVisible(true);
  }
  
  /**
 * The method creates a JDialog window and sets its size to 500p by 100p with
 * a Flow Layout. It then creates a button on the window that closes the window 
 * when clicked. It then adds the button to the window and makes the window visible.
 * <p>
 * <b>Local variables: </b>
 * <p>
 * <b>myDialog</b> This creates an instance of the JDialog class titled "About Me".
 * <p>
 * <b>helpButton</b> This creates an instance of the JButton class labeled "I have voluntary control over my tensor tympani muscle.".
 */ 
  private void aboutDialog ()
  {
    JDialog myDialog = new JDialog(this, "About Me");
    myDialog.setSize(500,100);
    myDialog.setResizable(false);
    myDialog.setLayout(new FlowLayout());
    JLabel infoLabel = new JLabel("I have voluntary control over my tensor tympani muscle.");
    infoLabel.setFont(new Font("Serif",Font.PLAIN, 16));
    myDialog.add(infoLabel);     
    JButton closeButton = new JButton("Close"); 
    myDialog.add(closeButton);
    closeButton.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){myDialog.dispose();}});
    myDialog.setLocationRelativeTo(this);
    myDialog.setVisible(true);
  }
  
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getActionCommand().equals("Quit"))
    {
      dispose();
    }
    else if (ae.getActionCommand().equals("Help"))
    {
      helpDialog();
    }
    else if (ae.getActionCommand().equals("About"))
    {
      aboutDialog();
    }
  } //JFrameTest class
}

