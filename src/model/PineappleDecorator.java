package model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 **/
public class PineappleDecorator extends AbstractPizza {

    protected AbstractPizza pizza;

    public PineappleDecorator(AbstractPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 1.5;
    }

    @Override
    public String ingredients() {
        return this.pizza.ingredients() + ", Pineapple";
    }

    @Override
    public String allergies() {
        return this.pizza.allergies();
    }
}
