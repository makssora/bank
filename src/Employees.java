import java.util.Objects;

class Employees extends Person {
    private String jobTitle;
    private int workExperience;

    public Employees() {

    }
    public Employees(String firstName, String lastName, int age, String gender, int passportId, String jobTitle, int workExperience) {
        super(firstName, lastName, age, gender, passportId);
        this.jobTitle = jobTitle;
        this.workExperience = workExperience;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees)) return false;
        Employees employees = (Employees) o;
        return getWorkExperience() == employees.getWorkExperience() && Objects.equals(getJobTitle(), employees.getJobTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getJobTitle(), getWorkExperience());
    }

    @Override
    public String toString() {
        return "Employees{" +
                "jobTitle='" + jobTitle + '\'' +
                ", workExperience=" + workExperience +
                '}';
    }
}
