public class Expense {
    private String expense_type;//type of expense
    private double amount; //amount of expense
    private int day; //due date of expense
    private int month; //due date of expense
    private String Name; //name of expense

    //Constructor with no parameters
    public Expense() {
        expense_type = " ";
        amount = 0;
        day = 0;
        month = 0;
        Name = " ";
    }

    //Constructor with parameters
    public Expense(String type, double amount, int day, int month, String name) {
        this.expense_type = type;
        this.amount = amount;
        if (day < 1 || day > 31) {
            this.day = 0;
        } else {
            this.day = day;
        }
        if (month < 1 || month > 12) {
            this.month = 0;
        } else {
            this.month = month;
        }
        this.Name = name;

    }

    //Copy Constructor
    public Expense(Expense Expense2) {
        this.expense_type = Expense2.expense_type;
        this.amount = Expense2.amount;
        this.day = Expense2.day;
        this.month = Expense2.month;
        this.Name = Expense2.Name;
    }
    public void create_expense(String type, double amount, int day, int month, String name){
        this.expense_type = type;
        this.amount = amount;
        if (day < 1 || day > 31) {
            this.day = 0;
        } else {
            this.day = day;
        }
        if (month < 1 || month > 12) {
            this.month = 0;
        } else {
            this.month = month;
        }
        this.Name = name;
    }

    //Get methods
    public String getExpense_type() {
        return expense_type;
    }

    public double getAmount() {
        return amount;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31)
            this.day = 0;
        else
            this.day = day;

    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12)
            this.month = 0;
        else
            this.month = month;
    }

    public String getName() {
        return Name;
    } //end of getters and setters

    public String toString() {
        return
                (day < 10 && month < 10) ? expense_type + " - $" + amount + " - " + Name + " - 0" + day + "/0" + month + "." :
                        (day < 10 && month >= 10) ? expense_type + " - $" + amount + " - " + Name + " - 0" + day + "/" + month + "." :
                                (day >= 10 && month < 10) ? expense_type + " - $" + amount + " - " + Name + " - " + day + "/0" + month + "." :
                                        expense_type + " - $" + amount + " - " + Name + " - " + day + "/" + month + ".";
    }

    public boolean equals(Expense Expense2) {
        if (this.expense_type.equals(Expense2.expense_type) &&
                this.amount == Expense2.amount &&
                this.day == Expense2.day &&
                this.month == Expense2.month &&
                this.Name.equals(Expense2.Name))
            return true;
        else
            return false;
    }
} //end of Expense class