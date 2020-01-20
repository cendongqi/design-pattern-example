package com.apple.pattern.method.factory;

import com.apple.pattern.method.PizzaStore;
import com.apple.pattern.method.product.ChicagoStyleCheesePizza;
import com.apple.pattern.method.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
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
