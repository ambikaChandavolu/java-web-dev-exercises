package RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    // Class Variables
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    // Category
public Menu(){ this.lastUpdated = new Date(); }

    // Methods
    public ArrayList<MenuItem> getMenuItems() { return this.menuItems; }
    public void setMenuItems(ArrayList<MenuItem> aMenuItems){ this.menuItems = aMenuItems; }

    public Date getLastUpdated(){ return  this.lastUpdated; }
    public void setLastUpdated(Date aLastUpdated){ this.lastUpdated = aLastUpdated; }
}
