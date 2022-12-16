package exceptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class BankCardTransferException extends IllegalArgumentException {
      public static final String NOT_ENOUGH_FOUNDS_MESSAGE = "card has insufficient funds";

      public BankCardTransferException(){};

    public static void passportIdValidation(int passportId, Logger logger) {
        String passportIdString = Integer.toString(passportId);
        if(passportIdString.length() == 8){
            logger.error(IllegalDataException.PASSPORT_ID_MESSAGE);
            throw new IllegalDataException();
        }
    }

      public BankCardTransferException(String message) {
          super(message);
      }

    public BankCardTransferException(String message, Throwable cause) {
        super(message, cause);
    }

    public BankCardTransferException(Throwable cause) {
        super(cause);
    }

}
