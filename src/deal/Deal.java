package deal;
public class Deal {
    protected String comment;
    protected double debitChange = 0;
    protected double creditChange = 0;

    public Deal(String comment, double debitChange, double creditChange) {
        this.comment = comment;
        this.debitChange += debitChange;
        this.creditChange += creditChange;
    }

    public String getComment() {
        return comment;
    }

    public double getDebitChange() {
        return debitChange;
    }

    public double getCreditChange() {
        return creditChange;
    }
}
