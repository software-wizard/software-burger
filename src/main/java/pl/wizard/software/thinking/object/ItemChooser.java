package pl.wizard.software.thinking.object;

import java.util.Scanner;

class ItemChooser {

    ItemChooser() {
    }

    Item choose(Menu aMenu) {
        Scanner sc = new Scanner(System.in);
        int opt;
        Item orderedBurger = null;
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
}
