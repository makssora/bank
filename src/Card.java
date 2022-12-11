abstract class Card {
    private int cardNumber;
    private double balance;

    public Card() {

    }

    public Card (int cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
