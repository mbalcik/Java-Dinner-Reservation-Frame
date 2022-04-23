package termproject;

public class Customer {

	// to create a customer with the selection of user via gui interface
	private String name;
	private String personnumber;
	private String seatnumber;
	private String menuselection;
	private int total;
	
	//customer class constructor (I didn't wanted to retur null so I can see when I did something wrong in the project) 
	public Customer() {
		name="TBA";
		personnumber="TBA";
		seatnumber="TBA";
		menuselection="TBA";
		total=0;
	}

	//getters and setter for customer class
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(String seatnumber) {
		this.seatnumber = seatnumber;
	}

	public String getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(String menuselection) {
		this.menuselection = menuselection;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getPersonnumber() {
		return personnumber;
	}

	public void setPersonnumber(String personnumber) {
		this.personnumber = personnumber;
	}
	
}
