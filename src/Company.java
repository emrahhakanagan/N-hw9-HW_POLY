import deal.Deal;
import taxes.TaxSystem;

public class Company {
    private String title;
    private double debit;
    private double credit;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
        this.debit = 0;
        this.credit = 0;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes(TaxSystem taxSystem) {
        double taxResult = taxSystem.calcTaxFor(this.debit, this.credit);
        System.out.println("Компания <" + title + "> уплатила налог в размере: " + taxResult + " руб.");

        this.debit -= this.debit;
        this.credit -= this.credit;
    }

    public double applyDeals(Deal[] deals, TaxSystem taxSystem) {
        for (Deal deal : deals) {
            System.out.println(deal.getComment());
            if (deal.getDebitChange() >= 0) {
                this.debit += deal.getDebitChange();
            }

            if (deal.getCreditChange() >= 0) {
                this.credit += deal.getCreditChange();
            }
        }
        System.out.println("\nИтого всех доходов: " + this.debit + "  руб. и расходов: " + this.credit + " руб.");

        double resultDebitsMinusCredits = this.debit - this.credit;

        payTaxes(taxSystem);

        return resultDebitsMinusCredits;
    }
}
