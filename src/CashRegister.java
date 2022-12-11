public class CashRegister extends Structure {

    private String date;

    public CashRegister() {

    }

    public CashRegister (String date, double balance, double amountOfMoney) {
        super(balance, amountOfMoney);
        this.date = date;

    }

    public void addMoneyToCashBox(BankBuildings bank, Teller teller) {
        if (bank.getBalance() >= getAmountOfMoney() && teller.isWorkInBank()) {
            setBalance(getBalance() + getAmountOfMoney());
            bank.setBalance(bank.getBalance() - getAmountOfMoney());
        }else{
            System.out.println("Not enough money in the bank");
        }
    }
    public void getMoneyFromCard(Debit card, Teller teller) {
        if (card.getBalance() >= getAmountOfMoney() && teller.isWorkInBank()){
            card.setBalance(card.getBalance() - getAmountOfMoney());
            setBalance(getBalance() - getAmountOfMoney());
        }else if (card.getBalance() < getAmountOfMoney() && teller.isWorkInBank()){
            System.out.println("Not enough money on the card");
        }else if(teller.isWorkInBank()){
            System.out.println("Not enough money in cashBox");
        }else {
            System.out.println("Teller isn't available");
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
