package pl.wizard.software.thinking.function;

public class Burger {

    private final String name;
    private final String description;
    private final double price;

    public Burger(String name, String aDescription, double price) {
        this.name = name;
        this.description = aDescription;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

}
