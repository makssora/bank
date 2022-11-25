public class Transaction {
    private String transactionDate;
    private String description;
    private double amountOfMoney;

    public void transfer(Debit card1, Credit card2) {
        if (getAmountOfMoney() <= card1.getBalance()) {
            card1.setBalance(card1.getBalance() - getAmountOfMoney());
            card2.setBalance(card2.getBalance() + getAmountOfMoney());
        } else {
            System.out.println("Your card has insufficient funds.");
        }
    }

    public void transfer(Debit card1, Debit card2) {
        if (getAmountOfMoney() <= card1.getBalance()) {
            card1.setBalance(card1.getBalance() - getAmountOfMoney());
            card2.setBalance(card2.getBalance() + getAmountOfMoney());
        } else {
            System.out.println("Your card has insufficient funds.");
        }
    }

    public void transfer(Credit card1, Debit card2) {
        if (getAmountOfMoney() <= card1.getBalance()) {
            card1.setBalance(card1.getBalance() - getAmountOfMoney());
            card2.setBalance(card2.getBalance() + getAmountOfMoney());
        } else if (getAmountOfMoney() <= card1.getCreditBalance()) {
            card1.setCreditBalance(card1.getCreditBalance() - getAmountOfMoney());
            card2.setBalance(card2.getBalance() + getAmountOfMoney());
        } else {
            System.out.println("Your card has insufficient funds.");
        }
    }

    public void transfer(Credit card1, Credit card2) {
        if (getAmountOfMoney() <= card1.getBalance()) {
            card1.setBalance(card1.getBalance() - getAmountOfMoney());
            card2.setBalance(card2.getBalance() + getAmountOfMoney());
        } else if (getAmountOfMoney() <= card1.getCreditBalance()) {
            card1.setCreditBalance(card1.getCreditBalance() - getAmountOfMoney());
            card2.setBalance(card2.getBalance() + getAmountOfMoney());
        } else {
            System.out.println("Your card has insufficient funds.");
        }
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
