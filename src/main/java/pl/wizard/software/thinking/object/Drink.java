package pl.wizard.software.thinking.object;

public enum Drink implements Item{
    SODA("Soda", 1.00),
    COLA("Cola", 2.00),
    SPRITE("Sprite", 2.00),
    FANTA("Fanta", 2.00);

    private final String drinkName;
    private final double price;

    private Drink(String aName, double aPrice) {
        this.drinkName = aName;
        this.price = aPrice;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return drinkName;
    }
}
