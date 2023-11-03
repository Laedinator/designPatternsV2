package model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 **/
public class SalamiDecorator extends AbstractPizza {

    protected AbstractPizza pizza;

    public SalamiDecorator(AbstractPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 0.7;
    }

    @Override
    public String ingredients() {
        return this.pizza.ingredients() + ", Salami";
    }

    @Override
    public String allergies() {
        return this.pizza.allergies();
    }
}
