package termproject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class FiveSeatFrame extends JFrame implements ActionListener{
	
	
	//five seat class gui components 
	JFrame fiveseatframe= new JFrame();
	JButton fiveseatconfirm= new JButton("Confirm");
	JRadioButton three= new JRadioButton("Seat 3");
	JRadioButton four= new JRadioButton("Seat 4");
	JRadioButton five= new JRadioButton("Seat 5");
	ButtonGroup fiveseatgroup= new ButtonGroup();
	
	
	//five seat frame constructor
	public FiveSeatFrame() {
		fiveseatframe.setTitle("Five seated tables");
		fiveseatconfirm.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		
		fiveseatgroup.add(three);
		fiveseatgroup.add(four);
		fiveseatgroup.add(five);
		
		
		
		fiveseatframe.setVisible(true);
		fiveseatframe.setLayout(new FlowLayout());
		fiveseatframe.pack();
		fiveseatframe.setSize(400,150);
		fiveseatframe.setResizable(false);
		fiveseatframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		fiveseatframe.add(three);
		fiveseatframe.add(four);
		fiveseatframe.add(five);
		fiveseatframe.add(fiveseatconfirm);
	}
	
	

	// event listener method
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==three) {
			StartFrame.getCustomer().setSeatnumber("3");
			System.out.println(StartFrame.getCustomer().getName());
			System.out.println(StartFrame.getCustomer().getPersonnumber());
			System.out.println(StartFrame.getCustomer().getSeatnumber());
		}
		if(e.getSource()==four) {
			StartFrame.getCustomer().setSeatnumber("4");
			System.out.println(StartFrame.getCustomer().getName());
			System.out.println(StartFrame.getCustomer().getPersonnumber());
			System.out.println(StartFrame.getCustomer().getSeatnumber());
		}
		if(e.getSource()==five) {
			StartFrame.getCustomer().setSeatnumber("5");
			System.out.println(StartFrame.getCustomer().getName());
			System.out.println(StartFrame.getCustomer().getPersonnumber());
			System.out.println(StartFrame.getCustomer().getSeatnumber());

		}
		if(e.getSource()==fiveseatconfirm) {
			fiveseatframe.setVisible(false);
			new MenuFrame();
		}
		
	}

}
