package pl.wizard.software;

import java.util.ArrayList;

public class Menu extends ArrayList<AbstractBurger> {

    public final static String WHEAT = "Wheat";
    public final static String SWEET_HONEY = "Sweet Honey";

    public Menu(String aMenuType) {
        AbstractBurgerFactory factory = null;
        if (aMenuType.equals(WHEAT)) {
            factory = new WheatBurgerFactory();
        } else if (aMenuType.equals(SWEET_HONEY)) {
            factory = new SweetHoneyBurgerFactory();
        }

        add(factory.prepareBurger(AbstractBurgerFactory.CLASSIC));
        add(factory.prepareBurger(AbstractBurgerFactory.COWBOY));
        add(factory.prepareBurger(AbstractBurgerFactory.ORIENTAL));
        add(factory.prepareBurger(AbstractBurgerFactory.SPICE));
        add(factory.prepareBurger(AbstractBurgerFactory.CHEESY));
    }

    public void showMenu() {
        System.out.println("BURGER MENU");
        System.out.println("WYBIERZ BURGERA:");
        for (int i = 0; i < size(); i++) {
            System.out.println();
            System.out.println(i + 1 + ". " + get(i).getPrice() + " " + get(i));
        }
    }
}
