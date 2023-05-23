package taxes;

public class TaxDebitMinusCredit extends TaxSystem {

    private final double RATE = 0.15;

    @Override
    public double calcTaxFor(double debit, double credit) {
        if (debit < credit) {
            return 0;
        } else {
            return (debit - credit) * RATE;
        }
    }
}
