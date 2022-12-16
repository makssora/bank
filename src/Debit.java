import exceptions.BankCardTransferException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

class Debit extends Card implements ITransaction{

    private String cardOwner;

    private static final Logger logger = LogManager.getLogger(Debit.class);
    public Debit(){

    }
    public Debit(int cardNumber, double balance, String cardOwner) {
        super(cardNumber, balance);
        this.cardOwner = cardOwner;
    }
    @Override
    public void transfer(Credit card, double amountOfMoney) {
        if (getBalance() <= getBalance()) {
            setBalance(getBalance() - amountOfMoney);
            card.setBalance(card.getBalance() + amountOfMoney);
        } else {
            logger.error(BankCardTransferException.NOT_ENOUGH_FOUNDS_MESSAGE);
            throw new BankCardTransferException();
        }
    }
    @Override
    public void transfer(Debit card, double amountOfMoney) {
        if (getBalance() <= getBalance()) {
            setBalance(getBalance() - amountOfMoney);
            card.setBalance(card.getBalance() + amountOfMoney);
        } else {
            logger.error(BankCardTransferException.NOT_ENOUGH_FOUNDS_MESSAGE);
            throw new BankCardTransferException(BankCardTransferException.NOT_ENOUGH_FOUNDS_MESSAGE);
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
