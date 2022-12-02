import Expense 
import Fund

#default constructor
class  HouseholdBudget:

    def __init__(self):
        fund =  Fund( 0 ,  0 ,  0 ,  0 ,  0 )
        expenses = Expense[0]

    def __init__(self, fund, expenses):
        self.fund = fund
        if(len.expenses== 0 or expenses[0] == None ):
            self.expenses = expenses[1]
        else:
            self.expenses = expenses

    def totalExpenses(self):
        return len.expenses

    def  fundtotal_equals(self, fund1):
        if(HouseholdBudget.fund.fundtotal() == HouseholdBudget.fund1.fundtotal()):
            return True
        else:
            return False

    def fundtype_equals(self, fund1):
        if(HouseholdBudget.fund.fundtype() == HouseholdBudget.fund1.fundtype()):
            return True
        else:
            return False
  
    def get_Expenses(self):
         return self.expenses.clone()
        
    def add_Expenses(self):
        type = input("Type of expense (Bill, Purchase, etc...): ")
        amount = input("Amount of expense: ")
        name = input("Name of business: ")
        day = input("Payment due day number and month (separate by space): "); month = input
        new_expense = Expense(type, amount, day, month, name)
        if( len(self.expenses) == 0 or self.expenses[0] == None ):
            self.expenses = Expense[1]
            self.expenses[0] = new_expense
            return len.expenses
        else:
            self.expenses = Expense[len(self.expenses) + 1]
            self.expenses[len(self.expenses) - 1] = new_expense
            return len.expenses
    
    def remove_Expenses(self):
        if(self.expenses == None or len(self.expenses) == 0):
            return "Household budget has no expenses"
        else:
            if(len.self.expenses == 1):
                self.expenses = Expense[0]
                return "Expense removed"
            else:
              which_expense = input("Enter number 0 to " + (len.self.expenses - 1) + ":")
            if(which_expense < 0 or which_expense > (len.self.expenses - 1)):
                return "Invalid number"
            else:
                self.expenses = Expense[len(self.expenses) - 1]
                for i in range(which_expense, len(self.expenses)):
                    self.expenses[i] = self.expenses[i + 1]
                return "Expense removed"

    def update_date(self):
        if(self.expenses[0] == None):
            print("sorry, no expenses to update")
        else:
            index = input("Which expense do you want to update? (Enter number 0 to " + (len.self.expenses - 1) + "): ")
            while(which_expense < 0 or which_expense > (len.self.expenses - 1)):
                which_expense = input("Sorry but there is no expense number " + index)
                print("--> Try again:")
                index = input("Enter number 0 to " + (len.self.expenses - 1) + ":")

            self.expenses[index].setDay(input)
            self.expenses[index].setMonth(input)
            print("Due date updated")

    def add_fund(self): 
        user_input = input("How many loonies, toonies, 5$, 10$, and 20$ do you want to add?\nEnter 5 number (seperated byspace): ")
        loonies = user_input[0]
        toonies = user_input[1]
        five = user_input[2]
        ten = user_input[3]
        twenty = user_input[4]
        self.fund.add_fund(loonies, toonies, five, ten, twenty)
        return "you now have $" + self.fund.fundtotal() +".0"

    def equals(self, HouseholdBudget1):
        if(self.fund.equals(HouseholdBudget.get.fund) and len.self.expenses.equals(len(HouseholdBudget1.get.expenses))):
            return True
        else:
            return False
    def toString(self):
        result = ""
        result += self.fund.toString() + "\n"
        if(self.expenses[0] == None or len(self.expenses) == 0):
            result += "No expenses\n"
        else:
            for i in range(0, len(self.expenses)):
                result += self.expenses[i].toString() + "\n"
        return result

    def print_fund(self):
        return self.fund.toString()



         
    
   