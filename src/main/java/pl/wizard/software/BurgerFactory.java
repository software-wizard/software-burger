package pl.wizard.software;

import static pl.wizard.software.Product.*;
import static pl.wizard.software.Product.CHEESE;
import static pl.wizard.software.Product.TOMATO;

public class BurgerFactory {

    public final static String CLASSIC = "klasyczny";
    public final static String COWBOY = "kowbojski;";
    public final static String ORIENTAL = "orientalny";
    public final static String CHEESY = "serowy";
    public final static String SPICE = "ostry";

    public Burger prepareBurger(String aType) {
        switch (aType) {
            case CLASSIC:
                Burger classicBurger = new Burger(CLASSIC, 16.90);
                classicBurger.addProduct(MEAT);
                classicBurger.addProduct(SALAT);
                classicBurger.addProduct(TOMATO);
                classicBurger.addProduct(SAUCE);
                return classicBurger;
            case COWBOY:
                Burger cowboyBurger = new Burger(COWBOY, 21.90);
                cowboyBurger.addProduct(MEAT);
                cowboyBurger.addProduct(ONION);
                cowboyBurger.addProduct(TOMATO);
                cowboyBurger.addProduct(SAUCE);
                cowboyBurger.addProduct(CUCUMBER);
                return cowboyBurger;
            case ORIENTAL:
                Burger orientalBurger = new Burger(ORIENTAL, 20.90);
                orientalBurger.addProduct(MEAT);
                orientalBurger.addProduct(BAMBOO);
                orientalBurger.addProduct(PINEAPPLE);
                orientalBurger.addProduct(SAUCE);
                return orientalBurger;
            case CHEESY:
                Burger cheeseBurger = new Burger(CHEESY, 19.90);
                cheeseBurger.addProduct(MEAT);
                cheeseBurger.addProduct(SALAT);
                cheeseBurger.addProduct(TOMATO);
                cheeseBurger.addProduct(CHEESE);
                return cheeseBurger;
            case SPICE:
                Burger spiceBurger = new Burger(SPICE, 19.90);
                spiceBurger.addProduct(MEAT);
                spiceBurger.addProduct(JALAPENO);
                spiceBurger.addProduct(TOMATO);
                spiceBurger.addProduct(CHEESE);
                return spiceBurger;
        }
        throw new IllegalArgumentException("I don't know this burger");
    }
}