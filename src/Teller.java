import java.util.Objects;

public class Teller extends Employees {

    public boolean workInBank;

    public Teller() {

    }

    public Teller(boolean workInBank, String firstName, String lastName, int age, String gender, int passportId, String jobTitle, int workExperience) {
        super(firstName, lastName, age, gender, passportId, jobTitle, workExperience);
        this.workInBank = workInBank;
    }

    public boolean isWorkInBank() {
        return workInBank;
    }

    public void setWorkInBank(boolean workInBank) {
        this.workInBank = workInBank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teller)) return false;
        Teller teller = (Teller) o;
        return isWorkInBank() == teller.isWorkInBank();
    }

    @Override
    public int hashCode() {
        return Objects.hash(isWorkInBank());
    }

    @Override
    public String toString() {
        return "Teller{" +
                "workInBank=" + workInBank +
                '}';
    }
}
