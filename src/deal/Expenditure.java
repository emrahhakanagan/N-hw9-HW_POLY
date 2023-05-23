package deal;
public class Expenditure extends Deal {
    public Expenditure(String productName, double creditChange) {
        super("Покупка <" + productName + "> товара на " + creditChange + " руб.", 0, creditChange);
    }
}
