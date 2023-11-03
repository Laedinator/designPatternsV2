package model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 * Defines the Pizza
 **/
public class Pizza extends AbstractPizza {
    @Override
    public double cost() {
        return 8.0;
    }

    @Override
    public String ingredients() {
        return "Pizza with Tomato sauce and Oregano";
    }

    @Override
    public String allergies() {
        return "Gluten";
    }
}
