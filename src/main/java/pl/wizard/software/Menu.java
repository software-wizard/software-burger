package pl.wizard.software;

import java.util.ArrayList;
import java.util.List;

import static pl.wizard.software.Product.*;
import static pl.wizard.software.Product.CHEESE;
import static pl.wizard.software.Product.TOMATO;

public class Menu extends ArrayList<Burger>{

    public Menu(){
        Burger classicBurger = new Burger("Klasyczny", 16.90);
        classicBurger.addProduct(MEAT);
        classicBurger.addProduct(SALAT);
        classicBurger.addProduct(TOMATO);
        classicBurger.addProduct(SAUCE);

        Burger cowboyBurger = new Burger("Kowbojski", 21.90);
        cowboyBurger.addProduct(MEAT);
        cowboyBurger.addProduct(ONION);
        cowboyBurger.addProduct(TOMATO);
        cowboyBurger.addProduct(SAUCE);
        cowboyBurger.addProduct(CUCUMBER);

        Burger orientalBurger = new Burger("Orientalny", 20.90);
        orientalBurger.addProduct(MEAT);
        orientalBurger.addProduct(BAMBOO);
        orientalBurger.addProduct(PINEAPPLE);
        orientalBurger.addProduct(SAUCE);

        Burger cheeseBurger = new Burger("Serowy", 19.90);
        cheeseBurger.addProduct(MEAT);
        cheeseBurger.addProduct(SALAT);
        cheeseBurger.addProduct(TOMATO);
        cheeseBurger.addProduct(CHEESE);

        Burger spiceBurger = new Burger("ostry", 19.90);
        spiceBurger.addProduct(MEAT);
        spiceBurger.addProduct(JALAPENO);
        spiceBurger.addProduct(TOMATO);
        spiceBurger.addProduct(CHEESE);

        List<Burger> menu = new ArrayList<>();
        add(classicBurger);
        add(cowboyBurger);
        add(orientalBurger);
        add(cheeseBurger);
        add(spiceBurger);
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
