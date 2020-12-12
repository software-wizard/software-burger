package pl.wizard.software.thinking.object;

public class ObjectExample {

    public static void main(String[] aArg) {
//        AbstractItemFactory factory = new BurgerFactory();
        AbstractItemFactory factory = new DrinkFactory();
        Menu menu = new Menu(factory);


        ItemChooser itemChooser = new ItemChooser();
        BillsManager billsManager= new BillsManager();



        menu.show();
        Item orderedItem = itemChooser.choose(menu);
        billsManager.showBill(orderedItem);
    }
}
