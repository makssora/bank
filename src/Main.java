import java.util.Date;
public class Main {
    public static void main(String[] args){
        //create account
        Accounts account = new Accounts();
        //create Employees
        String firstname;
        Employees employee1 = new Employees();
        Employees employee2 = new Employees();
        Employees employee3 = new Employees();
        //create bank Building
        Employees[] listOfEmployees = {employee1, employee2, employee3};
        BankBuildings building = new BankBuildings(1000000.0, 10.0, listOfEmployees);
        //check if employee in bank list
        building.employeeCheckList(employee3);
        //create debit card
        Debit debitCard1 = new Debit(200200200, 1000000);
        Debit debitCard2 = new Debit(200200201, 1000000);
        //create credit card
        Credit creditCard1 = new Credit(200200202, 1000000.0, 1000000.0, 0.1);
        Credit creditCard2 = new Credit(200200203, 1000000.0, 1000000.0, 0.1);
        //transfer money from debit to debit card
        debitCard1.transfer(debitCard2, 10);
        //transfer money from debit to credit card
        debitCard1.transfer(creditCard2, 10);
        //transfer money from credit to debit card
        creditCard1.transfer(debitCard2, 10);
        //transfer money from credit to credit card
        creditCard1.transfer(creditCard2, 10);
        //create ATM
        ATM atm = new ATM(1000000, 20, 2);
        //cashOut from debit card
        atm.cashOut(debitCard2);
        //cashOut from actual balance credit card
        atm.cashOut(creditCard2);
        //cashOut from credit balance from credit card
        atm.cashOutCredit(creditCard2);
        //create cashRegister
        CashRegister cashRegister = new CashRegister("11 May 2022", 10000000, 30);
        //create teller and let him work in cashRegister
        Teller teller = new Teller();
        teller.setWorkInBank(true);
        //add money to cashBox from bankBuilding
        cashRegister.addMoneyToCashBox(building, teller);
        //cashOut from card through card
        cashRegister.getMoneyFromCard(debitCard2, teller);
        //create Manager(set manager to work)
        Manager manager = new Manager();
        manager.setWorkInBank(true);
        //create customer
        Customer customer = new Customer(100000000, "Max", "Petrov", 18, "male", 5533152, "student", "+380982749911");
        //create loan
        Date dateOpening = new Date(2022, 3, 10);
        Date dateClosing = new Date(2023, 3, 10);
        Date dateNow = new Date(2023, 3, 12);
        Loan loan = new Loan(0.1, "1 year", dateOpening, dateClosing, dateNow, 200, 10);
        //take loan and pay loan
        loan.takeLoan(customer, manager);
        loan.payLoan(customer, manager);
        //create deposit
        Deposit deposit = new Deposit(0, 0.3, "1 year", dateOpening, dateClosing, dateNow, 300);
        //make deposit and withdraw money from deposit
        deposit.depositMoney(customer);
        deposit.withdrawMoney(customer);
        //create exchanger
        Exchange exchanger = new Exchange(100);
        //convert customer money
        exchanger.conversionBuy(customer, Currency.USD);
        exchanger.conversionSell(customer, Currency.EUR);
    }
}
