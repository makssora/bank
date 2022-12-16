package exceptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

public class BankServiceException extends IllegalArgumentException{
    public static final String PERCENT_MESSAGE = "not valid percent(0 > percent < 1)";
    public static final String DATE_MESSAGE = "invalid date";
    public static final String NEGATIVE_AMOUNT_OF_MONEY = "amount of money couldn't be negative";

    public BankServiceException(){};

    public static void dateOpenCloseValidation(Date dateOpening, Date dateClosing, Logger logger) {
        if(dateOpening.compareTo(dateClosing) < 0){
            logger.error(BankServiceException.DATE_MESSAGE);
            throw new BankServiceException();
        }
    }

    public BankServiceException(String message) {
        super(message);
    }

    public BankServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public BankServiceException(Throwable cause) {
        super(cause);
    }
}
