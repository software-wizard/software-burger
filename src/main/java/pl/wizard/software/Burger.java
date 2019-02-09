package pl.wizard.software;

public class Burger extends AbstractBurger {

    public Burger(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return getName() + " w bułce pszennej " + System.getProperty("line.separator") + getProductsAsString();
    }
}
