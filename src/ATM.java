public class ATM {
    private double atmBalance;
    private double atmAmount;
    public void cashOut (Debit card) {
        if (getAtmBalance() >= getAtmAmount() && card.getBalance() >= getAtmAmount()) {
            card.setBalance(card.getBalance() - getAtmAmount());
            setAtmBalance(getAtmBalance() - getAtmAmount());
        }else if (getAtmBalance() <= getAtmAmount()) {
            System.out.println("There is no money in the ATM");
        }else{
            System.out.println("There is not enough money on your card");
        }
    }

    public void cashOut (Credit card) {
        if (getAtmBalance() >= getAtmAmount() && card.getBalance() >= getAtmAmount()) {
            card.setBalance(card.getBalance() - getAtmAmount());
            setAtmBalance(getAtmBalance() - getAtmAmount());
        }else if (getAtmBalance() <= getAtmAmount()) {
            System.out.println("There is no money in the ATM");
        }else{
            System.out.println("There is not enough money on your card");
        }
    }

    public void cashOutCredit (Credit card) {
        if (getAtmBalance() >= getAtmAmount() && card.getCreditBalance() >= getAtmAmount()) {
            card.setCreditBalance(card.getCreditBalance() - getAtmAmount());
            setAtmBalance(getAtmBalance() - getAtmAmount());
        } else if (getAtmBalance() <= getAtmAmount()) {
            System.out.println("There is no money in the ATM");
        } else {
            System.out.println("There is not enough money on your Credit card");
        }
    }


    public static void main(String[] args) {
        Debit debitCard = new Debit(45069545, 495034);
        Credit creditCard = new Credit(3483493, 320929302, 3290329, 0.2);
        ATM atm = new ATM();
        debitCard.setBalance(100);
        creditCard.setBalance(200);
        creditCard.setCreditBalance(300);
        atm.setAtmBalance(1000);
        atm.setAtmAmount(50);
        atm.cashOut(debitCard);
        atm.cashOut(creditCard);
        atm.cashOutCredit(creditCard);
        System.out.println(debitCard.getBalance());
        System.out.println(creditCard.getBalance());
        System.out.println(creditCard.getCreditBalance());
        System.out.println(atm.getAtmBalance());
    }
    public double getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(double atmBalance) {
        this.atmBalance = atmBalance;
    }

    public double getAtmAmount() {
        return atmAmount;
    }

    public void setAtmAmount(double atmAmount) {
        this.atmAmount = atmAmount;
    }
}

