package pl.wizard.software;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {

    public static void main(String[] aArg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BURGER MENU");
        System.out.println("WYBIERZ BURGERA:");
        System.out.println("1. 16.90 Klasyczny");
        System.out.println("2. 21.90 Kowbojski");
        System.out.println("3. 20.90 Orientalny");
        System.out.println("4. 19.90 Serowy");
        System.out.println("5. 18.90 Ostry");

        int opt;


        String orderedBurger = null;
        while (orderedBurger == null) {
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    orderedBurger = "klasyczny";
                    break;
                case 2:
                    orderedBurger = "kowbojski";
                    break;
                case 3:
                    orderedBurger = "orientalny";
                    break;
                case 4:
                    orderedBurger = "serowy";
                    break;
                case 5:
                    orderedBurger = "ostry";
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
            System.out.println("2. 1.00 Pomidor");
            System.out.println("3. 0.40 Rukola");
            System.out.println("4. 1.00 Jajko");
            System.out.println("5. 0.80 Ser");
            System.out.println("6. 1.50 Bekon");

            opt2 = sc.nextInt();
            switch (opt2) {
                case 1:
                    break;
                case 2:
                    additionList.add("pomidor");
                    break;
                case 3:
                    additionList.add("rukola");
                    break;
                case 4:
                    additionList.add("jajko");
                    break;
                case 5:
                    additionList.add("ser");
                    break;
                case 6:
                    additionList.add("bekon");
                    break;
                default:
                    System.out.println("Wybrano niepoprawną opcje");
                    break;
            }

        } while (opt2 != 1);

        if (additionList.isEmpty()) {
            System.out.println("Zamówiłeś burger " + orderedBurger);
        } else {
            StringBuilder sb = new StringBuilder("Zamówiłeś burger " + orderedBurger + " wybrane dodatki to: ");
            additionList.forEach(a -> {
                sb.append(a);
                sb.append(", ");
            });
            System.out.println(sb.toString());
        }
    }
}
