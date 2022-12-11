import java.util.Date;

public class Loan extends Services {

    private double fine;

    public Loan () {

    }

    public Loan(double percent, String term, Date dateOpening, Date dateClosing, Date dateNow, double amountOfMoney, double fine){
        super(percent, term, dateOpening, dateClosing, dateNow, amountOfMoney);
        this.fine = fine;
    }
    public void takeLoan(Customer customer, Manager manager) {
        if (manager.isWorkInBank()) {
            customer.setMoney(customer.getMoney() + getAmountOfMoney());
        }
    }

    public void payLoan(Customer customer, Manager manager) {
        if (getDateClosing().compareTo(getDateNow()) <= 0 && manager.isWorkInBank()) {
        customer.setMoney(customer.getMoney()-getAmountOfMoney()-getAmountOfMoney()*getPercent());
        }else if (manager.isWorkInBank()){
            customer.setMoney(customer.getMoney()-getAmountOfMoney()-getAmountOfMoney()*getPercent()-getFine());
        }else {
            System.out.println("Manager isn't available");
        }
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }
}
