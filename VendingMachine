import java.util.HashMap;
//Vending Machine class
public class VendingMachine {
    //Hashmap to hold the item object and the stock of the item
    public HashMap <item, Integer> inventory = new HashMap<>();
    int numItems;

    //Basic constructor for Vending Machine
    public VendingMachine() {
        initialize();
    }

    //Create a private initializer
    private void initialize(){
        numItems = 0;
        //Insert items into the vending machine
        //Inserting coke item, worth $1.25 with 20 in stock
        inventory.put(new item ("coke", 125), 20);
        //Inserting sprite item, worth $1.25 with 20 in stock
        inventory.put(new item("sprite", 125), 20);
        //Inserting monster item, worth $1.50 with 5 in stock
        inventory.put(new item("monster", 150), 5);
    }   //End of initializer, inserted 3 items with cost and their stock

    //Method prints inventory in the vending machine
    public void printInventory(){
        int countItems = 0;
        //Loop through the inventory items and print their names/keys
        //If wanted we can add an if to check that if the stock = 0 then don't print the name of the item
        for (item currentItem: inventory.keySet()){
            countItems++;
            System.out.println(currentItem.getItemName() + ": #" +  countItems);
        }
        System.out.println('\n');
        //Update the count of items in the Vending Machine
        numItems = countItems;
    }   //End of printInventory()

    //Method returns true if the item is in stock and vend, else sout message and return false
    public boolean vendingItem(String requestedItem){
        //Check first if requested item is in stock
        int stock = inventory.get(requestedItem);
        //First check if we have in stock
        if (stock > 0){
            System.out.println("Vending your item...");
            stock--;    //Remove one of the stock of the item
            return true;
        }
        //If there are no more stock of the item
        else{
            System.out.println("Sorry, we are out of that item!");
            return false;
        }
    }   //End of method stockItem
}
