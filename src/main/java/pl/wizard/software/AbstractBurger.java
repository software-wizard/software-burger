package pl.wizard.software;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBurger implements Meal{
    private final String name;
    private final List<Product> products;
    private final double price;
    private final List<Product> additionalProducts;

    public AbstractBurger(String name, double price) {
        this.products = new ArrayList<>();
        this.name = name;
        this.price = price;
        additionalProducts = new ArrayList<>();
    }

    public void addProduct(Product aProduct) {
        products.add(aProduct);
    }

    public void addAdditional(Product aAdditional) {
        additionalProducts.add(aAdditional);
    }

    public String getName() {
        return name;
    }

    public String getProductsAsString() {
        return prepareStringFromArray(products);
    }

    public String getAdditionalsAsString() {
        return prepareStringFromArray(additionalProducts);
    }

    @Override
    public double getPrice() {
        double finalPrice = price;
        if(LocalDate.now().getDayOfWeek().equals(DayOfWeek.WEDNESDAY)){
            finalPrice = 0.9 * finalPrice;
        }

        return finalPrice + additionalProducts.stream().mapToDouble(Product::getPrice).sum();
    }

    private String prepareStringFromArray(List<Product> additionalProducts) {
        StringBuilder sb = new StringBuilder();
        additionalProducts.stream().forEach(product -> {
            sb.append(product);
            sb.append(", ");
        });
        return sb.toString().isEmpty() ? sb.toString() : sb.toString().substring(0, sb.toString().length() - 2);
    }
}
