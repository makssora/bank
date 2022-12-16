public interface ITransaction {
    void transfer(Credit card, double amountOfMoney);
    void transfer(Debit card, double amountOfMoney);
}
