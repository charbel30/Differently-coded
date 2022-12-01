class Expense:
    def __init__(self):
        self.expense_type = ' '
        self.amount = 0
        self.day = 0
        self.month = 0
        self.Name = ' '

    def __init__(self, type, amount, day, month, name):
        self.expense_type = type
        self.amount = amount
        if day < 1 or day > 31:
            self.day = 0
        else:
            self.day = day
        if month < 1 or month > 12:
            self.month = 0
        else:
            self.month = month
        self.Name = name

    def __init__(self, Expense2):
        self.expense_type = Expense2.expense_type
        self.amount = Expense2.amount
        self.day = Expense2.day
        self.month = Expense2.month
        self.Name = Expense2.Name

    def create_expense(self, type, amount, day, month, name):
        self.expense_type = type
        self.amount = amount
        if day < 1 or day > 31:
            self.day = 0
        else:
            self.day = day
        if month < 1 or month > 12:
            self.month = 0
        else:
            self.month = month
        self.Name = name

    def getExpense_type(self):
        return self.expense_type

    def getAmount(self):
        return self.amount

    def getDay(self):
        return self.day

    def setDay(self, day):
        if day < 1 or day > 31:
            self.day = 0
        else:
            self.day = day

    def getMonth(self):
        return self.month

    def setMonth(self, month):
        if month < 1 or month > 12:
            self.month = 0
        else:
            self.month = month

    def getName(self):
        return self.Name

    def __str__(self):
        if self.day < 10 and self.month < 10:
            return self.expense_type + ' - $' + str(self.amount) + ' - ' + self.Name + ' - 0' + str(self.day) + '/0' + str(self.month) + '.'
        elif self.day < 10 and self.month >= 10:
            return self.expense_type + ' - $' + str(self.amount) + ' - ' + self.Name + ' - 0' + str(self.day) + '/' + str(self.month) + '.'
        elif self.day >= 10 and self.month < 10:
            return self.expense_type + ' - $' + str(self)
            

    def equals(self, Expense2):
        if (
      self.expense_type == Expense2.expense_type and
      self.amount == Expense2.amount and
      self.day == Expense2.day and
      self.month == Expense2.month and
      self.Name == Expense2.Name
            ): return True;
        else: return False;
            