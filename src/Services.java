public class Services {
    private String publicUtilities;
    private String phoneNumber;
    private double amountOfMoney;

    public void topUpPhone(Debit card) {
        if (card.getBalance() >= getAmountOfMoney()) {
            card.setBalance(card.getBalance()-getAmountOfMoney());
            System.out.println("Phone " + getPhoneNumber() + " topped up.");
        }else{
            System.out.println("Your card has insufficient funds.");
        }
    }

    public void topUpPhone(Credit card) {
        if (card.getBalance() >= getAmountOfMoney()) {
            card.setBalance(card.getBalance()-getAmountOfMoney());
            System.out.println(getPhoneNumber() + " topped up.");
        }else if (card.getCreditBalance() >= getAmountOfMoney()) {
            card.setCreditBalance(card.getCreditBalance()-getAmountOfMoney());
            System.out.println("Phone " + getPhoneNumber() + " topped up.");
        }else{
            System.out.println("Your card has insufficient funds.");
        }
    }

    public void payUtilityBill(Debit card) {
        if (card.getBalance() >= getAmountOfMoney()) {
            card.setBalance(card.getBalance()-getAmountOfMoney());
            System.out.println(getPublicUtilities() + " paid.");
        }else{
            System.out.println("Your card has insufficient funds.");
        }
    }

    public void payUtilityBill(Credit card) {
        if (card.getBalance() >= getAmountOfMoney()) {
            card.setBalance(card.getBalance()-getAmountOfMoney());
            System.out.println(getPublicUtilities() + " paid.");
        }else if (card.getCreditBalance() >= getAmountOfMoney()) {
            card.setCreditBalance(card.getCreditBalance()-getAmountOfMoney());
            System.out.println(getPublicUtilities() + " paid.");
        }else{
            System.out.println("Your card has insufficient funds.");
        }
    }

    public static void main(String[] args) {
        Debit card = new Debit();
        Services service = new Services();
        card.setBalance(1000);
        service.setAmountOfMoney(10);
        service.setPhoneNumber("+380989871212");
        service.topUpPhone(card);
    }

    public String getPublicUtilities() {
        return publicUtilities;
    }

    public void setPublicUtilities(String publicUtilities) {
        this.publicUtilities = publicUtilities;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
