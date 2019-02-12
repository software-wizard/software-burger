package pl.wizard.software;

public class DrinkMenu extends AbstractMenu<Drink>{

    DrinkMenu(){
        add(new Drink("Cola", 3.20));
        add(new Drink("Sprite", 3.20));
        add(new Drink("Fanta", 3.20));
        add(new Drink("Woda", 0.0));
    }

    @Override
    protected void showMenuName() {
        System.out.println("Menu napojów");
        System.out.println("Wybierz napój");
    }
}
