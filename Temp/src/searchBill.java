
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Scanner;
public class searchBill extends JPanel {
	private static final int width = 250;
	private static final int height = 175;
	
	private JLabel searchOfBill;
	private JTextField billTextField;
	private JButton searchButton;
	
	public Scanner scan = new Scanner(System.in);
	
	public searchBill() {
		setSize(width,height);
		GridLayout aGrid = new GridLayout(3,1);
		setLayout(aGrid);
		searchOfBill = new JLabel ("Number of bill : ");
		billTextField = new JTextField(10);
		searchButton = new JButton("Search!");
		JPanel panelTop = new JPanel();
		JPanel panelMid = new JPanel();
		JPanel panelLow = new JPanel();
		
		// set dimention
		searchOfBill.setPreferredSize(new Dimension(95,70));
		billTextField.setPreferredSize(new Dimension(220, 25));
		
		// set font
		searchOfBill.setFont(new Font("Serif",0,15));
		
		billTextField.getText();
		
		panelTop.add(searchOfBill,BorderLayout.CENTER);
		panelMid.add(billTextField,BorderLayout.CENTER);
		panelLow.add(searchButton,BorderLayout.CENTER);
		add(panelTop,BorderLayout.NORTH);
		add(panelMid,BorderLayout.CENTER);
		add(panelLow,BorderLayout.SOUTH);
		
	}
	
}