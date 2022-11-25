class Customer extends Person {
    private String clientType;
    private String phoneNumber;

    public Customer(String firstName, String lastName, int age, String gender, int passportId, String clientType, String phoneNumber) {
        super(firstName, lastName, age, gender, passportId);
        this.clientType = clientType;
        this.phoneNumber = phoneNumber;
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
}