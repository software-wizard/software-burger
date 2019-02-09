package pl.wizard.software;

public class SweetHoneyBurger extends AbstractBurger{

    public SweetHoneyBurger(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return getName() + " w bułce miodowej " + System.getProperty("line.separator") + getProductsAsString();
    }
}
