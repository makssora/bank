import java.util.Objects;

class Debit extends Card {

    private String cardOwner;

    public Debit(){

    }
    public Debit(int cardNumber, double balance, String cardOwner) {
        super(cardNumber, balance);
        this.cardOwner = cardOwner;
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

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Debit)) return false;
        if (!super.equals(o)) return false;
        Debit debit = (Debit) o;
        return Objects.equals(getCardOwner(), debit.getCardOwner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCardOwner());
    }

    @Override
    public String toString() {
        return "Debit{" +
                "cardOwner='" + cardOwner + '\'' +
                '}';
    }
}
