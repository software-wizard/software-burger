package pl.wizard.software.thinking.object;

import java.util.ArrayList;

public class Menu extends ArrayList<TrueBurger>{

    public Menu(){
        BurgerFactory factory = new BurgerFactory();
        addAll(factory.createAllBurgers());
    }

    void show() {
        System.out.println("BURGER MENU");
        System.out.println("WYBIERZ BURGERA:");
        for (int i = 0; i < size(); i++) {
            System.out.println();
            System.out.println(i + 1 + ". " + get(i).getPrice() + " " + get(i).toString());
        }
    }
}
