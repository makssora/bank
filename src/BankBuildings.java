import java.util.Arrays;

public class BankBuildings extends Structure {
    private Employees[] listOfEmployees;

    public BankBuildings(){

    }
    public BankBuildings(double balance, double amountOfMoney, Employees[] listOfEmployees) {
        super(balance, amountOfMoney);
        this.listOfEmployees = listOfEmployees;

    }

    public void employeeCheckList(Employees employee) {
        if(Arrays.asList(listOfEmployees).contains(employee)) {
            System.out.println("Employee is in the bank's list");
        }else{
            System.out.println("Employee is not in the bank's list");
        }
    }

    public Employees[] getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(Employees[] listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankBuildings)) return false;
        BankBuildings that = (BankBuildings) o;
        return Arrays.equals(getListOfEmployees(), that.getListOfEmployees());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getListOfEmployees());
    }

    @Override
    public String toString() {
        return "BankBuildings{" +
                "listOfEmployees=" + Arrays.toString(listOfEmployees) +
                '}';
    }
}
