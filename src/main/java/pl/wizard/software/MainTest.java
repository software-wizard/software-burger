package pl.wizard.software;

import java.util.*;

import static pl.wizard.software.Product.*;

public class MainTest {

    public static void main(String[] aArg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wybierz rodzaj bułki:");
        System.out.println("1. Pszenna");
        System.out.println("2. Miodowa");

        AbstractMenu burgerMenu = null;
        int roolTypeFromUser = sc.nextInt();
        switch (roolTypeFromUser){
            case 1:
                burgerMenu = new BurgerMenu(BurgerMenu.WHEAT);
                break;
            case 2:
                burgerMenu = new BurgerMenu(BurgerMenu.WHEAT);
                break;
            default:
                throw new IllegalArgumentException("Wybrano niepoprawną opcje");
        }

        burgerMenu.showMenu();
        int opt;
        AbstractBurger orderedBurger = null;
        while (orderedBurger == null) {
            opt = sc.nextInt();
            if (opt < 1 || opt > 5) {
                System.out.println("Wybrano niepoprawną opcje");
            } else {
                orderedBurger = burgerMenu.get(opt - 1);
            }
        }

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
                    orderedBurger.addAdditional(TOMATO);
                    break;
                case 3:
                    orderedBurger.addAdditional(RUCOLA);
                    break;
                case 4:
                    orderedBurger.addAdditional(EGG);
                    break;
                case 5:
                    orderedBurger.addAdditional(CHEESE);
                    break;
                case 6:
                    orderedBurger.addAdditional(BECON);
                    break;
                default:
                    System.out.println("Wybrano niepoprawną opcje");
                    break;
            }

        } while (opt2 != 1);

        System.out.println("Zamówiłeś burger " + orderedBurger);
        System.out.println("wybrane dodatki to: " + orderedBurger.getAdditionalsAsString());
        System.out.println("do zapłaty: " + orderedBurger.getPrice());
    }
}
