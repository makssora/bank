public class BankBuildings {
    private double bankMoney;
    private String[] listOfEmployees;

    public BankBuildings (double bankMoney, String[] listOfEmployees) {
        this.bankMoney = bankMoney;
        this.listOfEmployees = listOfEmployees;
    }

    public double getBankMoney() {
        return bankMoney;
    }

    public void setBankMoney(double bankMoney) {
        this.bankMoney = bankMoney;
    }

    public String[] getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(String[] listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }
}
