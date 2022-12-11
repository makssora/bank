public class ATM extends Structure {

    public ATM () {

    }
    public ATM (double balance, double amountOfMoney) {
        super(balance, amountOfMoney);
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
}

