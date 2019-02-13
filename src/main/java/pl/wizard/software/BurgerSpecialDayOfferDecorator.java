package pl.wizard.software;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class BurgerSpecialDayOfferDecorator extends AbstractBurger {

    private final AbstractBurger decorated;
    private final DayOfWeek specialOfferDay;

    public BurgerSpecialDayOfferDecorator(AbstractBurger aBurger, DayOfWeek aSpecialOfferDay) {
        super(aBurger.getName(), aBurger.getPrice());
        decorated = aBurger;
        specialOfferDay = aSpecialOfferDay;
    }

    @Override
    public String toString() {
        if(specialOfferDay.equals(LocalDate.now().getDayOfWeek())){
            return "!SPECJALNA OFERTA DNIA! " + decorated.toString();
        }
        return decorated.toString();
    }

    @Override
    public double getPrice() {
        if(specialOfferDay.equals(LocalDate.now().getDayOfWeek())){
            return decorated.getPrice()*0.9;
        }
        return decorated.getPrice();
    }

    @Override
    public void addProduct(Product aProduct) {
        decorated.addProduct(aProduct);
    }

    @Override
    public void addAdditional(Product aAdditional) {
        decorated.addAdditional(aAdditional);
    }

    @Override
    public String getName() {
        return decorated.getName();
    }

    @Override
    public String getProductsAsString() {
        return decorated.getProductsAsString();
    }

    @Override
    public String getAdditionalsAsString() {
        return decorated.getAdditionalsAsString();
    }
}
