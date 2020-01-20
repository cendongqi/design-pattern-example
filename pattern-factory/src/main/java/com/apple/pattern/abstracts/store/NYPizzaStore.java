package com.apple.pattern.abstracts.store;

import com.apple.pattern.abstracts.PizzaIngredientFactory;
import com.apple.pattern.abstracts.PizzaStore;
import com.apple.pattern.abstracts.factory.NYPizzaIngredientFactory;
import com.apple.pattern.abstracts.product.CheesePizza;
import com.apple.pattern.abstracts.product.ClamPizza;
import com.apple.pattern.abstracts.product.Pizza;
import com.apple.pattern.abstracts.product.VeggiePizza;
import com.apple.pattern.abstracts.product.PepperoniPizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        //使用纽约的原料工厂
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
