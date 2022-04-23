package termproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StartFrame extends JFrame implements ActionListener{
	
	//the startup frame class and its gui componets declared outside of the constructer to use in actionperformed method
	
	
	JFrame sframe= new JFrame();
	JButton sconfirm= new JButton("Confirm");
	JTextField name = new JTextField();
	static Customer customer =new Customer();
	
	
	
	//creation of the starter frame 
	public StartFrame() {
		
		sframe.setTitle("Please Enter Reservation Name");
		
		name.setPreferredSize(new Dimension(300,30));
		
 		sconfirm.addActionListener(this);
		
		sframe.setVisible(true);
		sframe.setLayout(new FlowLayout());
		sframe.pack();
		sframe.setSize(400,150);
		sframe.setResizable(false);
		sframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		sframe.add(sconfirm);
		sframe.add(name); 		
	}


	//event listeers 
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sconfirm) {
			System.out.println("hi");
			customer.setName(name.getText());
			sframe.setVisible(false);
			new SeatFrame();
			System.out.println(customer.getName());
		}
		
	}
	
	// to be able to see in other classes without the reference of object, a static method
	public static Customer getCustomer() {
			return customer;	
	}
	
}
