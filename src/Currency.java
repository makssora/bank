public enum Currency {

    USD(39.4, 40.1),
    EUR(40.9, 41.8),
    CZK(1.6, 1.7),
    PLN(8.6, 9.0);

    private final double purchasePrice;
    private final double sellPrice;
    Currency(double purchasePrice, double sellPrice) {
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }
}
