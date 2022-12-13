import java.util.Objects;

abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int passportId;

    public Person() {

    }
    public Person(String firstName, String lastName, int age, String gender, int passportId) {
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
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
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
