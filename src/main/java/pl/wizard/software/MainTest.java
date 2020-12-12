package pl.wizard.software;

import pl.wizard.software.thinking.function.Burger;

import java.util.*;

public class MainTest {

    public static void main(String[] aArg) {
        Scanner sc = new Scanner(System.in);

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

        System.out.println("BURGER MENU");
        System.out.println("WYBIERZ BURGERA:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println();
            System.out.println(i + 1 + ". " + menu.get(i).getPrice() + " " + getBurgerFullDesc(menu.get(i)));
        }

        int opt;

        Burger orderedBurger = null;
        while (orderedBurger == null) {
            opt = sc.nextInt();
            if (opt < 1 || opt > 5) {
                System.out.println("Wybrano niepoprawną opcje");
            } else {
                orderedBurger = menu.get(opt - 1);
            }
        }

        System.out.println("Zamówiłeś burger " + getBurgerFullDesc(orderedBurger));
        System.out.println("do zapłaty: " + orderedBurger.getPrice());
    }

    private static String getBurgerFullDesc(Burger aOrderedBurger) {
        return aOrderedBurger.getName() + System.lineSeparator() + aOrderedBurger.getDescription();
    }
}
