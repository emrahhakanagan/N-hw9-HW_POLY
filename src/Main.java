import deal.Deal;
import deal.Expenditure;
import deal.Sale;
import taxes.TaxSystem;
import taxes.TaxDebit;
import taxes.TaxDebitMinusCredit;

public class Main {
    public static void main(String[] args) {

        TaxSystem tax_6 = new TaxDebit(); // УСН доходы — налог 6% от доходов;
        Company company = new Company("Company ABC", tax_6);

        Deal sale = new Sale("Пахлава (1кг)", 1200);
        Deal expenditure1 = new Expenditure("Муха (1.5кг)",120);
        Deal expenditure2 = new Expenditure("Сахар (1кг)",80);
        Deal expenditure3 = new Expenditure("Фисташка (600гр)",550);
        Deal expenditure4 = new Expenditure("Сливочное масло (180гр)",150);

        Deal[] deals = {sale, expenditure1, expenditure2, expenditure3, expenditure4};
        double resultDebitMinusCredit;

        System.out.println("=== УСН доходы — налог 6% от доходов ===");
        resultDebitMinusCredit = company.applyDeals(deals, tax_6);
        System.out.println("Разница доходов и расходов, которая была на момент старта уплаты налогов: "
                + resultDebitMinusCredit + " руб.");


        TaxSystem tax_15 = new TaxDebitMinusCredit(); // УСН доходы минус расходы — налог 15% от разницы доходов и расходов.
        company.setTaxSystem(tax_15);

        System.out.println("\n----------------------------------------------------------------------\n");

        System.out.println("=== УСН доходы минус расходы — налог 15% от разницы доходов и расходов ===");
        resultDebitMinusCredit = company.applyDeals(deals, tax_15);
        System.out.println("Разница доходов и расходов, которая была на момент старта уплаты налогов: "
                + resultDebitMinusCredit + " руб.");

    }
}