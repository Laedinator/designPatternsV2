package model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 * defines the Pizza
 **/
public abstract class AbstractPizza {

    public abstract double cost();

    public abstract String ingredients();

    public abstract String allergies();
}
