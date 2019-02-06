package pl.wizard.software;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        System.out.println("BURGER MENU");
        System.out.println("WYBIERZ BURGERA:");
        System.out.println();
        System.out.println("1." +  classicBurger.getPrice() + " " + classicBurger.getName() + System.getProperty("line.separator") + classicBurger.getProductsAsString() );
        System.out.println();
        System.out.println("2. " +  cowboyBurger.getPrice() + " " + cowboyBurger.getName() + System.getProperty("line.separator") + cowboyBurger.getProductsAsString() );
        System.out.println();
        System.out.println("3. " +  orientalBurger.getPrice() + " " + orientalBurger.getName() + System.getProperty("line.separator") + orientalBurger.getProductsAsString() );
        System.out.println();
        System.out.println("4. " +  cheeseBurger.getPrice() + " " + cheeseBurger.getName() + System.getProperty("line.separator") + cheeseBurger.getProductsAsString() );
        System.out.println();
        System.out.println("5. " +  spiceBurger.getPrice() + " " + spiceBurger.getName() + System.getProperty("line.separator") + spiceBurger.getProductsAsString() );

        int opt;
        double price = 0.0;

        String orderedBurger = null;
        while (orderedBurger == null) {
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    orderedBurger = classicBurger.getName() + System.getProperty("line.separator") + classicBurger.getProductsAsString();
                    price = classicBurger.getPrice();
                    break;
                case 2:
                    orderedBurger = cowboyBurger.getPrice() + " " + cowboyBurger.getName() + System.getProperty("line.separator") + cowboyBurger.getProductsAsString();
                    price = cowboyBurger.getPrice();
                    break;
                case 3:
                    orderedBurger = orientalBurger.getPrice() + " " + orientalBurger.getName() + System.getProperty("line.separator") + orientalBurger.getProductsAsString();
                    price = orientalBurger.getPrice();
                    break;
                case 4:
                    orderedBurger = cheeseBurger.getPrice() + " " + cheeseBurger.getName() + System.getProperty("line.separator") + cheeseBurger.getProductsAsString();
                    price = cheeseBurger.getPrice();
                    break;
                case 5:
                    orderedBurger = spiceBurger.getPrice() + " " + spiceBurger.getName() + System.getProperty("line.separator") + spiceBurger.getProductsAsString();
                    price = spiceBurger.getPrice();
                    break;
                default:
                    System.out.println("Wybrano niepoprawną opcje");
                    break;
            }
        }

        List<String> additionList = new ArrayList<>();
        int opt2;
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
                    additionList.add(TOMATO);
                    price += 1.00;
                    break;
                case 3:
                    additionList.add(RUCOLA);
                    price += 0.40;
                    break;
                case 4:
                    additionList.add(EGG);
                    price += 1.00;
                    break;
                case 5:
                    additionList.add(CHEESE);
                    price += 0.80;
                    break;
                case 6:
                    additionList.add(BECON);
                    price += 1.50;
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
            sb.append(" do zapłaty: " + price);
            System.out.println(sb.toString());
        }
    }
}
