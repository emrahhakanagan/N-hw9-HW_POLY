package deal;
public class Sale extends Deal {

    public Sale(String productName, double debitChange) {
        super("Продажа <" + productName + "> товара на " + debitChange + " руб.", debitChange, 0);
    }
}
