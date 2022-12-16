import exceptions.IllegalDataException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

abstract class Person {
    private static final String FIRST_NAME_REGEX = "^[A-Z][a-zA-z ]{1,30}$";
    private static final String LAST_NAME_REGEX = "^[A-Z][a-zA-z ]{1,30}$";
    private static final String GENDER_REGEX = "^(?:m|M|male|Male|f|F|female|Female)$";

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int passportId;

    private static final Logger logger = LogManager.getLogger(Person.class);

    public Person() {

    }
    public Person(String firstName, String lastName, int age, String gender, int passportId) {
        if(!firstName.matches(FIRST_NAME_REGEX)){
            logger.error(IllegalDataException.FIRST_NAME_MESSAGE);
            throw new IllegalDataException(IllegalDataException.FIRST_NAME_MESSAGE);
        }

        if(!lastName.matches(LAST_NAME_REGEX)){
            logger.error(IllegalDataException.LAST_NAME_MESSAGE);
            throw new IllegalDataException(IllegalDataException.LAST_NAME_MESSAGE);
        }

        if (age < 15 || age > 200) {
            logger.error(IllegalDataException.AGE_MESSAGE);
            throw new IllegalDataException(IllegalDataException.AGE_MESSAGE);
        }

        if(!gender.matches(GENDER_REGEX)){
            logger.error(IllegalDataException.GENDER_MESSAGE);
            throw new IllegalDataException(IllegalDataException.GENDER_MESSAGE);
        }

        IllegalDataException.passportIdValidation(passportId, logger);

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.passportId = passportId;
    }

    public String getFirstName() {
      return firstName;
    }

    public void setFirstName(String firstName) {
        if(!firstName.matches(FIRST_NAME_REGEX)){
            logger.error(IllegalDataException.FIRST_NAME_MESSAGE);
            throw new IllegalDataException(IllegalDataException.FIRST_NAME_MESSAGE);
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(!lastName.matches(LAST_NAME_REGEX)){
            logger.error(IllegalDataException.LAST_NAME_MESSAGE);
            throw new IllegalDataException(IllegalDataException.LAST_NAME_MESSAGE);
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 15 || age > 200) {
            logger.error(IllegalDataException.AGE_MESSAGE);
            throw new IllegalDataException(IllegalDataException.AGE_MESSAGE);
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(!gender.matches(GENDER_REGEX)){
            logger.error(IllegalDataException.GENDER_MESSAGE);
            throw new IllegalDataException(IllegalDataException.GENDER_MESSAGE);
        }
        this.gender = gender;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        IllegalDataException.passportIdValidation(passportId, logger);
        this.passportId = passportId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && getPassportId() == person.getPassportId() && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getGender(), person.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAge(), getGender(), getPassportId());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", passportId=" + passportId +
                '}';
    }
}
