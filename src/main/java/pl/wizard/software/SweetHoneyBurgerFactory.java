package pl.wizard.software;

public class SweetHoneyBurgerFactory extends AbstractBurgerFactory {

    @Override
    protected AbstractBurger createInstance(String aName, double aPrice) {
        return new SweetHoneyBurger(aName, aPrice);
    }
}