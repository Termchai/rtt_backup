 
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
public class GUI_Store implements Runnable {
	private static GUI_Store instance;
	private static JFrame frame;
	private static JPanel panelMenu,panelFunction;
//	private searchBill sBill;
	private GUI_Store() {
		frame = new JFrame("Bill");
		initComponents();
	}
	public static GUI_Store getInstance()
	{
		if (instance == null)
			instance = new GUI_Store();
		return instance;
	}
	private static void initComponents() {
		// con
		JButton aButton = new JButton("Add Bill");
		JButton sButton = new JButton("Search Bill");
		panelFunction = panelMenu = new JPanel();
		
		// set location
		frame.setLocation(300, 200);
		
		// set dimention
		frame.setPreferredSize(new Dimension(500, 300));
		
		// add function
		aButton.addActionListener(new addBillButton_AL());
		sButton.addActionListener(new searchBillButton_AL());
		
		// add contain
		panelMenu.add(aButton, BorderLayout.NORTH);
		panelMenu.add(sButton, BorderLayout.SOUTH);
               
		// add frame
		frame.add(panelFunction,BorderLayout.NORTH);
		frame.add(panelMenu, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void run() {
		frame.pack();
		frame.setVisible(true);
	}
	public void setVisible(boolean visible)
	{
		frame.setVisible(visible);
	}
	public static void setPanelFunction(JPanel panel)
	{
		frame.remove(panelFunction);
		frame.pack();
		frame.setVisible(true);
		panelFunction=panel;
		frame.add(panelFunction,BorderLayout.NORTH);
		initComponents();
		frame.pack();
		frame.setVisible(true);
	}
}
class addBillButton_AL extends AbstractAction
{
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JPanel addBillz = new addBill();
		GUI_Store.getInstance().setPanelFunction(addBillz);
		
		GUI_Store.getInstance().run();
	}
	
}
class searchBillButton_AL extends AbstractAction
{
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JPanel searchBillz = new searchBill();
		GUI_Store.getInstance().setPanelFunction(searchBillz);
		
		GUI_Store.getInstance().run();
	}
	
}