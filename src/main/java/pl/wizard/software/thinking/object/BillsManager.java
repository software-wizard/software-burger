package pl.wizard.software.thinking.object;


public class BillsManager {
    void showBill(Item aItem) {
        System.out.println("Zamówiłeś " + aItem + System.lineSeparator() + "do zapłaty: " + aItem.getPrice());
    }
}
