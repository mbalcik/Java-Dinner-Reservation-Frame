package termproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MenuFrame extends JFrame implements ActionListener {
	
	
	// menu frame components to create a selection and addition page 
	JFrame menuframe= new JFrame();
	JButton menuconfirm= new JButton("Confirm");
	JButton soup= new JButton("Add soup");
	JButton mainmeal= new JButton("Add meat");
	JButton salad= new JButton("Add salad");
	JButton dessert= new JButton("Add dessert");
	JButton drink= new JButton("Add drink");
	
	//combo box string arrays
	private String[] souparray= {"Soups","Chicken Soup", "Veg.Soup", "Tomato Soup","Mushroom Soup","Noodle Soup"};
	private String[] mainarray= {"Meats","T-Bone","New York", "Dallas", "Ribeye","Lamb"};
	private String[] saladarray= {"Salads","Ceasar Salad", "Chicken Salad", "Fish Salad", "Meat Salad", "Green Salad"}; 
	private String[] dessertarray= {"Desserts", "Cheesecake", "Ice Cream", "Chocolate Pie", "Cupcake", "Waffle"};
	private String[] drinkarray= {"Drinks", "Water", "Coke", "Orange Juice", "Cherry Juice", "Energy Drink"};
	
	JComboBox soupcombo= new JComboBox(souparray);
	JComboBox maincombo= new JComboBox(mainarray);
	JComboBox saladcombo= new JComboBox(saladarray);
	JComboBox dessertcombo= new JComboBox(dessertarray);
	JComboBox drinkcombo= new JComboBox(drinkarray);
	
	
	// new menu item static class reference
	static MenuItem fullmeal= new MenuItem();
	
	private int mtotal= StartFrame.getCustomer().getTotal();
	
	//menu frame constructor
	public MenuFrame() {
		
		menuframe.setTitle("MENU");
		
		soup.setBounds(350,50,100,20);
		mainmeal.setBounds(350,150,100,20);
		salad.setBounds(350,250,100,20);
		dessert.setBounds(350,350,100,20);
		drink.setBounds(350,450,100,20);
		
		soupcombo.setBounds(250,50,100,20);
		maincombo.setBounds(250,150,100,20);
		saladcombo.setBounds(250,250,100,20);
		dessertcombo.setBounds(250,350,100,20);
		drinkcombo.setBounds(250,450,100,20);
		
		menuconfirm.setBounds(370,630,100,20);
		
		soup.addActionListener(this);
		mainmeal.addActionListener(this);
		salad.addActionListener(this);
		dessert.addActionListener(this);
		drink.addActionListener(this);
		menuconfirm.addActionListener(this);
		
		soupcombo.addActionListener(this);
		maincombo.addActionListener(this);
		saladcombo.addActionListener(this);
		dessertcombo.addActionListener(this);
		drinkcombo.addActionListener(this);
		
		menuframe.setVisible(true);
		menuframe.setLayout(null);
		menuframe.setSize(500,700);
		menuframe.setResizable(false);
		menuframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menuframe.add(soupcombo);
		menuframe.add(maincombo);
		menuframe.add(saladcombo);
		menuframe.add(dessertcombo);
		menuframe.add(drinkcombo);
		
		menuframe.add(soup);
		menuframe.add(mainmeal);
		menuframe.add(salad);
		menuframe.add(dessert);
		menuframe.add(drink);
		
		menuframe.add(menuconfirm);
	}
	
	// returns the selected menu 
	public static MenuItem getMenu() {
		return fullmeal;
	}

	//event listener
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==soup) {
			int item=soupcombo.getSelectedIndex();
			System.out.println(item);
			if(item==1) {
				mtotal+=16;
				fullmeal.addfood((String) soupcombo.getSelectedItem());
			}
			if(item==2) {
				mtotal+=7;
				fullmeal.addfood((String) soupcombo.getSelectedItem());
			}
			if(item==3) {
				mtotal+=9;
				fullmeal.addfood((String) soupcombo.getSelectedItem());
			}
			if(item==4) {
				mtotal+=8;
				fullmeal.addfood((String) soupcombo.getSelectedItem());
			}
			if(item==5) {
				mtotal+=13;
				fullmeal.addfood((String) soupcombo.getSelectedItem());
			}
		}		
		if(e.getSource()==mainmeal) {
			int item=maincombo.getSelectedIndex();
			System.out.println(item);
			if(item==1) {
				mtotal+=200;
				fullmeal.addfood((String) maincombo.getSelectedItem());
			}
			if(item==2) {
				mtotal+=180;
				fullmeal.addfood((String) maincombo.getSelectedItem());
			}
			if(item==3) {
				mtotal+=210;
				fullmeal.addfood((String) maincombo.getSelectedItem());
			}
			if(item==4) {
				mtotal+=195;
				fullmeal.addfood((String) maincombo.getSelectedItem());
			}
			if(item==5) {
				mtotal+=200;
				fullmeal.addfood((String) maincombo.getSelectedItem());
			}
		}		
		if(e.getSource()==salad) {
			int item=saladcombo.getSelectedIndex();
			System.out.println(item);
			if(item==1) {
				mtotal+=15;
				fullmeal.addfood((String) saladcombo.getSelectedItem());
			}
			if(item==2) {
				mtotal+=22;
				fullmeal.addfood((String) saladcombo.getSelectedItem());
			}
			if(item==3) {
				mtotal+=25;
				fullmeal.addfood((String) saladcombo.getSelectedItem());
			}
			if(item==4) {
				mtotal+=30;
				fullmeal.addfood((String) saladcombo.getSelectedItem());
			}
			if(item==5) {
				mtotal+=15;
				fullmeal.addfood((String) saladcombo.getSelectedItem());
			}
		}		
		if(e.getSource()==dessert) {
			int item=dessertcombo.getSelectedIndex();
			System.out.println(item);
			if(item==1) {
				mtotal+=30;
				fullmeal.addfood((String) dessertcombo.getSelectedItem());
			}
			if(item==2) {
				mtotal+=15;
				fullmeal.addfood((String) dessertcombo.getSelectedItem());
			}
			if(item==3) {
				mtotal+=20;
				fullmeal.addfood((String) dessertcombo.getSelectedItem());
			}
			if(item==4) {
				mtotal+=18;
				fullmeal.addfood((String) dessertcombo.getSelectedItem());
			}
			if(item==5) {
				mtotal+=23;
				fullmeal.addfood((String) dessertcombo.getSelectedItem());
			}
		}		
		if(e.getSource()==drink) {
			int item=drinkcombo.getSelectedIndex();
			System.out.println(item);
			if(item==1) {
				mtotal+=8;
				fullmeal.addfood((String) drinkcombo.getSelectedItem());
			}
			if(item==2) {
				mtotal+=11;
				fullmeal.addfood((String) drinkcombo.getSelectedItem());
			}
			if(item==3) {
				mtotal+=12;
				fullmeal.addfood((String) drinkcombo.getSelectedItem());
			}
			if(item==4) {
				mtotal+=12;
				fullmeal.addfood((String) drinkcombo.getSelectedItem());
			}
			if(item==5) {
				mtotal+=15;
				fullmeal.addfood((String) drinkcombo.getSelectedItem());
			}
		}
		if(e.getSource()==menuconfirm) {
			StartFrame.getCustomer().setTotal(mtotal);
			System.out.println(StartFrame.getCustomer().getTotal());
			menuframe.setVisible(false);
			new TipFrame();
		}
		
	}
}
