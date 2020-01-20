package com.apple.pattern.abstracts;

import com.apple.pattern.abstracts.product.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare().bake().cut().box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
