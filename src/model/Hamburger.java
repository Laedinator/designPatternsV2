package model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 * defines the Hamburger
 **/
public class Hamburger extends AbstractHamburger {

    @Override
    public double cost() {
        return 5.0;
    }

    @Override
    public String ingredients() {
        return "Basic Hamburger";
    }
}
