package termproject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TipFrame extends JFrame implements ActionListener {

	// tip frame gui components 
	JFrame tipframe= new JFrame();
	JRadioButton ten= new JRadioButton("%10");
	JRadioButton fifteen= new JRadioButton("%15");
	JRadioButton twenty= new JRadioButton("%20");
	ButtonGroup tipgroup= new ButtonGroup();
	private int tiptotal= StartFrame.getCustomer().getTotal();
	
	
	// tip frame constructor 
	public TipFrame() {
		
		tipframe.setTitle("Tip Rate");
		ten.addActionListener(this);
		fifteen.addActionListener(this);
		twenty.addActionListener(this);
		
		tipgroup.add(ten);
		tipgroup.add(fifteen);
		tipgroup.add(twenty);

		
		
		tipframe.setVisible(true);
		tipframe.setLayout(new FlowLayout());
		tipframe.pack();
		tipframe.setSize(400,150);
		tipframe.setResizable(false);
		tipframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tipframe.add(ten);
		tipframe.add(fifteen);
		tipframe.add(twenty);
		
	}
	
	
	// event listener
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ten) {
			tiptotal+= (tiptotal/10);
			StartFrame.getCustomer().setTotal(tiptotal);
			System.out.println(StartFrame.getCustomer().getTotal());
			new EndInfoFrame();
		}
		if(e.getSource()==fifteen) {
			tiptotal+= (tiptotal*15/100);
			StartFrame.getCustomer().setTotal(tiptotal);
			System.out.println(StartFrame.getCustomer().getTotal());
			new EndInfoFrame();
		}
		if(e.getSource()==twenty) {
			tiptotal+= (tiptotal/5);
			StartFrame.getCustomer().setTotal(tiptotal);
			System.out.println(StartFrame.getCustomer().getTotal());
			new EndInfoFrame();
		}
		
	}
	
}
