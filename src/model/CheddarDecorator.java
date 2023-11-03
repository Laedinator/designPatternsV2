package model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 **/
public class CheddarDecorator extends AbstractHamburger {

    protected AbstractHamburger hamburger;

    public CheddarDecorator(AbstractHamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public double cost() {
        return this.hamburger.cost() + 1.0;
    }

    @Override
    public String ingredients() {
        return this.hamburger.ingredients() + ", Cheddar";
    }
}
