package pl.wizard.software;

import static pl.wizard.software.Product.*;

public abstract class AbstractBurgerFactory {
    public final static String CLASSIC = "klasyczny";
    public final static String COWBOY = "kowbojski;";
    public final static String ORIENTAL = "orientalny";
    public final static String CHEESY = "serowy";
    public final static String SPICE = "ostry";

    public AbstractBurger prepareBurger(String aType) {
        switch (aType) {
            case CLASSIC:
                AbstractBurger classicBurger = createInstance(CLASSIC, 16.90);
                classicBurger.addProduct(MEAT);
                classicBurger.addProduct(SALAT);
                classicBurger.addProduct(TOMATO);
                classicBurger.addProduct(SAUCE);
                return classicBurger;
            case COWBOY:
                AbstractBurger cowboyBurger = createInstance(COWBOY, 21.90);
                cowboyBurger.addProduct(MEAT);
                cowboyBurger.addProduct(ONION);
                cowboyBurger.addProduct(TOMATO);
                cowboyBurger.addProduct(SAUCE);
                cowboyBurger.addProduct(CUCUMBER);
                return cowboyBurger;
            case ORIENTAL:
                AbstractBurger orientalBurger = createInstance(ORIENTAL, 20.90);
                orientalBurger.addProduct(MEAT);
                orientalBurger.addProduct(BAMBOO);
                orientalBurger.addProduct(PINEAPPLE);
                orientalBurger.addProduct(SAUCE);
                return orientalBurger;
            case CHEESY:
                AbstractBurger cheeseBurger = createInstance(CHEESY, 19.90);
                cheeseBurger.addProduct(MEAT);
                cheeseBurger.addProduct(SALAT);
                cheeseBurger.addProduct(TOMATO);
                cheeseBurger.addProduct(CHEESE);
                return cheeseBurger;
            case SPICE:
                AbstractBurger spiceBurger = createInstance(SPICE, 19.90);
                spiceBurger.addProduct(MEAT);
                spiceBurger.addProduct(JALAPENO);
                spiceBurger.addProduct(TOMATO);
                spiceBurger.addProduct(CHEESE);
                return spiceBurger;
        }
        throw new IllegalArgumentException("I don't know this burger");
    }

    protected abstract AbstractBurger createInstance(String aName, double aPrice);
}
