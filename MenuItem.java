package termproject;

import java.util.LinkedHashSet;
import java.util.Set;

public class MenuItem {
	
	
	// menu item class set for prevent any duplication 
	private Set<String> food;
	
	//constructor to keep track of addition to the set (linked hash set)
	public MenuItem() {
		food = new LinkedHashSet<String>();
	}

	//getter for food set
	public Set<String> getFood() {
		return food;
	}
	
	//to add food to the set 
	public void addfood(String meal) {
		food.add(meal);
	}

}
