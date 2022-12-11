import java.util.Date;

class Deposit extends Services {
    private double depositBalance;

    public Deposit() {

    }
    public Deposit (double depositBalance, double percent, String term, Date dateOpening, Date dateClosing, Date dateNow, double amountOfMoney, double fine) {
        super(percent, term, dateOpening, dateClosing, dateNow, amountOfMoney);
        this.depositBalance = depositBalance;
    }

    public void depositMoney (Customer customer) {
        if (customer.getMoney() >= getAmountOfMoney()) {
            customer.setMoney(customer.getMoney() - getAmountOfMoney());
            setDepositBalance(getAmountOfMoney() + getAmountOfMoney());
        }else{
            System.out.println("Not enough customer money to deposit.");
        }
    }

    public void withdrawMoney (Customer customer) {
        if (getDateClosing().compareTo(getDateNow()) <= 0) {
            customer.setMoney(customer.getMoney()+(getDepositBalance()*getPercent()));
        }else{
            customer.setMoney(customer.getMoney()+getDepositBalance());
        }
    }

    public double getDepositBalance() {
        return depositBalance;
    }

    public void setDepositBalance(double depositBalance) {
        this.depositBalance = depositBalance;
    }
}

