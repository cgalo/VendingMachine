import java.util.*;
public class mainClass {
    public static void main (String args[]){
        //Initialize the vendingMachine object
        VendingMachine VM = new VendingMachine();

        //Initialize scanner to get user input
        Scanner sc = new Scanner(System.in);
        //Create while loop to display the menu
        while (true){
            System.out.println("Please select # of item from the list: ");
            VM.printInventory();    //Print the inventory of the VM
            //Create a while loop to allow the user only to enter a # for item or coin
            while (!sc.hasNextInt())
                sc.next();
            int input = sc.nextInt();   //Get the number
            //If input is greater than 0 we go on, else we disregard the input and send back to the menu
            if (input > 0){
                //Check if the input ranges from the vending machine item
                switch (input){
                    //Case for monster
                    case 1:
                        selectItem("monster");

                        break;

                    //Case for sprite
                    case 2:
                        selectItem("sprite");
                        break;

                    //Case for coke
                    case 3:
                        selectItem("coke");
                        break;

                    //If inserted cash
                    default: insertedCash(input);
                }
            }

        }   //End of while loop

    }   //End of mainClass

    public static void selectItem(String item){

    }

    public static void insertedCash(int initCash){

    }
}
