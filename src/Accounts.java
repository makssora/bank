public class Accounts extends Person {
    private int accountId;
    private String login;
    private String password;

    public Accounts(String firstName, String lastName, int age, String gender, int passportId, int accountId, String login, String password) {
        super(firstName, lastName, age, gender, passportId);
        this.accountId = accountId;
        this.login = login;
        this.password = password;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
