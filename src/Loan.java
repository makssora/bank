import java.util.Date;

public class Loan {
    private double loanPercent;
    private String term;
    private Date dateOpening;
    private Date dateClosing;
    private Date dateNow;
    private double amountOfMoney;
    private double fine;

    public void takeLoan(Debit card) {
        card.setBalance(card.getBalance()+getAmountOfMoney());
    }

    public void takeLoan(Credit card) {
        card.setBalance(card.getBalance()+getAmountOfMoney());
    }

    public void payLoan(Debit card) {
        if (getDateClosing().compareTo(getDateNow()) <= 0) {
        card.setBalance(card.getBalance()-getAmountOfMoney()-getAmountOfMoney()*getLoanPercent());
        }else{
            card.setBalance(card.getBalance()-getAmountOfMoney()-getAmountOfMoney()*getLoanPercent()-getFine());
        }
    }

    public void payLoan(Credit card) {
        if (getDateClosing().compareTo(getDateNow()) <= 0) {
            card.setBalance(card.getBalance()-getAmountOfMoney()-getAmountOfMoney()*getLoanPercent());
        }else{
            card.setBalance(card.getBalance()-getAmountOfMoney()-getAmountOfMoney()*getLoanPercent()-getFine());
        }
    }

    public double getLoanPercent() {
        return loanPercent;
    }

    public void setLoanPercent(double loanPercent) {
        this.loanPercent = loanPercent;
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

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }
}
