package pl.wizard.software.thinking.object;

import java.util.ArrayList;
import java.util.List;

import static pl.wizard.software.thinking.object.Product.*;

public class BurgerFactory extends AbstractItemFactory {

    public final static String CLASSIC = "klasyczny";
    public final static String COWBOY = "kowbojski;";
    public final static String ORIENTAL = "orientalny";
    public final static String CHEESY = "serowy";
    public final static String SPICE = "ostry";

    public TrueBurger prepareBurger(String aType) {
        switch (aType) {
            case CLASSIC:
                TrueBurger classicBurger = new TrueBurger(CLASSIC, 16.90);
                classicBurger.addProduct(MEAT);
                classicBurger.addProduct(SALAT);
                classicBurger.addProduct(TOMATO);
                classicBurger.addProduct(SAUCE);
                return classicBurger;
            case COWBOY:
                TrueBurger cowboyBurger = new TrueBurger(COWBOY, 21.90);
                cowboyBurger.addProduct(MEAT);
                cowboyBurger.addProduct(ONION);
                cowboyBurger.addProduct(TOMATO);
                cowboyBurger.addProduct(SAUCE);
                cowboyBurger.addProduct(CUCUMBER);
                return cowboyBurger;
            case ORIENTAL:
                TrueBurger orientalBurger = new TrueBurger(ORIENTAL, 20.90);
                orientalBurger.addProduct(MEAT);
                orientalBurger.addProduct(BAMBOO);
                orientalBurger.addProduct(PINEAPPLE);
                orientalBurger.addProduct(SAUCE);
                return orientalBurger;
            case CHEESY:
                TrueBurger cheeseBurger = new TrueBurger(CHEESY, 19.90);
                cheeseBurger.addProduct(MEAT);
                cheeseBurger.addProduct(SALAT);
                cheeseBurger.addProduct(TOMATO);
                cheeseBurger.addProduct(CHEESE);
                return cheeseBurger;
            case SPICE:
                TrueBurger spiceBurger = new TrueBurger(SPICE, 19.90);
                spiceBurger.addProduct(MEAT);
                spiceBurger.addProduct(JALAPENO);
                spiceBurger.addProduct(TOMATO);
                spiceBurger.addProduct(CHEESE);
                return spiceBurger;
        }
        throw new IllegalArgumentException("I don't know this burger");
    }

    List<Item> createAllItems() {
        ArrayList<Item> ret = new ArrayList<>();
        ret.add(prepareBurger(BurgerFactory.CLASSIC));
        ret.add(prepareBurger(BurgerFactory.COWBOY));
        ret.add(prepareBurger(BurgerFactory.ORIENTAL));
        ret.add(prepareBurger(BurgerFactory.SPICE));
        ret.add(prepareBurger(BurgerFactory.CHEESY));
        return ret;
    }
}