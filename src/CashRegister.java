public class CashRegister {
    private double cashBoxMoney;
    private double amountOfMoney;

    public void addMoneyToCashBox(BankBuildings bank) {
        if (bank.getBankMoney() >= getAmountOfMoney()) {
            setCashBoxMoney(getCashBoxMoney() + getAmountOfMoney());
            bank.setBankMoney(bank.getBankMoney() - getAmountOfMoney());
        }else{
            System.out.println("Not enough money in the bank");
        }
    }

    public void getMoneyFromCard(Debit card) {
        if (card.getBalance() >= getAmountOfMoney()){
            card.setBalance(card.getBalance() - getAmountOfMoney());
            setCashBoxMoney(getCashBoxMoney() - getAmountOfMoney());
        }else if (card.getBalance() < getAmountOfMoney()){
            System.out.println("Not enough money on the card");
        }else{
            System.out.println("Not enough money in cashBox");
        }
    }

    public double getCashBoxMoney() {
        return cashBoxMoney;
    }

    public void setCashBoxMoney(double cashBoxMoney) {
        this.cashBoxMoney = cashBoxMoney;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
