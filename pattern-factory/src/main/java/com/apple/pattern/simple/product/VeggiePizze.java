package com.apple.pattern.simple.product;

public class VeggiePizze extends Pizza {
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
