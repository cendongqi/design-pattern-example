package com.apple.pattern.method.product;

import java.util.ArrayList;
import java.util.List;

/**
 * 子类可以覆盖制作流程
 */
public abstract class Pizza {
    protected String name;        //名称
    protected String dough;       //面团
    protected String sause;       //酱料
    protected List<String> toppings = new ArrayList<String>();       //佐料

    public Pizza prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough");
        System.out.println("Adding sause");
        System.out.println("Adding toppings");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
        return this;
    }

    public Pizza bake() {
        System.out.println("Bake for 25 minutes at 350");
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
}
