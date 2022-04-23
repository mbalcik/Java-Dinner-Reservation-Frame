package termproject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class TwoSeatFrame extends JFrame implements ActionListener {
	
	// two seat frame gui components
	JFrame twoseatframe= new JFrame();
	JButton twoseatconfirm= new JButton("Confirm");
	JRadioButton one= new JRadioButton("Seat 1");
	JRadioButton two= new JRadioButton("Seat 2");
	ButtonGroup seatgroup= new ButtonGroup();
	
	
	// two seat frame constructor
	public TwoSeatFrame() {
		twoseatframe.setTitle("Two seated tables");
		twoseatconfirm.addActionListener(this);
		one.addActionListener(this);
		two.addActionListener(this);
		
		seatgroup.add(one);
		seatgroup.add(two);
		
		
		twoseatframe.setVisible(true);
		twoseatframe.setLayout(new FlowLayout());
		twoseatframe.pack();
		twoseatframe.setSize(400,150);
		twoseatframe.setResizable(false);
		twoseatframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		twoseatframe.add(one);
		twoseatframe.add(two);
		twoseatframe.add(twoseatconfirm);
	}
	
	
	

	//event listener
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==one) {
			StartFrame.getCustomer().setSeatnumber("1");
			System.out.println(StartFrame.getCustomer().getName());
			System.out.println(StartFrame.getCustomer().getPersonnumber());
			System.out.println(StartFrame.getCustomer().getSeatnumber());
		}
		if(e.getSource()==two) {
			StartFrame.getCustomer().setSeatnumber("2");
			System.out.println(StartFrame.getCustomer().getName());
			System.out.println(StartFrame.getCustomer().getPersonnumber());
			System.out.println(StartFrame.getCustomer().getSeatnumber());
		}
		if(e.getSource()==twoseatconfirm) {
			twoseatframe.setVisible(false);
			new MenuFrame();
		}
		
	}

}
