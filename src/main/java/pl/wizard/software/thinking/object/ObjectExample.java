package pl.wizard.software.thinking.object;

public class ObjectExample {

    public static void main(String[] aArg) {
        Menu menu = new Menu();
        BurgerChooser burgerChooser = new BurgerChooser();
        BillsManager billsManager= new BillsManager();



        menu.show();
        TrueBurger orderedBurger = burgerChooser.choose(menu);
        billsManager.showBill(orderedBurger);
    }
}
