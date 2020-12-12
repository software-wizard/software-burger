package pl.wizard.software.thinking.object;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DrinkFactory extends AbstractItemFactory {
    @Override
    List<Item> createAllItems() {
        return Stream.of(Drink.values()).collect(Collectors.toList());
    }
}
