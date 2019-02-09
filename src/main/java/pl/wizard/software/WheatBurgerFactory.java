package pl.wizard.software;

public class WheatBurgerFactory extends AbstractBurgerFactory {

    @Override
    protected AbstractBurger createInstance(String aName, double aPrice) {
        return new WheatBurger(aName, aPrice);
    }
}