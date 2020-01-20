package com.apple.pattern.method.factory;

import com.apple.pattern.method.PizzaStore;
import com.apple.pattern.method.product.NYStyleCheesePizza;
import com.apple.pattern.method.product.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new NYStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            // todo
        } else if ("clam".equals(type)) {
            // todo
        } else if ("pepperoni".equals(type)) {
            // todo
        }
        return pizza;
    }
}
