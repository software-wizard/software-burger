package pl.wizard.software;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static pl.wizard.software.Product.*;

public class MainTest {

    public static void main(String[] aArg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BURGER MENU");
        System.out.println("WYBIERZ BURGERA:");
        System.out.println();
        System.out.println("1. 16.90 Klasyczny" + System.getProperty("line.separator") + Product.MEAT + " " + SALAT + " " + TOMATO + " " + SAUCE);
        System.out.println();
        System.out.println("2. 21.90 Kowbojski" + System.getProperty("line.separator") + MEAT + " " + ONION + " " + TOMATO + " " + SAUCE + " " + CUCUMBER);
        System.out.println();
        System.out.println("3. 20.90 Orientalny" + System.getProperty("line.separator") + MEAT + " " + BAMBOO + " " + PINEAPPLE + " " + SAUCE);
        System.out.println();
        System.out.println("4. 19.90 Serowy" + System.getProperty("line.separator") + MEAT + " " + SALAT + " " + TOMATO + " " + CHEESE);
        System.out.println();
        System.out.println("5. 18.90 Ostry" + "ostry" + System.getProperty("line.separator") + MEAT + " " + JALAPENO + " " + TOMATO + " " + SAUCE);

        int opt;
        double price = 0.0;

        String orderedBurger = null;
        while (orderedBurger == null) {
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    orderedBurger = "klasyczny" + System.getProperty("line.separator") + Product.MEAT + " " + SALAT + " " + TOMATO + " " + SAUCE;
                    price = 16.90;
                    break;
                case 2:
                    orderedBurger = "kowbojski" + System.getProperty("line.separator") + MEAT + " " + ONION + " " + TOMATO + " " + SAUCE + " " + CUCUMBER;
                    price = 21.90;
                    break;
                case 3:
                    orderedBurger = "orientalny" + System.getProperty("line.separator") + MEAT + " " + BAMBOO + " " + PINEAPPLE + " " + SAUCE;
                    price = 20.90;
                    break;
                case 4:
                    orderedBurger = "serowy" + System.getProperty("line.separator") + MEAT + " " + SALAT + " " + TOMATO + " " + CHEESE;
                    price = 19.90;
                    break;
                case 5:
                    orderedBurger = "ostry" + System.getProperty("line.separator") + MEAT + " " + JALAPENO + " " + TOMATO + " " + SAUCE;
                    price = 18.90;
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
