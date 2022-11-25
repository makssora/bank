class Deposit {
    private int annualPercentage;
    private double depositBalance;
    private double amountOfMoney;

    public Deposit (int annualPercentage, double depositBalance, double amountOfMoney) {
        this.annualPercentage = annualPercentage;
        this.depositBalance = depositBalance;
        this.amountOfMoney = amountOfMoney;
    }

    public void depositMoney (Debit card) {
        if (card.getBalance() >= getAmountOfMoney()) {
            card.setBalance(card.getBalance() - getAmountOfMoney());
            setDepositBalance(getAmountOfMoney() + getAmountOfMoney() * getAnnualPercentage());
        }else{
            System.out.println("Your card has insufficient funds.");
        }
    }

    public void withdrawMoney (Debit card) {
        card.setBalance(card.getBalance() + getAmountOfMoney());
        setDepositBalance(getDepositBalance() - getAmountOfMoney());
    }

    public int getAnnualPercentage() {
        return annualPercentage;
    }

    public void setAnnualPercentage(int annualPercentage) {
        this.annualPercentage = annualPercentage;
    }

    public double getDepositBalance() {
        return depositBalance;
    }

    public void setDepositBalance(double depositBalance) {
        this.depositBalance = depositBalance;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}

