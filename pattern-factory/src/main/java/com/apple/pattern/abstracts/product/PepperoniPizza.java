package com.apple.pattern.abstracts.product;

import com.apple.pattern.abstracts.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public Pizza prepare() {
        System.out.println("prepare PepperoniPizza ...");
        return this;
    }

    @Override
    public Pizza bake() {
        System.out.println("bake PepperoniPizza ...");
        return this;
    }

    @Override
    public Pizza cut() {
        System.out.println("cut PepperoniPizza ...");
        return this;
    }

    @Override
    public Pizza box() {
        System.out.println("box PepperoniPizza ...");
        return this;
    }
}
