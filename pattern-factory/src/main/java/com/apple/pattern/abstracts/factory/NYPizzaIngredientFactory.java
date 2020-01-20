package com.apple.pattern.abstracts.factory;

import com.apple.pattern.abstracts.PizzaIngredientFactory;
import com.apple.pattern.abstracts.ingredient.*;
import com.apple.pattern.abstracts.ingredient.impl.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RefPepper()};
        return veggies;
    }
}
