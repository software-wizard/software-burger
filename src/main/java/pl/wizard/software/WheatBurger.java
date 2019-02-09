package pl.wizard.software;

public class WheatBurger extends AbstractBurger {

    public WheatBurger(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return getName() + " w bułce pszennej " + System.getProperty("line.separator") + getProductsAsString();
    }
}
