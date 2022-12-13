import java.util.Date;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Services)) return false;
        Services services = (Services) o;
        return Double.compare(services.getPercent(), getPercent()) == 0 && Double.compare(services.getAmountOfMoney(), getAmountOfMoney()) == 0 && Objects.equals(getTerm(), services.getTerm()) && Objects.equals(getDateOpening(), services.getDateOpening()) && Objects.equals(getDateClosing(), services.getDateClosing()) && Objects.equals(getDateNow(), services.getDateNow());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPercent(), getTerm(), getDateOpening(), getDateClosing(), getDateNow(), getAmountOfMoney());
    }

    @Override
    public String toString() {
        return "Services{" +
                "percent=" + percent +
                ", term='" + term + '\'' +
                ", dateOpening=" + dateOpening +
                ", dateClosing=" + dateClosing +
                ", dateNow=" + dateNow +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }
}
