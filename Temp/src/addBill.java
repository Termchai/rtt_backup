
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
import java.util.ArrayList;
import java.util.Scanner;
public class addBill extends JPanel {
	private static final int width = 250;
	private static final int height = 175;
	
	private JLabel numOfBill;
	private JTextField numTextField;
	private JButton addNum;
	
	public Scanner scan = new Scanner(System.in);
	
	public addBill() {
		setSize(width,height);
		GridLayout aGrid = new GridLayout(3,1);
		setLayout(aGrid);
		numOfBill = new JLabel ("Number of bill : ");
		numTextField = new JTextField(10);
		addNum = new JButton("Add!");
		
		addNum.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Done!");
			}
			
		});
		
		
		JPanel panelTop = new JPanel();
		JPanel panelMid = new JPanel();
		JPanel panelLow = new JPanel();
		
		// set dimention
		numOfBill.setPreferredSize(new Dimension(95,70));
		numTextField.setPreferredSize(new Dimension(220, 25));
		
		// set font
		numOfBill.setFont(new Font("Serif",0,15));
		
		ArrayList<String> inputList = new ArrayList<String>();
		inputList.add(numTextField.getText());
		
		panelTop.add(numOfBill,BorderLayout.CENTER);
		panelMid.add(numTextField,BorderLayout.CENTER);
		panelLow.add(addNum,BorderLayout.CENTER);
		add(panelTop,BorderLayout.NORTH);
		add(panelMid,BorderLayout.CENTER);
		add(panelLow,BorderLayout.SOUTH);
		
	}
	
}