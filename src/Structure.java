abstract class Structure {
    private double balance;
    private double amountOfMoney;

    public Structure () {

    }

    public Structure (double balance, double amountOfMoney) {
        this.balance = balance;
        this.amountOfMoney = amountOfMoney;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
