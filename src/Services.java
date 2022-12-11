import java.util.Date;

abstract class Services {
    private double percent;
    private String term;
    private Date dateOpening;
    private Date dateClosing;
    private Date dateNow;
    private double amountOfMoney;

    public Services () {

    }

    public Services (double percent, String term, Date dateOpening, Date dateClosing, Date dateNow, double amountOfMoney) {
        this.percent = percent;
        this.term = term;
        this.dateOpening = dateOpening;
        this.dateClosing = dateClosing;
        this.dateNow = dateNow;
        this.amountOfMoney = amountOfMoney;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Date getDateOpening() {
        return dateOpening;
    }

    public void setDateOpening(Date dateOpening) {
        this.dateOpening = dateOpening;
    }

    public Date getDateClosing() {
        return dateClosing;
    }

    public void setDateClosing(Date dateClosing) {
        this.dateClosing = dateClosing;
    }

    public Date getDateNow() {
        return dateNow;
    }

    public void setDateNow(Date dateNow) {
        this.dateNow = dateNow;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
