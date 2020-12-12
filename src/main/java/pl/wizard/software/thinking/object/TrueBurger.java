package pl.wizard.software.thinking.object;

import java.util.ArrayList;
import java.util.List;

class TrueBurger {

    private final String name;
    private final List<Product> products;
    private final double price;
    private final List<Product> additionalProducts;

    TrueBurger(String name, double price) {
        this.name = name;
        this.products = new ArrayList<>();
        this.price = price;
        additionalProducts = new ArrayList<>();
    }

    void addProduct(Product aProduct) {
        products.add(aProduct);
    }

    void addAdditional(Product aAdditional) {
        additionalProducts.add(aAdditional);
    }

    String getName() {
        return name;
    }

    String getProductsAsString() {
        return prepareStringFromArray(products);
    }

    String getAdditionalsAsString() {
        return prepareStringFromArray(additionalProducts);
    }

    double getPrice() {
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
