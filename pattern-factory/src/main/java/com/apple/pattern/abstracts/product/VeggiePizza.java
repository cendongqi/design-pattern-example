package com.apple.pattern.abstracts.product;

import com.apple.pattern.abstracts.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public Pizza prepare() {
        System.out.println("prepare VeggiePizza ...");
        return this;
    }

    @Override
    public Pizza bake() {
        System.out.println("bake VeggiePizza ...");
        return this;
    }

    @Override
    public Pizza cut() {
        System.out.println("cut VeggiePizza ...");
        return this;
    }

    @Override
    public Pizza box() {
        System.out.println("box VeggiePizza ...");
        return this;
    }
}
