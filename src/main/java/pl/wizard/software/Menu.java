package pl.wizard.software;

import java.util.ArrayList;

public class Menu extends ArrayList<Burger>{

    public Menu(){
        BurgerFactory factory = new BurgerFactory();

        add(factory.prepareBurger(BurgerFactory.CLASSIC));
        add(factory.prepareBurger(BurgerFactory.COWBOY));
        add(factory.prepareBurger(BurgerFactory.ORIENTAL));
        add(factory.prepareBurger(BurgerFactory.SPICE));
        add(factory.prepareBurger(BurgerFactory.CHEESY));
    }

    public void showMenu(){
        System.out.println("BURGER MENU");
        System.out.println("WYBIERZ BURGERA:");
        for (int i = 0; i < size(); i++) {
            System.out.println();
            System.out.println(i + 1 + ". " + get(i).getPrice() + " " + get(i));
        }
    }
}
