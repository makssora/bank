class Exchange {
    private double usd;
    private double eur;
    private double uah;
    private double usdToUah;
    private double eurToUah;
    private double uahToEur;
    private double uahToUSD;
    public double amountOfMoney;

    public void usdToUahСonversion() {
        if (getUah() >= getUsdToUah()*getAmountOfMoney()) {
            setUah(getUah()-getUsdToUah()*getAmountOfMoney());
            setUsd(getUsd()+getAmountOfMoney());
        }else{
            System.out.println("Not enough money in exchanger");
        }
    }

    public void eurToUahСonversion() {
        if (getUah() >= getEurToUah()*getAmountOfMoney()) {
            setUah(getUah()-getEurToUah()*getAmountOfMoney());
            setEur(getEur()+getAmountOfMoney());
        }else{
            System.out.println("Not enough money in exchanger");
        }
    }

    public void uahToEurСonversion() {
        if (getEur() >= getUahToEur()*getAmountOfMoney()) {
            setUah(getUah()+getAmountOfMoney());
            setEur(getEur()-getUahToEur()*getAmountOfMoney());
        }else{
            System.out.println("Not enough money in exchanger");
        }
    }

    public void uahToUsdСonversion() {
        if (getUsd() >= getUahToUsd()*getAmountOfMoney()) {
            setUah(getUah()+getAmountOfMoney());
            setUsd(getUsd()-getUahToUsd()*getAmountOfMoney());
        }else{
            System.out.println("Not enough money in exchanger");
        }
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getEur() {
        return eur;
    }

    public void setEur(double eur) {
        this.eur = eur;
    }

    public double getUah() {
        return uah;
    }

    public void setUah(double uah) {
        this.uah = uah;
    }

    public double getUsdToUah() {
        return usdToUah;
    }

    public void setUsdToUah(double usdToUah) {
        this.usdToUah = usdToUah;
    }

    public double getEurToUah() {
        return eurToUah;
    }

    public void setEurToUah(double eurToUah) {
        this.eurToUah = eurToUah;
    }

    public double getUahToEur() {
        return uahToEur;
    }

    public void setUahToEur(double uahToEur) {
        this.uahToEur = uahToEur;
    }

    public double getUahToUsd() {
        return uahToUSD;
    }

    public void setUahToUSD(double uahToUSD) {
        this.uahToUSD = uahToUSD;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
