package Restaurant;
import java.util.ArrayList;
import java.util.Date;
public class Menu {
    private Date dateUpdated;
    private ArrayList<MenuItem> currentMenu;

    public Menu(Date dateUpdated, ArrayList<MenuItem> currentMenu) {
        this.dateUpdated = dateUpdated;
        this.currentMenu = currentMenu;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public ArrayList<MenuItem> getCurrentMenu() {
        return currentMenu;
    }

    public void setCurrentMenu(ArrayList<MenuItem> currentMenu) {
        this.currentMenu = currentMenu;
    }
//    addItem method
}
