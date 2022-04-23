package termproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class EndInfoFrame extends JFrame  {
	
	
	// ending mesage to display in option pane
	private String endmessage="Reservation name "+StartFrame.getCustomer().getName()+ " table for "+StartFrame.getCustomer().getPersonnumber()+ " people. Seat Number "
				+ StartFrame.getCustomer().getSeatnumber() +". Orders "+ MenuFrame.getMenu().getFood()+ " with total of "+ StartFrame.getCustomer().getTotal()+ "$";
	JProgressBar loadscreen= new JProgressBar();
	
	
	//ending option pane constructor
	public EndInfoFrame() {
		JOptionPane.showMessageDialog(null,endmessage,"Reservation Information",JOptionPane.INFORMATION_MESSAGE );

	}
}
