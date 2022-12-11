public class Manager extends Employees {

    public boolean workInBank;

    public Manager() {

    }

    public Manager(String firstName, String lastName, int age, String gender, int passportId, String jobTitle, int workExperience) {
        super(firstName, lastName, age, gender, passportId, jobTitle, workExperience);

    }

    public boolean isWorkInBank() {
        return workInBank;
    }

    public void setWorkInBank(boolean workInBank) {
        this.workInBank = workInBank;
    }
}