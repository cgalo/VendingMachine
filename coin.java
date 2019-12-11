//Create a coin object/class for: quarters, nickels, and dimes only
public enum coin {
    //Basic information of the coin options and its denomination
    quarter(25), nickel(5), dime (10);  //Given the coint and it's worth
    private int denomination;

    //Basic constructor for the coin
    private coin(int denomination) {
        this.denomination = denomination;
    }   //End of constructor

    //Getter for the denomation
    public int getDenomination() {
        return denomination;
    }
}   //End of the coin enum/class/object
