import java.util.Date;
import java.util.Objects;

public class Loan extends Services implements IPayOff{

    private double fine;

    public Loan () {

    }

    public Loan(double percent, String term, Date dateOpening, Date dateClosing, Date dateNow, double amountOfMoney, double fine){
        super(percent, dateOpening, dateClosing, dateNow, amountOfMoney);
        this.fine = fine;
    }
    public void takeLoan(Customer customer, Manager manager) {
        if (manager.isWorkInBank()) {
            customer.setMoney(customer.getMoney() + getAmountOfMoney());
        }
    }
    @Override
    public void payOffMoney(Customer customer) {
        if (getDateClosing().compareTo(getDateNow()) <= 0) {
        customer.setMoney(customer.getMoney()-getAmountOfMoney()-getAmountOfMoney()*getPercent());
        }else {
            customer.setMoney(customer.getMoney() - getAmountOfMoney() - getAmountOfMoney() * getPercent() - getFine());
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
