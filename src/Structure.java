import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Structure)) return false;
        Structure structure = (Structure) o;
        return Double.compare(structure.getBalance(), getBalance()) == 0 && Double.compare(structure.getAmountOfMoney(), getAmountOfMoney()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBalance(), getAmountOfMoney());
    }

    @Override
    public String toString() {
        return "Structure{" +
                "balance=" + balance +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }
}
