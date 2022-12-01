public class Fund {

    // Create constants for the different bill denominations
    public static final int LOONIES = 1;
    public static final int TOONIES = 2;
    public static final int FIVE_DOLLAR_BILL = 5;
    public static final int TEN_DOLLAR_BILL = 10;
    public static final int TWENTY_DOLLAR_BILL = 20;

    // Create private variables for each bill denomination
    private int loonies;
    private int toonies;
    private int fiveDollarBill;
    private int tenDollarBill;
    private int twentyDollarBill;

    public Fund() {
        // Initialize all variables to 0
        this.loonies = 0;
        this.toonies = 0;
        this.fiveDollarBill = 0;
        this.tenDollarBill = 0;
        this.twentyDollarBill = 0;
    }// end of default constructor

    // Create a constructor for the class
    public Fund(
            int loonies,
            int toonies,
            int fiveDollarBill,
            int tenDollarBill,
            int twentyDollarBill
    ) {

        // Initialize the private variables using the parameters
        this.loonies = loonies;
        this.toonies = toonies;
        this.fiveDollarBill = fiveDollarBill;
        this.tenDollarBill = tenDollarBill;
        this.twentyDollarBill = twentyDollarBill;
    }// end constructor

    public Fund(Fund Fund2) {
        if (Fund2 == null) {
            System.out.println("Fatal Error.");
            System.exit(0);
        }
        this.loonies = Fund2.loonies;
        this.toonies = Fund2.toonies;
        this.fiveDollarBill = Fund2.fiveDollarBill;
        this.tenDollarBill = Fund2.tenDollarBill;
        this.twentyDollarBill = Fund2.twentyDollarBill;
    }//end of copy constructor

    // Create getters and setters for each private variable
    public int getLoonies() {
        return loonies;
    }

    public void setLoonies(int loonies) {
        this.loonies = loonies;
    }

    public int getToonies() {
        return toonies;
    }

    public void setToonies(int toonies) {
        this.toonies = toonies;
    }

    public int getFiveDollarBill() {
        return fiveDollarBill;
    }

    public void setFiveDollarBill(int fiveDollarBill) {
        this.fiveDollarBill = fiveDollarBill;
    }

    public int getTenDollarBill() {
        return tenDollarBill;
    }

    public void setTenDollarBill(int tenDollarBill) {
        this.tenDollarBill = tenDollarBill;
    }

    public int getTwentyDollarBill() {
        return twentyDollarBill;
    }

    public void setTwentyDollarBill(int twentyDollarBill) {
        this.twentyDollarBill = twentyDollarBill;
    }//end of getters and setters

    // create method with 5 integer parameters which allows you to increase the number of each fund type
    public void addFunds(int loonies, int toonies, int fiveDollarBill, int tenDollarBill, int twentyDollarBill) {
        this.loonies += loonies;
        this.toonies += toonies;
        this.fiveDollarBill += fiveDollarBill;
        this.tenDollarBill += tenDollarBill;
        this.twentyDollarBill += twentyDollarBill;
    }//end addFunds

    // create method which returns the total value of all funds
    public int fundtotal() {
        return (loonies * LOONIES) + (toonies * TOONIES) + (fiveDollarBill * FIVE_DOLLAR_BILL) + (tenDollarBill * TEN_DOLLAR_BILL) + (twentyDollarBill * TWENTY_DOLLAR_BILL);
    }

    // create method which returns a string with the number of each fund type
    public String toString() {
        return "(" + loonies +" x $1) + (" +  + toonies + " x $2) + (" + fiveDollarBill + " x $5) + (" + tenDollarBill + " x $10) + (" + twentyDollarBill + " x $20)";
    }//end toString

    // 6. Create a method which returns the total value of all funds
    public boolean equals(Fund Fund2) {
        if (loonies == Fund2.loonies &&
                toonies == Fund2.toonies &&
                fiveDollarBill == Fund2.fiveDollarBill &&
                tenDollarBill == Fund2.tenDollarBill &&
                twentyDollarBill == Fund2.twentyDollarBill) {
            return true;
        } else {
            return false;
        }
    }
}//end of class

