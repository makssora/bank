import java.util.Objects;

public class ATM extends Structure {

    private int atmNumber;

    public ATM () {
    }
    public ATM (double balance, double amountOfMoney, int atmNumber) {
        super(balance, amountOfMoney);
        this.atmNumber = atmNumber;
    }

    public void cashOut (Debit card) {
        if (getBalance() >= getAmountOfMoney() && card.getBalance() >= getAmountOfMoney()) {
            card.setBalance(card.getBalance() - getAmountOfMoney());
            setBalance(getBalance() - getAmountOfMoney());
        }else if (getBalance() <= getAmountOfMoney()) {
            System.out.println("There is no money in the ATM");
        }else{
            System.out.println("There is not enough money on your card");
        }
    }

    public void cashOut (Credit card) {
        if (getBalance() >= getAmountOfMoney() && card.getBalance() >= getAmountOfMoney()) {
            card.setBalance(card.getBalance() - getAmountOfMoney());
            setBalance(getBalance() - getAmountOfMoney());
        }else if (getBalance() <= getAmountOfMoney()) {
            System.out.println("There is no money in the ATM");
        }else{
            System.out.println("There is not enough money on your card");
        }
    }

    public void cashOutCredit (Credit card) {
        if (getBalance() >= getAmountOfMoney() && card.getCreditBalance() >= getAmountOfMoney()) {
            card.setCreditBalance(card.getCreditBalance() - getAmountOfMoney());
            setBalance(getBalance() - getAmountOfMoney());
        } else if (getBalance() <= getAmountOfMoney()) {
            System.out.println("There is no money in the ATM");
        } else {
            System.out.println("There is not enough money on your card");
        }
    }

    public int getAtmNumber() {
        return atmNumber;
    }

    public void setAtmNumber(int atmNumber) {
        this.atmNumber = atmNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ATM)) return false;
        if (!super.equals(o)) return false;
        ATM atm = (ATM) o;
        return getAtmNumber() == atm.getAtmNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAtmNumber());
    }

    @Override
    public String toString() {
        return "ATM{" +
                "atmNumber=" + atmNumber +
                '}';
    }
}

