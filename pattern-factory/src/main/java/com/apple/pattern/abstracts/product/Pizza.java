package com.apple.pattern.abstracts.product;

import com.apple.pattern.abstracts.ingredient.*;

public abstract class Pizza {
    /*
     * 每个披萨都持有一组在准备时会用到的原料
     */
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    /*
     * prepare()方法声明为抽象方法。在这个方法中，我们需要收集披萨所需要的原料，而这些原料都是来自原料工厂
     */
    public abstract Pizza prepare();

    public Pizza bake() {
        System.out.println("Bake for 25 munites at 350");
        return this;
    }

    public Pizza cut() {
        System.out.println("Cutting the pizza into diagonal slices");
        return this;
    }

    public Pizza box() {
        System.out.println("Place pizza in official PizzaStore box");
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
