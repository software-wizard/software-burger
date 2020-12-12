package pl.wizard.software.thinking.function;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionExample {

    public static void main(String[] aArg) {
        List<Burger> menu = prepareMenu();
        showMenu(menu);
        Burger orderedBurger = choseBurger(menu);
        showBill(orderedBurger);
    }

    private static List<Burger> prepareMenu() {
        Burger classicBurger = new Burger("Klasyczny", "Sos, Mięsko, Sałata, Pomidor", 16.90);
        Burger cowboyBurger = new Burger("Kowbojski", "Sos, Mięsko, Cebula, Pomidor, Pikle", 21.90);
        Burger orientalBurger = new Burger("Orientalny", "Sos, Mięsko, Bambus, Ananas", 20.90);
        Burger cheeseBurger = new Burger("Serowy", "Sos, Mięsko, Ser, Pomidor", 19.90);
        Burger spiceBurger = new Burger("ostry", "Sos ostry, Mięsko, Sałata, Pomidor", 19.90);

        List<Burger> menu = new ArrayList<>();
        menu.add(classicBurger);
        menu.add(cowboyBurger);
        menu.add(orientalBurger);
        menu.add(cheeseBurger);
        menu.add(spiceBurger);
        return menu;
    }

    private static void showMenu(List<Burger> menu) {
        System.out.println("BURGER MENU");
        System.out.println("WYBIERZ BURGERA:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println();
            System.out.println(i + 1 + ". " + menu.get(i).getPrice() + " " + getBurgerFullDesc(menu.get(i)));
        }
    }

    private static Burger choseBurger(List<Burger> aMenu) {
        int opt;
        Scanner sc = new Scanner(System.in);
        Burger orderedBurger = null;
        while (orderedBurger == null) {
            opt = sc.nextInt();
            if (opt < 1 || opt > 5) {
                System.out.println("Wybrano niepoprawną opcje");
            } else {
                orderedBurger = aMenu.get(opt - 1);
            }
        }
        return orderedBurger;
    }

    private static void showBill(Burger aOrderedBurger) {
        System.out.println("Zamówiłeś burger " + getBurgerFullDesc(aOrderedBurger) + System.lineSeparator() + "do zapłaty: " + aOrderedBurger.getPrice());
    }

    private static String getBurgerFullDesc(Burger aOrderedBurger) {
        return aOrderedBurger.getName() + System.lineSeparator() + aOrderedBurger.getDescription();
    }
}
