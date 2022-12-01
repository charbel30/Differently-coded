import java.util.Scanner;

public class HouseholdBudget {
    // Create a Fund object called fund.
    private final Fund fund;
    // Create an array of Expense objects called expenses.
    private Expense[] expenses;

    // Create a default constructor for the class
    public HouseholdBudget() {
        fund = new Fund();
        expenses = new Expense[0];
    }

    // Create a constructor for the class
    public HouseholdBudget(Fund fund, Expense[] expenses) {
        this.fund = fund;

        if (expenses.length == 0 || expenses[0] == null) {

            this.expenses = new Expense[1];
        } else {

            this.expenses = expenses;
        }
    }

    public int total_Expenses() {
        return this.expenses.length;
    }

    //  return true if 2 household fund are equal
    public boolean fundtotals_equals(HouseholdBudget fund1) {
        if (fund.fundtotal() == fund1.total_fund()) {
            return true;
        } else {
            return false;
        }
    }

    // Return true if the fund object passed in equals the fund object passed in.
    public boolean fundtype_equals(HouseholdBudget fund1) {
        if (fund.equals(fund1.getFund())) {
            return true;
        } else {
            return false;
        }
    }

    //create getter for fund
    public Fund getFund() {
        return fund;
    }

    // Return the total fund of a household
    public int total_fund() {
        return fund.fundtotal();
    }

    // create getter for expenses
    public Expense[] getExpenses() {
       //return a temp of Expense array for privacy leak
       return  expenses.clone();
    }

    // Create a method to add an expense to the expenses array
    public int add_Expenses() {
        Scanner input = new Scanner(System.in);
        System.out.print("Type of expense (Bill, Purchase, etc...): ");
        String type = input.next();
        System.out.print("Amount of expense: ");
        double amount = input.nextDouble();
        System.out.print("Name of the business: ");
        String name = input.next();
        System.out.print(" Payment due day number and month (separate by space): ");
        int day = input.nextInt();
        int month = input.nextInt();
        Expense new_expense = new Expense(type, amount, day, month, name);

        if (this.expenses.length == 0 || this.expenses[0] == null) {
            this.expenses = new Expense[1];
            this.expenses[0] = new_expense;
            return this.expenses.length;
        } else {
            Expense[] copy = new Expense[this.expenses.length + 1];
            System.arraycopy(this.expenses, 0, copy, 0, this.expenses.length);
            this.expenses = copy;
            this.expenses[this.expenses.length - 1] = new_expense;
            return this.expenses.length;
        }
    }

    //create a remove expense method from the array of expenses in the householdbudget
    public String remove_expenses() {
        /* in the assignment it says that it returns false or true but it's more convenient
         to return a string to the user just like the demo you gave we just write less sout statements.*/
        for (int i = 0; i < expenses.length;) {
            if (this.expenses[i] == null)
                return "Sorry Household has no expenses";
            else {
                //if the array has only one element
                if (this.expenses.length == 1) {
                    this.expenses[i] = null;
                    return "expense was removed successfully";
                } else {
                    Scanner input = new Scanner(System.in);
                    System.out.println("(Enter number 0 to " + (this.expenses.length - 1) + "):");
                    int index = input.nextInt();
                    if (index < 0 || index > this.expenses.length - 1){
                        return "wrong input";
                }
                    else {
                        Expense[] copy = new Expense[this.expenses.length - 1];
                        //copy the elements before the index
                        System.arraycopy(this.expenses, 0, copy, 0, index);
                        //copy the elements after the index
                        System.arraycopy(this.expenses, index + 1, copy, index, this.expenses.length - index - 1);
                        this.expenses = copy;
                        return "expense was removed successfully";
                    }
                }
            }
        }
        return "Sorry Household has no expenses";
    }

    //create a method to change the due date of an expense
    public void update_date() {
        Scanner input = new Scanner(System.in);
        {
            if (this.expenses[0] == null) {
                System.out.println("Sorry Household has no expenses");
            } else {
                System.out.println("Which expense do you want to update? (Enter number 0 to " + (this.expenses.length - 1) + "):");
                int index = input.nextInt();
                while (index < 0 || index > this.expenses.length - 1) {

                    System.out.println("Sorry but there is no expense number " + index);
                    System.out.println("--> Try again:");
                    System.out.println("(Enter number 0 to " + (this.expenses.length - 1) + "):");
                    index = input.nextInt();
                }

                System.out.print("Enter the new payment due day and month (separated by space): ");
                int day = input.nextInt();
                int month = input.nextInt();
                while (day < 1 || day > 31 || month < 1 || month > 12) {
                    System.out.println("Sorry but the date you entered is not valid");
                    System.out.print("--> Try again:");
                    day = input.nextInt();
                    month = input.nextInt();
                }
                this.expenses[index].setDay(day);
                this.expenses[index].setMonth(month);
                System.out.println("Due date updated");

            }
        }
    }

    //create a method to add money to the fund
    public String add_fund() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many loonies, toonies, 5$, 10$, and 20$ do you want to add?\n"
                + "Enter 5 number (seperated by a space): ");
        int loonies = input.nextInt();
        int toonies = input.nextInt();
        int fiveDollarBill = input.nextInt();
        int tenDollarBill = input.nextInt();
        int twentyDollarBill = input.nextInt();
        //call addFunds method
        this.fund.addFunds(loonies, toonies, fiveDollarBill, tenDollarBill, twentyDollarBill);
        //display the total amount of money in the fund
        return "You now have $" + this.fund.fundtotal() + ".0";
       
    }

    // create an equals method for the householdbudget class
    public boolean equals(HouseholdBudget householdBudget) {
        if (this.fund.equals(householdBudget.getFund()) && householdBudget.getExpenses().length == this.expenses.length) {
            return true;
        } else {
            return false;
        }
      
    }

    //create a method to display the household budget
    public String toString() {

        String result = "";
        result += this.fund.toString() + "\n";
        if (this.expenses.length == 0 || this.expenses[0] == null) {
            result += "No expenses\n";
        } else {
            for (int i = 0; i < this.expenses.length; i++) {
                result += this.expenses[i].toString() + "\n";
            }

        }
        return result;
    }

    //create a method to display the funds of a household
    public void print_fund() {
        System.out.println(this.fund.toString());
    }
}





