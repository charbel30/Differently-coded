class Fund:

    # Create constants for the different bill denominations
    LOONIES = 1
    TOONIES = 2
    FIVE_DOLLAR_BILL = 5
    TEN_DOLLAR_BILL = 10
    TWENTY_DOLLAR_BILL = 20

    def __init__(
        self, loonies, toonies, fiveDollarBill, tenDollarBill, twentyDollarBill
    ):
        # Initialize all variables to 0
        self.loonies = 0
        self.toonies = 0
        self.fiveDollarBill = 0
        self.tenDollarBill = 0
        self.twentyDollarBill = 0

    # Create a constructor for the class
    def __init__(
        self, loonies, toonies, fiveDollarBill, tenDollarBill, twentyDollarBill
    ):

        # Initialize the private variables using the parameters
        self.loonies = loonies
        self.toonies = toonies
        self.fiveDollarBill = fiveDollarBill
        self.tenDollarBill = tenDollarBill
        self.twentyDollarBill = twentyDollarBill

    def __init__(self, Fund2):
        if Fund2 == None:
            print("Fatal Error.")
            exit(0)
        self.loonies = Fund2.loonies
        self.toonies = Fund2.toonies
        self.fiveDollarBill = Fund2.fiveDollarBill
        self.tenDollarBill = Fund2.tenDollarBill
        self.twentyDollarBill = Fund2.twentyDollarBill

    # Create getters and setters for each private variable
    def getLoonies(self):
        return self.loonies

    def setLoonies(self, loonies):
        self.loonies = loonies

    def getLoonies(self):
        return self.loonies

    def setLoonies(self, loonies):
        self.loonies = loonies

    def getToonies(self):
        return self.toonies

    def setToonies(self, toonies):
        self.toonies = toonies

    def getFiveDollarBill(self):
        return self.fiveDollarBill

    def setFiveDollarBill(self, fiveDollarBill):
        self.fiveDollarBill = fiveDollarBill

    def getTenDollarBill(self):
        return self.tenDollarBill

    def setTenDollarBill(self, tenDollarBill):
        self.tenDollarBill = tenDollarBill

    def getTwentyDollarBill(self):
        return self.twentyDollarBill

    def setTwentyDollarBill(self, twentyDollarBill):
        self.twentyDollarBill = twentyDollarBill

    def addFunds(
        self, loonies, toonies, fiveDollarBill, tenDollarBill, twentyDollarBill
    ):
        self.loonies += loonies
        self.toonies += toonies
        self.fiveDollarBill += fiveDollarBill
        self.tenDollarBill += tenDollarBill
        self.twentyDollarBill += twentyDollarBill

    def   fundtotal(self):
        return (
            (self.loonies * 1)
            + (self.toonies * 2)
            + (self.fiveDollarBill * 5)
            + (self.tenDollarBill * 10)
            + (self.twentyDollarBill * 20)
        )

    def __str__(self):
        return (
            "("
            + str(self.loonies)
            + " x $1) + ("
            + str(self.toonies)
            + " x $2) + ("
            + str(self.fiveDollarBill)
            + " x $5) + ("
            + str(self.tenDollarBill)
            + " x $10) + ("
            + str(self.twentyDollarBill)
            + " x $20)"
        )
