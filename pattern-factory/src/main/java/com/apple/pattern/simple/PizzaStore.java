package com.apple.pattern.simple;

import com.apple.pattern.simple.factory.SimplePizzaFactory;
import com.apple.pattern.simple.product.Pizza;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        return pizza.prepare().bake().cut().box();
    }
}
