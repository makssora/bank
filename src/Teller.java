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
}
