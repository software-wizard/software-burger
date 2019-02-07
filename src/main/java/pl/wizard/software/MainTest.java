package pl.wizard.software;

import java.util.*;

import static pl.wizard.software.Product.*;

public class MainTest {

    public static void main(String[] aArg) {
        Scanner sc = new Scanner(System.in);

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
        menu.add(classicBurger);
        menu.add(cowboyBurger);
        menu.add(orientalBurger);
        menu.add(cheeseBurger);
        menu.add(spiceBurger);

        System.out.println("BURGER MENU");
        System.out.println("WYBIERZ BURGERA:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println();
            System.out.println(i + 1 + ". " + menu.get(i).getPrice() + " " + menu.get(i));
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

        List<String> additionList = new ArrayList<>();
        int opt2;
        double additionsPrice = 0.0;
        do {
            System.out.println("Czy życzysz sobie coś do niego dołożyć? Jakiś bekon, pomidor czy serek?");
            System.out.println("1. Nie jest spoko, zamawiam");
            System.out.println("2. 1.00 " + TOMATO);
            System.out.println("3. 0.40 " + RUCOLA);
            System.out.println("4. 1.00 " + EGG);
            System.out.println("5. 0.80 " + CHEESE);
            System.out.println("6. 1.50 " + BECON);

            opt2 = sc.nextInt();
            switch (opt2) {
                case 1:
                    break;
                case 2:
                    additionList.add(TOMATO.name());
                    additionsPrice += 1.00;
                    break;
                case 3:
                    additionList.add(RUCOLA.name());
                    additionsPrice += 0.40;
                    break;
                case 4:
                    additionList.add(EGG.name());
                    additionsPrice += 1.00;
                    break;
                case 5:
                    additionList.add(CHEESE.name());
                    additionsPrice += 0.80;
                    break;
                case 6:
                    additionList.add(BECON.name());
                    additionsPrice += 1.50;
                    break;
                default:
                    System.out.println("Wybrano niepoprawną opcje");
                    break;
            }

        } while (opt2 != 1);

        if (additionList.isEmpty()) {
            System.out.println("Zamówiłeś burger " + orderedBurger);
        } else {
            StringBuilder sb = new StringBuilder("Zamówiłeś burger " + orderedBurger + System.getProperty("line.separator") + " wybrane dodatki to: ");
            additionList.forEach(a -> {
                sb.append(a);
                sb.append(", ");
            });
            sb.append(" do zapłaty: " + (orderedBurger.getPrice() + additionsPrice));
            System.out.println(sb.toString());
        }
    }
}
