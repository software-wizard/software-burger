package pl.wizard.software;

public class BurgerMenu extends AbstractMenu<AbstractBurger> {

    public final static String WHEAT = "Wheat";
    public final static String SWEET_HONEY = "Sweet Honey";

    public BurgerMenu(String aMenuType) {
        AbstractBurgerFactory factory = null;
        if (aMenuType.equals(WHEAT)) {
            factory = new WheatBurgerFactory();
        } else if (aMenuType.equals(SWEET_HONEY)) {
            factory = new SweetHoneyBurgerFactory();
        }

        add(factory.prepareBurger(AbstractBurgerFactory.CLASSIC));
        add(factory.prepareBurger(AbstractBurgerFactory.COWBOY));
        add(factory.prepareBurger(AbstractBurgerFactory.ORIENTAL));
        add(factory.prepareBurger(AbstractBurgerFactory.SPICE));
        add(factory.prepareBurger(AbstractBurgerFactory.CHEESY));
    }

    @Override
    protected void showMenuName() {
        System.out.println("BURGER MENU");
        System.out.println("WYBIERZ BURGERA:");
    }
}
