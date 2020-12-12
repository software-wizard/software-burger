package pl.wizard.software.thinking.procedure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcedureExample {

    private static double orderPrice;
    private static String orderDesc;
    private static String orderName;

    public static void main(String[] aArg) {
        List<String> menuNames = new ArrayList<>();
        List<String> menuDesc = new ArrayList<>();
        List<Double> menuPrice = new ArrayList<>();
        prepareMenu(menuNames, menuDesc, menuPrice);
        showMenu(menuNames, menuDesc, menuPrice);
        choseBurger(menuNames, menuDesc, menuPrice);
        showBill();
    }

    private static void prepareMenu(List<String> aMenuNames, List<String> aMenuDesc, List<Double> aMenuPrice) {
        aMenuNames.add("Klasyczny");
        aMenuDesc.add("Sos, Mięsko, Sałata, Pomidor");
        aMenuPrice.add(16.90);

        aMenuNames.add("Kowbojski");
        aMenuDesc.add("Sos, Mięsko, Bambus, Ananas");
        aMenuPrice.add(21.90);

        aMenuNames.add("Orientalny");
        aMenuDesc.add("Sos, Mięsko, Bambus, Ananas");
        aMenuPrice.add(20.90);

        aMenuNames.add("Serowy");
        aMenuDesc.add("Sos, Mięsko, Ser, Pomidor");
        aMenuPrice.add(19.90);

        aMenuNames.add("ostry");
        aMenuDesc.add("Sos ostry, Mięsko, Sałata, Pomidor");
        aMenuPrice.add(19.90);
    }

    private static void showMenu(List<String> aMenuNames, List<String> aMenuDesc, List<Double> aMenuPrice) {
        System.out.println("BURGER MENU");
        System.out.println("WYBIERZ BURGERA:");
        for (int i = 0; i < aMenuNames.size(); i++) {
            System.out.println(i + 1 + ". " + aMenuPrice.get(i) + " " + aMenuNames.get(i) + System.lineSeparator() + aMenuDesc.get(i));
            System.out.println();
        }
    }

    private static void choseBurger(List<String> aMenuNames, List<String> aMenuDesc, List<Double> aMenuPrice) {
        Scanner sc = new Scanner(System.in);
        int opt;
        while (orderName == null) {
            opt = sc.nextInt();
            if (opt < 1 || opt > 5) {
                System.out.println("Wybrano niepoprawną opcje");
            } else {
                orderName = aMenuNames.get(opt);
                orderDesc = aMenuDesc.get(opt);
                orderPrice = aMenuPrice.get(opt);
            }
        }
    }

    private static void showBill() {
        System.out.println("Zamówiłeś burger " + orderName + System.lineSeparator() + orderDesc + System.lineSeparator() + "do zapłaty: " + orderPrice);
    }

}
