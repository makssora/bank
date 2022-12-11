class Exchange {

    public double amountOfMoney;

    public Exchange() {

    }

    public Exchange (double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public void conversionBuy(Customer customer, Currency currency) {
        if (customer.getMoney() >= amountOfMoney) {
            customer.setMoney(customer.getMoney() - (amountOfMoney * currency.getPurchasePrice()));
            System.out.println("You bought on: " + amountOfMoney * currency.getPurchasePrice());
        }else{
            System.out.println("Not enough money to exchange");
        }
    }
    public void conversionSell(Customer customer, Currency currency) {
        if (customer.getMoney() >= amountOfMoney) {
            customer.setMoney(customer.getMoney() + (amountOfMoney* currency.getSellPrice()));
            System.out.println("You sold on: " + amountOfMoney * currency.getPurchasePrice());
        }else{
            System.out.println("Not enough money to exchange");
        }
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
