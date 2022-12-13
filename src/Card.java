import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return getCardNumber() == card.getCardNumber() && Double.compare(card.getBalance(), getBalance()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCardNumber(), getBalance());
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", balance=" + balance +
                '}';
    }
}
