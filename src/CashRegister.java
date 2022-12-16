import exceptions.BankCardTransferException;
import exceptions.BankStructureException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class CashRegister extends Structure {

    private String date;

    private static final String DATE_REGEX = "^\\d{4}-\\d{2}-\\d{2}$";

    private static final Logger logger = LogManager.getLogger(CashRegister.class);
    public CashRegister() {

    }

    public CashRegister (String date, double balance, double amountOfMoney) {
        super(balance, amountOfMoney);
        if(!date.matches(DATE_REGEX)){
            logger.error(BankStructureException.DATE_MESSAGE);
            throw new BankStructureException(BankStructureException.DATE_MESSAGE);
        }
        this.date = date;
    }

    public void addMoneyToCashBox(BankBuildings bank, Teller teller) {
        if (bank.getBalance() >= getAmountOfMoney() && teller.isWorkInBank()) {
            setBalance(getBalance() + getAmountOfMoney());
            bank.setBalance(bank.getBalance() - getAmountOfMoney());
        }else{
            logger.error(BankStructureException.BANK_MESSAGE);
            throw new BankStructureException(BankStructureException.BANK_MESSAGE);
        }
    }
    public void getMoneyFromCard(Debit card, Teller teller) {
        if (card.getBalance() >= getAmountOfMoney() && teller.isWorkInBank()){
            card.setBalance(card.getBalance() - getAmountOfMoney());
            setBalance(getBalance() - getAmountOfMoney());
        }else if (card.getBalance() < getAmountOfMoney() && teller.isWorkInBank()){
            logger.error(BankCardTransferException.NOT_ENOUGH_FOUNDS_MESSAGE);
            throw new BankCardTransferException(BankCardTransferException.NOT_ENOUGH_FOUNDS_MESSAGE);
        }else if(teller.isWorkInBank()){
            logger.error(BankStructureException.CASH_BOX_MESSAGE);
            throw new BankStructureException(BankStructureException.CASH_BOX_MESSAGE);
        }else {
            logger.error(BankStructureException.TELLER_WORK_MESSAGE);
            throw new BankStructureException(BankStructureException.TELLER_WORK_MESSAGE);
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if(!date.matches(DATE_REGEX)){
            logger.error(BankStructureException.DATE_MESSAGE);
            throw new BankStructureException(BankStructureException.DATE_MESSAGE);
        }
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CashRegister)) return false;
        CashRegister that = (CashRegister) o;
        return Objects.equals(getDate(), that.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDate());
    }

    @Override
    public String toString() {
        return "CashRegister{" +
                "date='" + date + '\'' +
                '}';
    }
}
