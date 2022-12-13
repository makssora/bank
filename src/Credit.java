import java.util.Objects;

public class Credit extends Card {
    private double creditBalance;
    private double creditPercent;
    private double amountOfMoney;

    public Credit() {

    }
    public Credit(int cardNumber, double balance, double creditBalance, double creditPercent) {
        super(cardNumber, balance);
        this.creditBalance = creditBalance;
        this.creditPercent = creditPercent;
    }

    public void takeCredit(Credit card) {
        setCreditBalance(getCreditBalance() + getAmountOfMoney());
    }

    public void payCredit(Credit card) {
        setCreditBalance(getCreditBalance() - getAmountOfMoney() - getAmountOfMoney()*getCreditPercent());
    }

    public void transfer(Credit card, double amountOfMoney) {
        if (getBalance() <= getBalance()) {
            setBalance(getBalance() - amountOfMoney);
            card.setBalance(card.getBalance() + amountOfMoney);
        } else {
            System.out.println("Your card has insufficient funds.");
        }
    }

    public void transfer(Debit card, double amountOfMoney) {
        if (getBalance() <= getBalance()) {
            setBalance(getBalance() - amountOfMoney);
            card.setBalance(card.getBalance() + amountOfMoney);
        } else {
            System.out.println("Your card has insufficient funds.");
        }
    }

    public double getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(double creditBalance) {
        this.creditBalance = creditBalance;
    }

    public double getCreditPercent() {
        return creditPercent;
    }

    public void setCreditPercent(double creditPercent) {
        this.creditPercent = creditPercent;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Credit)) return false;
        if (!super.equals(o)) return false;
        Credit credit = (Credit) o;
        return Double.compare(credit.getCreditBalance(), getCreditBalance()) == 0 && Double.compare(credit.getCreditPercent(), getCreditPercent()) == 0 && Double.compare(credit.getAmountOfMoney(), getAmountOfMoney()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCreditBalance(), getCreditPercent(), getAmountOfMoney());
    }

    @Override
    public String toString() {
        return "Credit{" +
                "creditBalance=" + creditBalance +
                ", creditPercent=" + creditPercent +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }
}
