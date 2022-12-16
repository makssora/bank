package exceptions;

public class BankStructureException extends IllegalArgumentException{
    public static final String DATE_MESSAGE = "wrong date format yyyy-mm-dd";
    public static final String BANK_MESSAGE = "not enough money in the bank";

    public static final String ATM_BALANCE_MESSAGE = "no enough money in the ATM";
    public static final String CASH_BOX_MESSAGE = "not enough money in the cashBox";
    public static final String TELLER_WORK_MESSAGE = "teller isn't working";

    public BankStructureException(){};

    public BankStructureException(String message) {
        super(message);
    }

    public BankStructureException(String message, Throwable cause) {
        super(message, cause);
    }

    public BankStructureException(Throwable cause) {
        super(cause);
    }
}
