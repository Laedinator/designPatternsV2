package model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 **/
public class OnionDecorator extends AbstractHamburger {

    protected AbstractHamburger hamburger;

    public OnionDecorator(AbstractHamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public double cost() {
        return this.hamburger.cost() + 0.5;
    }

    @Override
    public String ingredients() {
        return this.hamburger.ingredients() + ", Onion";
    }
}
