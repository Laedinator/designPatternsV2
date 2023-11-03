package controller;

import model.*;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 * launches the decorator app.
 **/

public class DecoratorApp {
    public static void main(String[] args) {
        AbstractPizza pizza = new Pizza();
        AbstractPizza hamDecorator = new HamDecorator(pizza);
        AbstractPizza salamiDecorator = new SalamiDecorator(hamDecorator);
        AbstractPizza pineappleDecorator = new PineappleDecorator(salamiDecorator);

        System.out.printf("Pizza - Cost: %.2f€ - Ingredients: %s - Allergies: %s\n", pineappleDecorator.cost(), pineappleDecorator.ingredients(), pineappleDecorator.allergies());

        AbstractHamburger hamburger = new Hamburger();
        AbstractHamburger cheddarDecorator = new CheddarDecorator(hamburger);
        AbstractHamburger onionDecorator = new OnionDecorator(cheddarDecorator);

        System.out.println("Hamburger - Cost: " + onionDecorator.cost() + "€ - Ingredients: " + onionDecorator.ingredients());

    }
}
