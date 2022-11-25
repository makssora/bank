public class Credit extends Card{
    private double creditBalance;
    private double creditPercent;
    private double amountOfMoney;

    public void takeCredit(Credit card) {
        setCreditBalance(getCreditBalance() + getAmountOfMoney());
    }

    public void payCredit(Credit card) {
        setCreditBalance(getCreditBalance() - getAmountOfMoney() - getAmountOfMoney()*getCreditPercent());
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
}
