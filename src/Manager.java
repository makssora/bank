import java.util.Objects;

public class Manager extends Employees {

    public boolean workInBank;

    public Manager() {

    }

    public Manager(boolean workInBank, String firstName, String lastName, int age, String gender, int passportId, String jobTitle, int workExperience) {
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
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return isWorkInBank() == manager.isWorkInBank();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isWorkInBank());
    }

    @Override
    public String toString() {
        return "Manager{" +
                "workInBank=" + workInBank +
                '}';
    }
}