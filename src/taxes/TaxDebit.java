package taxes;

public class TaxDebit extends TaxSystem {

    private final double RATE = 0.06;

    @Override
    public double calcTaxFor(double debit, double credit) {
        if (debit < credit) {
            return 0;
        } else {
            return debit * RATE;
        }
    }
}
