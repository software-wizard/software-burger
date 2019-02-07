package pl.wizard.software;

import java.util.ArrayList;
import java.util.List;

public class Burger {

    private final String name;
    private final List<Product> products;
    private final double price;
    private final List<Product> additionalProducts;

    public Burger(String name, double price) {
        this.name = name;
        this.products = new ArrayList<>();
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

    public double getPrice() {
        return price + additionalProducts.stream().mapToDouble(Product::getPrice).sum();
    }

    @Override
    public String toString() {
        return name + System.getProperty("line.separator") + getProductsAsString();
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
