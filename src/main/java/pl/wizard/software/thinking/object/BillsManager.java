package pl.wizard.software.thinking.object;


public class BillsManager {
    void showBill(TrueBurger aOrderedBurger) {
        System.out.println("Zamówiłeś burger " + aOrderedBurger + System.lineSeparator() + "do zapłaty: " + aOrderedBurger.getPrice());
    }
}
