import java.util.Date;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Loan)) return false;
        Loan loan = (Loan) o;
        return Double.compare(loan.getFine(), getFine()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFine());
    }

    @Override
    public String toString() {
        return "Loan{" +
                "fine=" + fine +
                '}';
    }
}
