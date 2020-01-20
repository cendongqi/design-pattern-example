package com.apple.pattern.simple.product;

public class PepperoniPizza extends Pizza {
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
