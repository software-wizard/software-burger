package pl.wizard.software.thinking.object;

import java.util.ArrayList;
import java.util.List;

class TrueBurger implements Item{

    private final String name;
    private final List<Product> products;
    private final double price;

    TrueBurger(String name, double price) {
        this.name = name;
        this.products = new ArrayList<>();
        this.price = price;
    }

    void addProduct(Product aProduct) {
        products.add(aProduct);
    }

    private String getProductsAsString() {
        return prepareStringFromArray(products);
    }

    public double getPrice() {
        return price;
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
