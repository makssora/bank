import java.util.Objects;

class Customer extends Person {
    private String clientType;
    private String phoneNumber;

    private double money;

    public Customer() {

    }

    public Customer(double money, String firstName, String lastName, int age, String gender, int passportId, String clientType, String phoneNumber) {
        super(firstName, lastName, age, gender, passportId);
        this.clientType = clientType;
        this.phoneNumber = phoneNumber;
        this.money = money;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money){
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Double.compare(customer.getMoney(), getMoney()) == 0 && Objects.equals(getClientType(), customer.getClientType()) && Objects.equals(getPhoneNumber(), customer.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClientType(), getPhoneNumber(), getMoney());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "clientType='" + clientType + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", money=" + money +
                '}';
    }
}