package model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 **/
public class HamDecorator extends AbstractPizza {

    protected AbstractPizza pizza;

    public HamDecorator(AbstractPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 0.5;
    }

    @Override
    public String ingredients() {
        return this.pizza.ingredients() + ", Ham";
    }

    @Override
    public String allergies() {
        return this.pizza.allergies();
    }
}
