import java.util.Scanner;

public class BudgetDemo {
    public static void main(String[] args) {
        //create Fund object
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("Welcome to COMP248 Geek's HouseholdBudget_2022 Application\n");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        Fund householdbudget1_fund = new Fund(6, 7, 10, 15, 10);
        Fund householdbudget2_fund = new Fund(6, 7, 10, 15, 10);
        Fund householdbudget3_fund = new Fund(7, 19, 5, 5, 15);
        Fund householdbudget4_fund = new Fund(15, 10, 9, 11, 25);
        Fund householdbudget5_fund = new Fund(15, 10, 9, 11, 25);
        Expense Expense = new Expense("purchase", 81000, 15, 8, "Tesla");
        Expense Expense1 = new Expense("bill", 30, 31, 10, "Rogers");
        Expense Expense2 = new Expense("purchase", 1000, 7, 8, "Samsung");
        Expense Expense3 = new Expense("bill", 20, 10, 4, "Bell");
        Expense Expense4 = new Expense("purchase", 232, 10, 10, "society");
        Expense[] householdbudget1_expenses = {Expense};
        Expense[] householdbudget2_expenses = {Expense3};
        Expense[] householdbudget3_expenses = {Expense4, Expense1, Expense2};
        Expense[] householdbudget4_5expenses = new Expense[0];
        HouseholdBudget householdBudget1 = new HouseholdBudget(householdbudget1_fund, householdbudget1_expenses);
        HouseholdBudget householdBudget2 = new HouseholdBudget(householdbudget2_fund, householdbudget2_expenses);
        HouseholdBudget householdBudget3 = new HouseholdBudget(householdbudget3_fund, householdbudget3_expenses);
        HouseholdBudget householdBudget4 = new HouseholdBudget(householdbudget4_fund, householdbudget4_5expenses);
        HouseholdBudget householdBudget5 = new HouseholdBudget(householdbudget5_fund, householdbudget4_5expenses);
        System.out.println(householdBudget1.equals(householdBudget4));
        //create Scanner object
        Scanner user_inputs = new Scanner(System.in);
        usermenu();
        int inputs = user_inputs.nextInt();
        HouseholdBudget[] householdBudgets = {householdBudget1, householdBudget2, householdBudget3, householdBudget4, householdBudget5};

        do {
            if (inputs > 9 || inputs < 0) {
                System.out.println("sorry, that is not a valid choice. Try again.\n");
                usermenu();
                inputs = user_inputs.nextInt();

            } else {
                switch (inputs) {
                    case 1:
                        Allhouseholdbudgets(householdBudget1, householdBudget2, householdBudget3, householdBudget4, householdBudget5);
                        break;
                    case 2:
                        get_householdbudget(householdBudget1, householdBudget2, householdBudget3, householdBudget4, householdBudget5);
                        break;
                    case 3:
                        get_sametotalhouse_fund(householdBudget1, householdBudget2, householdBudget3, householdBudget4, householdBudget5);
                        break;
                    case 4:
                        get_sametypehouse_fund(householdBudget1, householdBudget2, householdBudget3, householdBudget4, householdBudget5);
                        break;
                    case 5:
                        //if there is one expense only it automatically removes it from the Expense array
                        get_samehouse_fund_expense(householdBudget1, householdBudget2, householdBudget3, householdBudget4, householdBudget5);
                        break;
                    case 6:
                        System.out.print("Which HouseholdBudget do you want to add an  expense to? (Enter number 0 to " + (householdBudgets.length - 1) + "): ");
                        int add_expense_input = user_inputs.nextInt();
                        while (add_expense_input > householdBudgets.length - 1 || add_expense_input < 0) {
                            System.out.print("sorry, that is not a valid choice. Try again(0 to 4):");
                            add_expense_input = user_inputs.nextInt();
                        }
                        householdBudgets[add_expense_input].add_Expenses();
                        System.out.println("You now have have " + householdBudgets[add_expense_input].total_Expenses() + " expense");
                        break;
                    case 7:
                        System.out.print("Which HouseholdBudget do you want to remove an  expense from? (Enter number 0 to " + (householdBudgets.length - 1) + "): ");
                        int remove_expense_input = user_inputs.nextInt();
                        while (remove_expense_input > householdBudgets.length - 1 || remove_expense_input < 0) {
                            System.out.print("sorry, that is not a valid choice. Try again(0 to 4):");
                            remove_expense_input = user_inputs.nextInt();
                        }
                        System.out.println(householdBudgets[remove_expense_input].remove_expenses());
                        break;
                    case 8:
                        System.out.print("Which HouseholdBudget do you want to update an expense from? (Enter number 0 to " + (householdBudgets.length - 1) + "): ");
                        int update_expense_input = user_inputs.nextInt();
                        while (update_expense_input > householdBudgets.length - 1 || update_expense_input < 0) {
                            System.out.print("sorry, that is not a valid choice. Try again(0 to 4):");
                            update_expense_input = user_inputs.nextInt();
                        }
                        householdBudgets[update_expense_input].update_date();
                        break;
                    case 9:
                        System.out.print("Which HouseholdBudget do you want to add Fund to? (Enter number 0 to " + (householdBudgets.length - 1) + "): ");
                        int add_fund_input = user_inputs.nextInt();
                        while (add_fund_input > householdBudgets.length - 1 || add_fund_input < 0) {
                            System.out.print("sorry, that is not a valid choice. Try again(0 to 4):");
                            add_fund_input = user_inputs.nextInt();
                        }
                        System.out.println(householdBudgets[add_fund_input].add_fund());
                        break;
                }
                System.out.println("\n");
                usermenu();
                inputs = user_inputs.nextInt();
            }
        } while (inputs != 0);
        System.out.println("Thank you for using COMP248 Geek's HouseholdBudget application!");
        user_inputs.close();

    }

    public static void usermenu() {
        String menu = "What would you like to do?\n" +
                "1. See the possessions of all householdBudgets\n" +
                "2. See the possessions of one householdBudget\n" +
                "3. List householdBudgets with same total amount of fund\n" +
                "4. List householdBudgets with same fund denomination(s)\n" +
                "5. List householdBudgets with same total amount of fund and same number of expenses\n" +
                "6. Add an expense to an existing householdBudget\n" +
                "7. Remove an existing expense from a householdBudget\n" +
                "8. Update the payment due date of an existing expense\n" +
                "9. Add fund to a householdBudget\n" +
                "0. To quit\n\n" +
                "Please enter your choice and press <Enter>:";
        System.out.print(menu);
    }

    //create a method to display all householdbudgets
    public static void Allhouseholdbudgets(HouseholdBudget householdBudget1, HouseholdBudget householdBudget2, HouseholdBudget householdBudget3, HouseholdBudget householdBudget4, HouseholdBudget householdBudget5) {
        String Allhouseholdbudgets = "Content of each HouseholdBudget:\n-----------------------\n" +
                "HouseholdBudget #0:\n" + householdBudget1.toString() + "\n" +
                "HouseholdBudget #1:\n" + householdBudget2.toString() + "\n" +
                "HouseholdBudget #2:\n" + householdBudget3.toString() + "\n" +
                "HouseholdBudget #3:\n" + householdBudget4.toString() + "\n" +
                "HouseholdBudget #4:\n" + householdBudget5.toString() + "\n";
        System.out.println(Allhouseholdbudgets);
    }

    // create a method to get the householdbudget by index which is easily updated by the programmer
    public static void get_householdbudget(HouseholdBudget householdBudget1, HouseholdBudget householdBudget2, HouseholdBudget householdBudget3, HouseholdBudget householdBudget4, HouseholdBudget householdBudget5) {
        Scanner user_input = new Scanner(System.in);
        HouseholdBudget[] householdBudgets = {householdBudget1, householdBudget2, householdBudget3, householdBudget4, householdBudget5};
        System.out.print("Which Householdbudget you want to see the possessions of? (Enter a number between 0 and " + (householdBudgets.length - 1) + ": ");
        int input = user_input.nextInt();

        while (input < 0 || input > householdBudgets.length - 1) {
            System.out.println("Sorry but there is no HouseholdBudget number " + input + "\n --> Try again Enter a number between 0 and " + (householdBudgets.length - 1) + ":");
            input = user_input.nextInt();
        }
        {
            switch (input) {
                case 0:
                    System.out.println(householdBudgets[0].toString());
                    break;
                case 1:
                    System.out.println(householdBudgets[1].toString());
                    break;
                case 2:
                    System.out.println(householdBudgets[2].toString());
                    break;
                case 3:
                    System.out.println(householdBudgets[3].toString());
                    break;
                case 4:
                    System.out.println(householdBudgets[4].toString());
                    break;

            }
        }
        user_input.close();
    }

    // create a method to get householdbudget with same fund total
    public static void get_sametotalhouse_fund(HouseholdBudget householdBudget1, HouseholdBudget householdBudget2, HouseholdBudget householdBudget3, HouseholdBudget householdBudget4, HouseholdBudget householdBudget5) {
        HouseholdBudget[] householdBudgets = {householdBudget1, householdBudget2, householdBudget3, householdBudget4, householdBudget5};
        System.out.println("List of HouseholdBudgets with same total fund:\n");
        for (int i = 0; i < householdBudgets.length; i++) {
            for (int j = i + 1; j < householdBudgets.length; j++) {
                if (householdBudgets[i].fundtotals_equals(householdBudgets[j]))
                    System.out.println("HouseholdBudget #" + i + " and HouseholdBudget #" + j + " both have " + householdBudgets[i].total_fund() + ".0$");
            }
        }
    }

    public static void get_sametypehouse_fund(HouseholdBudget householdBudget1, HouseholdBudget householdBudget2, HouseholdBudget householdBudget3, HouseholdBudget householdBudget4, HouseholdBudget householdBudget5) {
        HouseholdBudget[] householdBudgets = {householdBudget1, householdBudget2, householdBudget3, householdBudget4, householdBudget5};
        System.out.println("List of HouseholdBudgets with same Fund:\n");
        for (int i = 0; i < householdBudgets.length; i++) {
            for (int j = i + 1; j < householdBudgets.length; j++) {
                if (householdBudgets[i].fundtype_equals(householdBudgets[j]))
                    System.out.println("HouseholdBudget #" + i + " and HouseholdBudget #" + j + " both have " + householdBudgets[i].getFund() + "$");
            }
        }
    }

    public static void get_samehouse_fund_expense(HouseholdBudget householdBudget1, HouseholdBudget householdBudget2, HouseholdBudget householdBudget3, HouseholdBudget householdBudget4, HouseholdBudget householdBudget5) {
        HouseholdBudget[] householdBudgets = {householdBudget1, householdBudget2, householdBudget3, householdBudget4, householdBudget5};
        System.out.println("List of HouseholdBudgets with same amount of money and same number of expenses :");
        for (int i = 0; i < householdBudgets.length; i++) {
            for (int j = i + 1; j < householdBudgets.length; j++) {
                if (householdBudgets[i].equals(householdBudgets[j])) {
                    System.out.println("householdBudget " + (i) + " and " + j);
                }
            }
        }  
    }

}
