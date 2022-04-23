package termproject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SeatFrame extends JFrame implements ActionListener {
	
	
	
	
	//seat frame gui compobnents declaration 
	JFrame seatframe= new JFrame();
	JRadioButton one= new JRadioButton("1");
	JRadioButton two= new JRadioButton("2");
	JRadioButton three= new JRadioButton("3");
	JRadioButton four= new JRadioButton("4");
	JRadioButton five= new JRadioButton("5");
	ButtonGroup seatgroup= new ButtonGroup();

	// seat frame constructor
	public SeatFrame() {
		
		
		seatframe.setTitle("Number of Reservation");
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		
		seatgroup.add(one);
		seatgroup.add(two);
		seatgroup.add(three);
		seatgroup.add(four);
		seatgroup.add(five);
		
		seatframe.setVisible(true);
		seatframe.setLayout(new FlowLayout());
		seatframe.pack();
		seatframe.setSize(400,150);
		seatframe.setResizable(false);
		seatframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		seatframe.add(one);
		seatframe.add(two);
		seatframe.add(three);
		seatframe.add(four);
		seatframe.add(five);
	}
	

	// event listener method
	@Override
	public void actionPerformed(ActionEvent e) {
		
			if(e.getSource()==one) {
				StartFrame.getCustomer().setPersonnumber("1");
				System.out.println(StartFrame.getCustomer().getName());
				System.out.println(StartFrame.getCustomer().getPersonnumber());
				seatframe.setVisible(false);
				new TwoSeatFrame();
			}
			if(e.getSource()==two) {
				StartFrame.getCustomer().setPersonnumber("2");
				System.out.println(StartFrame.getCustomer().getName());
				System.out.println(StartFrame.getCustomer().getPersonnumber());
				seatframe.setVisible(false);
				new TwoSeatFrame();
			}
			if(e.getSource()==three) {
				StartFrame.getCustomer().setPersonnumber("3");
				System.out.println(StartFrame.getCustomer().getName());
				System.out.println(StartFrame.getCustomer().getPersonnumber());
				seatframe.setVisible(false);
				new FiveSeatFrame();
			}
			if(e.getSource()==four) {
				StartFrame.getCustomer().setPersonnumber("4");
				System.out.println(StartFrame.getCustomer().getName());
				System.out.println(StartFrame.getCustomer().getPersonnumber());
				seatframe.setVisible(false);
				new FiveSeatFrame();
			}
			if(e.getSource()==five) {
				StartFrame.getCustomer().setPersonnumber("5");
				System.out.println(StartFrame.getCustomer().getName());
				System.out.println(StartFrame.getCustomer().getPersonnumber());
				seatframe.setVisible(false);
				new FiveSeatFrame();
			}
	}
}
