package com.apple.pattern.simple.product;

public class CheesePizza extends Pizza {
    @Override
    public Pizza prepare() {
        System.out.println("prepare CheesePizza ...");
        return this;
    }

    @Override
    public Pizza bake() {
        System.out.println("bake CheesePizza ...");
        return this;
    }

    @Override
    public Pizza cut() {
        System.out.println("cut CheesePizza ...");
        return this;
    }

    @Override
    public Pizza box() {
        System.out.println("box CheesePizza ...");
        return this;
    }
}
