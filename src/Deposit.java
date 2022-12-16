import java.util.Date;
import java.util.Objects;

class Deposit extends Services implements IPayOff {
    private double depositBalance;

    public Deposit() {

    }
    public Deposit (double depositBalance, double percent, String term, Date dateOpening, Date dateClosing, Date dateNow, double amountOfMoney) {
        super(percent, dateOpening, dateClosing, dateNow, amountOfMoney);
        this.depositBalance = depositBalance;
    }

    public void depositMoney (Customer customer) {
        if (customer.getMoney() >= getAmountOfMoney()) {
            customer.setMoney(customer.getMoney() - getAmountOfMoney());
            setDepositBalance(getDepositBalance() + getAmountOfMoney());
        }else{
            System.out.println("Not enough customer money to deposit.");
        }
    }
    @Override
    public void payOffMoney (Customer customer) {
        if (getDateClosing().compareTo(getDateNow()) <= 0) {
            customer.setMoney(customer.getMoney() + (getDepositBalance()*getPercent()));
            setDepositBalance(getDepositBalance() - (getDepositBalance()*getPercent()));
        }else{
            customer.setMoney(customer.getMoney() + getDepositBalance());
            setDepositBalance(getDepositBalance() - getDepositBalance());
        }
    }

    public double getDepositBalance() {
        return depositBalance;
    }

    public void setDepositBalance(double depositBalance) {
        this.depositBalance = depositBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deposit)) return false;
        Deposit deposit = (Deposit) o;
        return Double.compare(deposit.getDepositBalance(), getDepositBalance()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepositBalance());
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "depositBalance=" + depositBalance +
                '}';
    }
}

