//Class to create item for the VendingMachine
public class item {
    String itemName;    //Name of the item
    double cost;        //Cost of the item


    //Constructor for sItem
    public item(String itemName, double cost) {
        this.itemName = itemName;
        this.cost = cost;
    }

    //The following are the getters and setters for the item's name and cost
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName.toUpperCase(); //Always save in all caps to avoid any issues
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    //End of the getters and setters of the item

}   //End of the item class
