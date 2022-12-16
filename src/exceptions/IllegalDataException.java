package exceptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IllegalDataException extends IllegalArgumentException{
    public static final String FIRST_NAME_MESSAGE = "invalid first name";
    public static final String LAST_NAME_MESSAGE = "invalid last name";
    public static final String AGE_MESSAGE = "invalid age";
    public static final String GENDER_MESSAGE = "invalid gender";
    public static final String PASSPORT_ID_MESSAGE = "invalid passportId";

    public IllegalDataException(){};

    public static void passportIdValidation(int passportId, Logger logger) {
        String passportIdString = Integer.toString(passportId);
        if(passportIdString.length() == 8){
            logger.error(IllegalDataException.PASSPORT_ID_MESSAGE);
            throw new IllegalDataException();
        }
    }
    public IllegalDataException(String message) {
        super(message);
    }

    public IllegalDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalDataException(Throwable cause) {
        super(cause);
    }


}
