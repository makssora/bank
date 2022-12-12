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
}
