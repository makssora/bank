class Debit extends Card {

    public Debit(){

    }
    public Debit(int cardNumber, double balance) {
        super(cardNumber, balance);
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
}
